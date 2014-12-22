/**
 * 2014
 * 13 d�c. 2014 22:08:29 
 * @author stephane stephane.gronowski@gmail.com
 */
package com.svan.veilleTech.bootstrapMVC.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.svan.veilleTech.bootstrapMVC.dto.NewsDTO;
import com.svan.veilleTech.bootstrapMVC.service.NewsService;

/**
 * 
 * 13 d�c. 2014 22:08:29
 * 
 * @author stephane stephane.gronowski@gmail.com
 * 
 */
@Controller
@RequestMapping("api/news")
public class NewsController {

	@Autowired
	private NewsService newsService;

	@RequestMapping(value = "", method = RequestMethod.GET)
	@ResponseBody
	public List<NewsDTO> getAll() {
		return newsService.getLastNews();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	public NewsDTO getById(@PathVariable Long id) {
		return newsService.getById(id);
	}

	@RequestMapping(value = "", method = RequestMethod.POST)
	@ResponseBody
	public NewsDTO addNews(@RequestBody NewsDTO newsDTO) {
		return newsService.addNews(newsDTO);
	}

}
