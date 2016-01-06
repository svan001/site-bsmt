/**
 * 2014
 * 6 nov. 2014 22:28:16 
 * @author stephane stephane.gronowski@gmail.com
 */
package com.svan.veille.site.bsmt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.svan.veille.site.bsmt.dao.NewsDao;
import com.svan.veille.site.bsmt.domain.News;
import com.svan.veille.site.bsmt.dto.NewsDTO;
import com.svan.veille.site.bsmt.dto.converter.NewsConverter;
import com.svan.veille.site.bsmt.service.NewsService;

/**
 * 
 * 6 nov. 2014 22:28:16
 * 
 * @author stephane stephane.gronowski@gmail.com
 * 
 */
@Service
@Transactional
public class NewsServiceImpl implements NewsService {

	private static final int DEFAULT_GET_LAST_NEWS_MAX_RESULT = 20;

	@Autowired
	private NewsDao newsDao;

	@Autowired
	private NewsConverter converter;

	@Override
	public List<NewsDTO> getLastNews(Integer limit) {
		if (limit == null) {
			limit = DEFAULT_GET_LAST_NEWS_MAX_RESULT;
		}

		return converter.toDest(newsDao.getLastNews(limit));
	}

	@Override
	public NewsDTO addNews(NewsDTO newsDTO) {
		News news = new News();

		news.setTitle(newsDTO.getTitle());
		news.setAuthor(newsDTO.getAuthor());
		news.setContent(newsDTO.getContent());

		newsDao.persist(news);

		return converter.toDest(news);
	}

	@Override
	public NewsDTO getById(Long id) {
		return converter.toDest(newsDao.findByPk(id));
	}

}