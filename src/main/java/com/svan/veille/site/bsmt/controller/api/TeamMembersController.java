/**
 * 2014
 * 24 dec. 2014 16:13:55 
 * @author stephane stephane.gronowski@gmail.com
 */
package com.svan.veille.site.bsmt.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.svan.veille.site.bsmt.dto.TeamMemberDTO;
import com.svan.veille.site.bsmt.service.TeamMemberService;

/**
 * 
 * 24 d�c. 2014 16:13:55
 * 
 * @author stephane stephane.gronowski@gmail.com
 * 
 */
@Controller
@RequestMapping("api/teamMember")
public class TeamMembersController {

	@Autowired
	private TeamMemberService teamMemberService;

	@RequestMapping(value = "", method = RequestMethod.GET)
	@ResponseBody
	public List<TeamMemberDTO> getAll() {
		return teamMemberService.getAllMembers();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	public TeamMemberDTO getById(@PathVariable Long id) {
		return teamMemberService.getById(id);
	}
}
