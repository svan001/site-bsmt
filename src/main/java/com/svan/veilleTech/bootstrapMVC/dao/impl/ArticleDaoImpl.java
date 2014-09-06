/**
 * 
 */
package com.svan.veilleTech.bootstrapMVC.dao.impl;

import javax.persistence.EntityManager;

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
public class ArticleDaoImpl extends AbstractFwkDao<Article, Long> implements
		ArticleDao {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.svan.fwk.dao.AbstractFwkDao#getEntityManager()
	 */
	@Override
	protected EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return null;
	}

}
