/**
 * 
 */
package com.svan.veille.site.bsmt.dto.converter;

import com.svan.veille.site.bsmt.domain.News;
import com.svan.veille.site.bsmt.dto.NewsDTO;
import com.svan.veille.site.bsmt.dto.converter.common.Converter;

/**
 * Converter from {@link News} to {@link NewsDTO}
 * 
 * @author stephane 6 Nov. 2014
 * 
 */
public interface NewsConverter extends Converter<News, NewsDTO> {

}
