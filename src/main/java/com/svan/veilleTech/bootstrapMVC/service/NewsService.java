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
	 * Return the last news
	 * 
	 * @param limit
	 *            nb max de news
	 * @return
	 */
	public List<NewsDTO> getLastNews(Integer limit);

	/**
	 * Return the news
	 * 
	 * @param id
	 * @return the news or <code>null</code>
	 */
	public NewsDTO getById(Long id);

	/**
	 * Add a news
	 * 
	 * @param newsDTO
	 * @return
	 */
	public NewsDTO addNews(NewsDTO newsDTO);
}
