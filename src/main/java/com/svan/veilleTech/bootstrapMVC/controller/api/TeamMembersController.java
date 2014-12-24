/**
 * 2014
 * 24 déc. 2014 16:13:55 
 * @author stephane stephane.gronowski@gmail.com
 */
package com.svan.veilleTech.bootstrapMVC.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.svan.veilleTech.bootstrapMVC.dto.TeamMemberDTO;
import com.svan.veilleTech.bootstrapMVC.service.TeamMemberService;

/**
 * 
 * 24 déc. 2014 16:13:55
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

}
