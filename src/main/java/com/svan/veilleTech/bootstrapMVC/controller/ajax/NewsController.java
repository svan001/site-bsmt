/**
 * 2014
 * 13 déc. 2014 22:08:29 
 * @author stephane stephane.gronowski@gmail.com
 */
package com.svan.veilleTech.bootstrapMVC.controller.ajax;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.svan.veilleTech.bootstrapMVC.dto.NewsDTO;
import com.svan.veilleTech.bootstrapMVC.service.NewsService;

/**
 * 
 * 13 déc. 2014 22:08:29
 * 
 * @author stephane stephane.gronowski@gmail.com
 * 
 */
@Controller
@RequestMapping("ajax/news")
public class NewsController {

	@Autowired
	private NewsService newsService;

	@RequestMapping(value = "", method = RequestMethod.GET)
	@ResponseBody
	public List<NewsDTO> getAllNews() {
		return newsService.getLastNews();
	}

	@RequestMapping(value = "/{title}/{author}/{content}", method = RequestMethod.POST)
	@ResponseBody
	//public NewsDTO addNews(@RequestBody NewsDTO newsDTO) {
	public NewsDTO addNews(@PathVariable String title, @PathVariable String author, @PathVariable String content ) {
		NewsDTO newsDTO = new NewsDTO();
		newsDTO.setTitle(title);
		newsDTO.setAuthor(author);
		newsDTO.setContent(content);
		
		return newsService.addNews(newsDTO);
	}

}
