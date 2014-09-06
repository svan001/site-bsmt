package com.svan.veilleTech.bootstrapMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/main")
public class MainController {

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public ModelAndView index() {
		return new ModelAndView("index");
	}

	@RequestMapping(value = "/bootstrap", method = RequestMethod.GET)
	public ModelAndView bootstrap() {
		return new ModelAndView("bootstrap");
	}

	
}
