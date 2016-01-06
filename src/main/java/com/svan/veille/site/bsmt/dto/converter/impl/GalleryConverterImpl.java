/**
 * 
 */
package com.svan.veille.site.bsmt.dto.converter.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.svan.veille.site.bsmt.domain.Gallery;
import com.svan.veille.site.bsmt.dto.GalleryDTO;
import com.svan.veille.site.bsmt.dto.converter.GalleryConverter;
import com.svan.veille.site.bsmt.dto.converter.PictureConverter;
import com.svan.veille.site.bsmt.dto.converter.common.AbstractConverter;

/**
 * @author stephane
 * 
 */
@Component
public class GalleryConverterImpl extends
		AbstractConverter<Gallery, GalleryDTO> implements GalleryConverter {

	@Autowired
	private PictureConverter pictureConverter;

	@Override
	public GalleryDTO toDest(Gallery entity) {
		GalleryDTO dto = new GalleryDTO();

		dto.setId(entity.getId());
		dto.setTitle(entity.getTitle());

		dto.setPictures(pictureConverter.toDest(entity.getPictures()));

		dto.setCreationDate(entity.getCreationDate());
		dto.setUpdateDate(entity.getUpdateDate());

		return dto;
	}

}
