/**
 * 
 */
package com.svan.veille.site.bsmt.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.svan.veille.site.bsmt.dao.GalleryDao;
import com.svan.veille.site.bsmt.dao.common.AbstractFwkDao;
import com.svan.veille.site.bsmt.domain.Gallery;

/**
 * Default Implementaion of {@link GalleryDao}
 * 
 * @author stephane 
 * 
 */
@Repository
public class GalleryDaoImpl extends AbstractFwkDao<Gallery, Long> implements GalleryDao {

	@PersistenceContext(unitName = "site-pu")
	private EntityManager entityManager;

	@Override
	protected EntityManager getEntityManager() {
		return entityManager;
	}
}
