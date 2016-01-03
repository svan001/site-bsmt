/**
 * 
 */
package com.svan.veilleTech.bootstrapMVC.dto.converter;

import com.svan.veilleTech.bootstrapMVC.domain.News;
import com.svan.veilleTech.bootstrapMVC.dto.NewsDTO;
import com.svan.veilleTech.bootstrapMVC.dto.converter.common.Converter;

/**
 * Converter from {@link News} to {@link NewsDTO}
 * 
 * @author stephane 6 Nov. 2014
 * 
 */
public interface NewsConverter extends Converter<News, NewsDTO> {

}
