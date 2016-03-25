/**
 *
 */
package com.github.hartorn.dd.webapp.model;

import java.io.Serializable;

import javax.persistence.EntityManager;

import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

/**
 * @author Hartorn
 *
 */
public class GenericDaoImpl<T, ID extends Serializable> extends SimpleJpaRepository<T, ID> implements GenericDao<T, ID> {

	/**
	 * Creates a new {@link SimpleJpaRepository} to manage objects of the given {@link JpaEntityInformation}.
	 *
	 * @param entityInformation
	 *            must not be {@literal null}.
	 * @param entityManager
	 *            must not be {@literal null}.
	 */
	public GenericDaoImpl(final JpaEntityInformation<T, ?> entityInformation, final EntityManager entityManager) {
		super(entityInformation, entityManager);
	}

	/**
	 * Creates a new {@link SimpleJpaRepository} to manage objects of the given domain type.
	 *
	 * @param domainClass
	 *            must not be {@literal null}.
	 * @param em
	 *            must not be {@literal null}.
	 */
	public GenericDaoImpl(final Class<T> domainClass, final EntityManager em) {
		super(domainClass, em);

	}
}
