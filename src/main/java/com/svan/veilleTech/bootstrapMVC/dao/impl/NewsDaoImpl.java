/**
 * 
 */
package com.svan.veilleTech.bootstrapMVC.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.svan.fwk.dao.AbstractFwkDao;
import com.svan.veilleTech.bootstrapMVC.dao.NewsDao;
import com.svan.veilleTech.bootstrapMVC.domain.News;

/**
 * Default Implementaion of {@link NewsDao}
 * 
 * @author stephane 6 nov. 2014
 * 
 */
@Repository
public class NewsDaoImpl extends AbstractFwkDao<News, Long> implements NewsDao {

	@PersistenceContext(unitName = "bootstrap-pu")
	private EntityManager entityManager;

	@Override
	protected EntityManager getEntityManager() {
		return entityManager;
	}

	@Override
	public List<News> getLastNews(int maxResult) {
		TypedQuery<News> query = entityManager.createNamedQuery(News.GET_LAST_NEWS, News.class);

		query.setMaxResults(maxResult);

		return query.getResultList();
	}

}
