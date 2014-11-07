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

import com.svan.veilleTech.bootstrapMVC.dto.NewsDTO;
import com.svan.veilleTech.bootstrapMVC.service.NewsService;

/**
 * 
 * 17 oct. 2014 23:37:42
 * 
 * @author stephane stephane.gronowski@gmail.com
 * 
 */
@Controller
public class TilesController {

	@Autowired
	private NewsService newsService;

	@RequestMapping(value = "index")
	public String index() {
		return "index";
	}

	@RequestMapping(value = "news")
	public ModelAndView news() {
		ModelAndView mav = new ModelAndView("news");

		List<NewsDTO> news = newsService.getLastNews();
		mav.addObject("listNews", news);

		return mav;
	}

	@RequestMapping(value = "members")
	public ModelAndView members() {
		ModelAndView mav = new ModelAndView("members");

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
