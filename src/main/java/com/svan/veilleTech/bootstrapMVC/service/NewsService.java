/**
 * 2014
 * 6 nov. 2014 22:27:12 
 * @author stephane stephane.gronowski@gmail.com
 */
package com.svan.veilleTech.bootstrapMVC.service;

import java.util.List;

import com.svan.veilleTech.bootstrapMVC.dto.NewsDTO;

/**
 * 
 * 6 nov. 2014 22:27:12
 * 
 * @author stephane stephane.gronowski@gmail.com
 * 
 */
public interface NewsService {

	/**
	 * Return the lasr news
	 * 
	 * @return
	 */
	public List<NewsDTO> getLastNews();
}
