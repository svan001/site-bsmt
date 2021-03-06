/**
 * 
 */
package com.svan.veille.site.bsmt.controller.api;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Calendar;
import java.util.GregorianCalendar;
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

import com.svan.veille.site.bsmt.dto.GalleryDTO;
import com.svan.veille.site.bsmt.service.GalleryService;

/**
 * @author stephane 3 janv. 2015
 * 
 */
@Controller
@RequestMapping("/api/gallery")
public class GalleryController {

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
	public void getPicture(@PathVariable Long idGallery, @PathVariable String pictureName,
			@RequestParam(required = false) String size, HttpServletResponse response) {
		// File
		File imgFile = galleryService.getPictureFile(idGallery, pictureName, size);

		// Cache
		Calendar expireDate = GregorianCalendar.getInstance();
		expireDate.add(Calendar.WEEK_OF_YEAR, 1);
		response.addDateHeader("Expires", expireDate.getTimeInMillis());

		response.addDateHeader("Last-Modified", imgFile.lastModified());

		// Content
		try {
			InputStream in = new FileInputStream(imgFile);
			IOUtils.copy(in, response.getOutputStream());
		} catch (Exception e) {
			LOGGER.error("Error get picture : gallery : " + idGallery + " ; picture : " + pictureName, e);
		}
	}
}
