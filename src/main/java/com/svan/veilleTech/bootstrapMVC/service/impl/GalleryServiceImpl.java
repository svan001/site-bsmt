/**
 * 2014
 * 8 nov. 2014 19:38:13 
 * @author stephane stephane.gronowski@gmail.com
 */
package com.svan.veilleTech.bootstrapMVC.service.impl;

import java.util.List;

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

}
