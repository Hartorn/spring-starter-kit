/**
 *
 */
package com.github.hartorn.dd.webapp.model;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

/**
 * @author Hartorn
 *
 */
@NoRepositoryBean
public interface GenericDao<T, ID extends Serializable> extends JpaRepository<T, ID>, QuerydslPredicateExecutor<T> {

}
