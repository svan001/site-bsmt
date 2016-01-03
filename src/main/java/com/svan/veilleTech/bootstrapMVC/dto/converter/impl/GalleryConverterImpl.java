/**
 * 
 */
package com.svan.veilleTech.bootstrapMVC.dto.converter.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.svan.veilleTech.bootstrapMVC.domain.Gallery;
import com.svan.veilleTech.bootstrapMVC.dto.GalleryDTO;
import com.svan.veilleTech.bootstrapMVC.dto.converter.GalleryConverter;
import com.svan.veilleTech.bootstrapMVC.dto.converter.PictureConverter;
import com.svan.veilleTech.bootstrapMVC.dto.converter.common.AbstractConverter;

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
