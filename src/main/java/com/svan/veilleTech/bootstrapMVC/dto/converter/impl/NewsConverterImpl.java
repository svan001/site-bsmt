/**
 * 
 */
package com.svan.veilleTech.bootstrapMVC.dto.converter.impl;

import org.springframework.stereotype.Component;

import com.svan.fwk.dto.AbstractConverter;
import com.svan.veilleTech.bootstrapMVC.domain.News;
import com.svan.veilleTech.bootstrapMVC.dto.NewsDTO;
import com.svan.veilleTech.bootstrapMVC.dto.converter.NewsConverter;

/**
 * @author stephane 6 Nov. 2014
 * 
 */
@Component
public class NewsConverterImpl extends AbstractConverter<News, NewsDTO> implements NewsConverter {

	@Override
	public NewsDTO toDest(News entity) {
		NewsDTO dto = new NewsDTO();

		dto.setId(entity.getId());
		dto.setTitle(entity.getTitle());
		dto.setAuthor(entity.getAuthor());
		dto.setContent(entity.getContent());

		dto.setCreationDate(entity.getCreationDate());
		dto.setUpdateDate(entity.getUpdateDate());

		return dto;
	}

}
