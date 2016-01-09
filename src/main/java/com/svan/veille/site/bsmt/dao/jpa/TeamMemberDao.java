/**
 * 
 */
package com.svan.veille.site.bsmt.dao.jpa;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.svan.veille.site.bsmt.domain.TeamMember;

/**
 * 
 * Repo des {@link TeamMember}. <br>
 * Migration vers spring data des repo (Issue 39)
 * 
 * @author stephane
 *
 */
public interface TeamMemberDao extends CrudRepository<TeamMember, Long> {

	List<TeamMember> findAll();

}
