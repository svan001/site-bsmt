/**
 * 
 */
package com.svan.veille.site.bsmt.dao;

import java.util.List;

import com.svan.veille.site.bsmt.dao.common.FwkDao;
import com.svan.veille.site.bsmt.domain.News;

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
