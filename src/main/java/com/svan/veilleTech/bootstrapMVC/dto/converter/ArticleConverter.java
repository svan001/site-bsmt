/**
 * 
 */
package com.svan.veilleTech.bootstrapMVC.dto.converter;

import com.svan.fwk.dto.Converter;
import com.svan.veilleTech.bootstrapMVC.domain.Article;
import com.svan.veilleTech.bootstrapMVC.dto.ArticleDTO;

/**
 * Converter from {@link Article} to {@link ArticleDTO}
 * 
 * @author stephane 3 sept. 2014
 *
 */
public interface ArticleConverter extends Converter<Article, ArticleDTO> {

}
