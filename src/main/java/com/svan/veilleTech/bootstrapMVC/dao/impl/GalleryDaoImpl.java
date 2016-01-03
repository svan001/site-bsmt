/**
 * 
 */
package com.svan.veilleTech.bootstrapMVC.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.svan.veilleTech.bootstrapMVC.dao.GalleryDao;
import com.svan.veilleTech.bootstrapMVC.dao.common.AbstractFwkDao;
import com.svan.veilleTech.bootstrapMVC.domain.Gallery;

/**
 * Default Implementaion of {@link GalleryDao}
 * 
 * @author stephane 
 * 
 */
@Repository
public class GalleryDaoImpl extends AbstractFwkDao<Gallery, Long> implements GalleryDao {

	@PersistenceContext(unitName = "bootstrap-pu")
	private EntityManager entityManager;

	@Override
	protected EntityManager getEntityManager() {
		return entityManager;
	}
}
