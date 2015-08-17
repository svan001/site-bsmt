/**
 * 
 */
package com.svan.veilleTech.bootstrapMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Main controller pour rediriger les url des ecran vers le point d'entree de la
 * SPA angular
 * 
 * @author stephane
 *
 */
@Controller
public class MainController {

	/* *************************************************************************
	 * Ajouter chaque "ecran" ici avec un retour sur "index.jsp" : évite les 404
	 * (même si elle renvoie déja vers index.jsp) et en espérant que cela aide
	 * pour le référencement...
	 * *************************************************************************
	 */

	@RequestMapping(value = { "/home", "/news", "/member/**", "/gallery/**",
			"/recrutement" }, method = RequestMethod.GET)
	public String home() {
		return "/index.jsp";
	}
}
