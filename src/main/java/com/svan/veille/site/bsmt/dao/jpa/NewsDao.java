/**
 * 
 */
package com.svan.veille.site.bsmt.dao.jpa;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import com.svan.veille.site.bsmt.domain.News;

/**
 * 
 * Repo des {@link News}. <br>
 * Migration vers spring data des repo (Issue 39)
 * 
 * @author stephane
 *
 */
public interface NewsDao extends CrudRepository<News, Long> {

	List<News> findByOrderByCreationDateDesc(Pageable pageable);
}
