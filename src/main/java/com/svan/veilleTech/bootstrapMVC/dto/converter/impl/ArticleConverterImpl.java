/**
 * 
 */
package com.svan.veilleTech.bootstrapMVC.dto.converter.impl;

import com.svan.fwk.dto.AbstractConverter;
import com.svan.fwk.exception.NotImplementedYetException;
import com.svan.veilleTech.bootstrapMVC.domain.Article;
import com.svan.veilleTech.bootstrapMVC.dto.ArticleDTO;
import com.svan.veilleTech.bootstrapMVC.dto.converter.ArticleConverter;

/**
 * @author stephane 3 sept. 2014
 *
 */
public class ArticleConverterImpl extends
		AbstractConverter<Article, ArticleDTO> implements ArticleConverter {

	@Override
	public ArticleDTO toDest(Article entity) {
		// TODO Auto-generated method stub
		
		throw new NotImplementedYetException();
		
	}

}
