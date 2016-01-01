/**
 * 2014
 * 8 nov. 2014 19:38:13 
 * @author stephane stephane.gronowski@gmail.com
 */
package com.svan.veilleTech.bootstrapMVC.service.impl;

import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

import org.apache.commons.io.filefilter.RegexFileFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.svan.fwk.service.AbstractService;
import com.svan.veilleTech.bootstrapMVC.dao.GalleryDao;
import com.svan.veilleTech.bootstrapMVC.dto.GalleryDTO;
import com.svan.veilleTech.bootstrapMVC.dto.converter.GalleryConverter;
import com.svan.veilleTech.bootstrapMVC.service.GalleryService;

/**
 * 
 * @author stephane stephane.gronowski@gmail.com
 * 
 */
@Service
@Transactional
public class GalleryServiceImpl extends AbstractService implements
		GalleryService {

	private static final String IMG_DIR = System.getProperty("IMG_DIR") != null ? System
			.getProperty("IMG_DIR") : "/var/www/img";

	private static final String DEFAULT_EXTENSION = "jpg";

	@Autowired
	private GalleryDao galleryDao;

	@Autowired
	private GalleryConverter converter;

	@Override
	public List<GalleryDTO> getAllGalleries() {
		return converter.toDest(galleryDao.findAll());
	}

	@Override
	public GalleryDTO getById(Long id) {
		return converter.toDest(galleryDao.findByPk(id));
	}

	@Override
	public InputStream getPictureStream(Long idGallery, String pictureName,
			String size) throws FileNotFoundException {
		// Cible : IMG_DIR / galleries / ID / SIZE / picture . * (défaut "jpg")
		String sizePath = size == null ? "" : size;

		File directory = new File(IMG_DIR + File.separatorChar + "galleries"
				+ File.separatorChar + idGallery + File.separatorChar
				+ sizePath);

		File imgFile = new File(directory, pictureName + "."
				+ DEFAULT_EXTENSION);

		// Gere le JPG par defaut, cherche autre extension si besoin
		if (!imgFile.exists()) {
			FileFilter filter = new RegexFileFilter(pictureName + "\\..*");
			imgFile = directory.listFiles(filter)[0];
		}

		return new FileInputStream(imgFile);
	}
}
