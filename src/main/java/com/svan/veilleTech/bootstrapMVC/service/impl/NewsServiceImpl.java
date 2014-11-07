/**
 * 2014
 * 6 nov. 2014 22:28:16 
 * @author stephane stephane.gronowski@gmail.com
 */
package com.svan.veilleTech.bootstrapMVC.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.svan.fwk.service.AbstractService;
import com.svan.veilleTech.bootstrapMVC.dao.NewsDao;
import com.svan.veilleTech.bootstrapMVC.dto.NewsDTO;
import com.svan.veilleTech.bootstrapMVC.dto.converter.NewsConverter;
import com.svan.veilleTech.bootstrapMVC.service.NewsService;

/**
 * 
 * 6 nov. 2014 22:28:16
 * 
 * @author stephane stephane.gronowski@gmail.com
 * 
 */
@Service
@Transactional
public class NewsServiceImpl extends AbstractService implements NewsService {

	private static final int DEFAULT_GET_LAST_NEWS_MAX_RESULT = 10;

	@Autowired
	private NewsDao newsDao;

	@Autowired
	private NewsConverter converter;

	@Override
	public List<NewsDTO> getLastNews() {
		return converter.toDest(newsDao.getLastNews(DEFAULT_GET_LAST_NEWS_MAX_RESULT));
	}

}
