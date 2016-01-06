/**
 * 2014
 * 8 nov. 2014 19:37:29 
 * @author stephane stephane.gronowski@gmail.com
 */
package com.svan.veille.site.bsmt.service;

import java.util.List;

import com.svan.veille.site.bsmt.dto.TeamMemberDTO;

/**
 * 
 * 8 nov. 2014 19:37:29
 * 
 * @author stephane stephane.gronowski@gmail.com
 * 
 */
public interface TeamMemberService {

	/**
	 * Return all the members
	 * 
	 * @return
	 */
	public List<TeamMemberDTO> getAllMembers();

	/**
	 * Return the member by id
	 * 
	 * @param id
	 * @return
	 */
	public TeamMemberDTO getById(Long id);
}
