package com.github.hartorn.dd.webapp.configuration;

import javax.naming.NamingException;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.instrument.classloading.ReflectiveLoadTimeWeaver;
import org.springframework.jndi.JndiTemplate;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.github.hartorn.dd.webapp.model.ActionService;

/**
 * Configuration for JPA and DB access.
 *
 * @author Bazire
 *
 */
@Configuration
@EnableJpaRepositories(basePackageClasses = ActionService.class)
@EnableTransactionManagement
public class DdWebappJpaConfiguration {

    /**
     * Get the datasource for the application.
     *
     * @return the Datasource
     * @throws NamingException
     *             If the datasource is not found
     */
    @Bean
    public DataSource dataSource() throws NamingException {
        final JndiTemplate jndi = new JndiTemplate();
        //~ org.apache.tomcat.jdbc.pool.DataSourceFactory.class.getName();
        final DataSource dataSource = (DataSource) jndi.lookup("java:comp/env/jdbc/DungeonDb");
        return dataSource;
    }

    /**
     * Factory, with settings for JPA.
     *
     * @return the entity factory
     * @throws NamingException
     *             If the datasource is not found
     *
     */
    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() throws NamingException {
        final LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
        entityManagerFactoryBean.setDataSource(dataSource());
        final HibernateJpaVendorAdapter jpaAdapter = new HibernateJpaVendorAdapter();
        jpaAdapter.setDatabase(Database.POSTGRESQL);
        jpaAdapter.setShowSql(true);
        jpaAdapter.setGenerateDdl(false);
        entityManagerFactoryBean.setJpaVendorAdapter(jpaAdapter);
        // The packages to search for Entities, line required to avoid looking into the persistence.xml
        entityManagerFactoryBean.setPackagesToScan("com.github.hartorn.dd.webapp.model.generated");
        // required unless you know what your doing
        entityManagerFactoryBean.setLoadTimeWeaver(new ReflectiveLoadTimeWeaver());
        return entityManagerFactoryBean;
    }

    /**
     * Get the transaction manager, fully configured.
     *
     * @return the transaction manager
     * @throws NamingException
     *             If the datasource is not found
     */
    @Bean
    public JpaTransactionManager transactionManager() throws NamingException {
        final JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(entityManagerFactory().getObject());
        return transactionManager;
    }

}
