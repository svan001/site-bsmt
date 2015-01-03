/**
 * 
 */
package com.svan.veilleTech.bootstrapMVC.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.svan.veilleTech.bootstrapMVC.dto.GalleryDTO;
import com.svan.veilleTech.bootstrapMVC.service.GalleryService;

/**
 * @author stephane 3 janv. 2015
 *
 */
@Controller
@RequestMapping("/api/gallery")
public class GalleryController {

	@Autowired
	private GalleryService galleryService;

	@RequestMapping(value = "", method = RequestMethod.GET)
	@ResponseBody
	private List<GalleryDTO> getAll() {
		return galleryService.getAllGalleries();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	private GalleryDTO getById(@PathVariable Long id) {
		return galleryService.getById(id);
	}

}
