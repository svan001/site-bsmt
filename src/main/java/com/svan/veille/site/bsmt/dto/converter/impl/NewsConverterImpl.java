/**
 * 
 */
package com.svan.veille.site.bsmt.dto.converter.impl;

import org.springframework.stereotype.Component;

import com.svan.veille.site.bsmt.domain.News;
import com.svan.veille.site.bsmt.dto.NewsDTO;
import com.svan.veille.site.bsmt.dto.converter.NewsConverter;
import com.svan.veille.site.bsmt.dto.converter.common.AbstractConverter;

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
