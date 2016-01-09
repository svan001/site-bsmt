package com.svan.veille.site.bsmt.dao.jpa;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.svan.veille.site.bsmt.domain.Gallery;

/**
 * Repo des {@link Gallery}. <br>
 * Migration vers spring data des repo (Issue 39)
 * 
 *
 * @author stephane
 *
 */
public interface GalleryDao extends CrudRepository<Gallery, Long> {

	List<Gallery> findAll();

}
