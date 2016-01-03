/**
 * 
 */
package com.svan.veilleTech.bootstrapMVC.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.svan.veilleTech.bootstrapMVC.dao.TeamMemberDao;
import com.svan.veilleTech.bootstrapMVC.dao.common.AbstractFwkDao;
import com.svan.veilleTech.bootstrapMVC.domain.TeamMember;

/**
 * Default Implementaion of {@link TeamMemberDao}
 * 
 * @author stephane 6 nov. 2014
 * 
 */
@Repository
public class TeamMemberDaoImpl extends AbstractFwkDao<TeamMember, Long> implements TeamMemberDao {

	@PersistenceContext(unitName = "bootstrap-pu")
	private EntityManager entityManager;

	@Override
	protected EntityManager getEntityManager() {
		return entityManager;
	}
}
