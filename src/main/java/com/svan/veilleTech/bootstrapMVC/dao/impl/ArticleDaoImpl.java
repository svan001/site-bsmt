/**
 * 
 */
package com.svan.veilleTech.bootstrapMVC.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.svan.fwk.dao.AbstractFwkDao;
import com.svan.veilleTech.bootstrapMVC.dao.ArticleDao;
import com.svan.veilleTech.bootstrapMVC.domain.Article;

/**
 * Default Implementaion of {@link ArticleDao}
 * 
 * @author stephane 3 sept. 2014
 * 
 */
@Repository
public class ArticleDaoImpl extends AbstractFwkDao<Article, Long> implements ArticleDao {

	@PersistenceContext(unitName = "bootstrap-pu")
	private EntityManager entityManager;

	@Override
	protected EntityManager getEntityManager() {
		return entityManager;
	}
	
	
	public Article getGenerationBy(String documentId) {
		TypedQuery<Article> query = entityManager.createNamedQuery(
				"", Article.class);

		query.setParameter("documentId", documentId);

		return singleResultOrNull(query);
	}
}
