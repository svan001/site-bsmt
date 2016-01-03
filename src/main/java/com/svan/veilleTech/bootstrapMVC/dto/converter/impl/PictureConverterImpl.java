/**
 * 
 */
package com.svan.veilleTech.bootstrapMVC.dto.converter.impl;

import org.springframework.stereotype.Component;

import com.svan.veilleTech.bootstrapMVC.domain.Picture;
import com.svan.veilleTech.bootstrapMVC.dto.PictureDTO;
import com.svan.veilleTech.bootstrapMVC.dto.converter.PictureConverter;
import com.svan.veilleTech.bootstrapMVC.dto.converter.common.AbstractConverter;

/**
 * @author stephane
 * 
 */
@Component
public class PictureConverterImpl extends AbstractConverter<Picture, PictureDTO> implements PictureConverter {

	@Override
	public PictureDTO toDest(Picture entity) {
		PictureDTO dto = new PictureDTO();

		dto.setId(entity.getId());
		dto.setTitle(entity.getTitle());

		dto.setCreationDate(entity.getCreationDate());
		dto.setUpdateDate(entity.getUpdateDate());

		return dto;
	}

}
