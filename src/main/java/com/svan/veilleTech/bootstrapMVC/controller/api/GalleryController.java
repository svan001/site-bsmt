/**
 * 
 */
package com.svan.veilleTech.bootstrapMVC.controller.api;

import java.io.InputStream;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.svan.fwk.controller.AbstractController;
import com.svan.veilleTech.bootstrapMVC.dto.GalleryDTO;
import com.svan.veilleTech.bootstrapMVC.service.GalleryService;

/**
 * @author stephane 3 janv. 2015
 * 
 */
@Controller
@RequestMapping("/api/gallery")
public class GalleryController extends AbstractController {

	private Logger LOGGER = Logger.getLogger(GalleryController.class);

	@Autowired
	private GalleryService galleryService;

	@RequestMapping(value = "", method = RequestMethod.GET)
	@ResponseBody
	public List<GalleryDTO> getAll() {
		return galleryService.getAllGalleries();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	public GalleryDTO getById(@PathVariable Long id) {
		return galleryService.getById(id);
	}

	@RequestMapping(value = "/{idGallery}/picture/{pictureName}", method = RequestMethod.GET)
	@ResponseBody
	public void getById(@PathVariable Long idGallery,
			@PathVariable String pictureName,
			@RequestParam(required = false) String size,
			HttpServletResponse response) {

		try {
			InputStream in = galleryService.getPictureStream(idGallery,
					pictureName, size);
			IOUtils.copy(in, response.getOutputStream());
		} catch (Exception e) {
			LOGGER.error("Error get picture", e);
		}
	}
}
