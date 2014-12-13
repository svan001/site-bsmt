/**
 * 2014
 * 17 oct. 2014 23:37:42 
 * @author stephane stephane.gronowski@gmail.com
 */
package com.svan.veilleTech.bootstrapMVC.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.svan.veilleTech.bootstrapMVC.dto.TeamMemberDTO;
import com.svan.veilleTech.bootstrapMVC.service.TeamMemberService;

/**
 * 
 * 17 oct. 2014 23:37:42
 * 
 * @author stephane stephane.gronowski@gmail.com
 * 
 */
@Controller
public class MainController {

	@Autowired
	private TeamMemberService teamMemberService;

	@RequestMapping(value = "index")
	public String index() {
		return "index";
	}

	@RequestMapping(value = "news")
	public String news() {
		return "news";
	}

	@RequestMapping(value = "members")
	public ModelAndView members() {
		ModelAndView mav = new ModelAndView("members");

		List<TeamMemberDTO> teamMembers = teamMemberService.getAllMembers();
		mav.addObject("teamMembers", teamMembers);

		return mav;
	}

	@RequestMapping(value = "galerie")
	public ModelAndView galerie() {
		ModelAndView mav = new ModelAndView("galerie");

		return mav;
	}

	@RequestMapping(value = "recrutement")
	public ModelAndView recrutement() {
		ModelAndView mav = new ModelAndView("recrutement");

		return mav;
	}

}
