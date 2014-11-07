/**
 * 
 */
package com.svan.veilleTech.bootstrapMVC.dao;

import java.util.List;

import com.svan.fwk.dao.FwkDao;
import com.svan.veilleTech.bootstrapMVC.domain.Article;
import com.svan.veilleTech.bootstrapMVC.domain.News;

/**
 * Dao for {@link Article}
 * 
 * @author stephane 3 sept. 2014
 * 
 */
public interface NewsDao extends FwkDao<News, Long> {

	/**
	 * Return the last news
	 * 
	 * @param maxResult
	 * @return
	 */
	public List<News> getLastNews(int maxResult);
}
