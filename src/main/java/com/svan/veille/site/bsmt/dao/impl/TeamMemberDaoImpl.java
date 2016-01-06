/**
 * 
 */
package com.svan.veille.site.bsmt.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.svan.veille.site.bsmt.dao.TeamMemberDao;
import com.svan.veille.site.bsmt.dao.common.AbstractFwkDao;
import com.svan.veille.site.bsmt.domain.TeamMember;

/**
 * Default Implementaion of {@link TeamMemberDao}
 * 
 * @author stephane 6 nov. 2014
 * 
 */
@Repository
public class TeamMemberDaoImpl extends AbstractFwkDao<TeamMember, Long> implements TeamMemberDao {

	@PersistenceContext(unitName = "site-pu")
	private EntityManager entityManager;

	@Override
	protected EntityManager getEntityManager() {
		return entityManager;
	}
}
