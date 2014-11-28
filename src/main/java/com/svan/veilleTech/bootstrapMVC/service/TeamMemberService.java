/**
 * 2014
 * 8 nov. 2014 19:37:29 
 * @author stephane stephane.gronowski@gmail.com
 */
package com.svan.veilleTech.bootstrapMVC.service;

import java.util.List;

import com.svan.veilleTech.bootstrapMVC.dto.TeamMemberDTO;

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

}
