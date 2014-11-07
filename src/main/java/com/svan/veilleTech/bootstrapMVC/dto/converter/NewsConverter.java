/**
 * 
 */
package com.svan.veilleTech.bootstrapMVC.dto.converter;

import com.svan.fwk.dto.Converter;
import com.svan.veilleTech.bootstrapMVC.domain.News;
import com.svan.veilleTech.bootstrapMVC.dto.NewsDTO;

/**
 * Converter from {@link News} to {@link NewsDTO}
 * 
 * @author stephane 6 Nov. 2014
 * 
 */
public interface NewsConverter extends Converter<News, NewsDTO> {

}
