/**
 * 2014
 * 8 nov. 2014 19:37:29 
 * @author stephane stephane.gronowski@gmail.com
 */
package com.svan.veille.site.bsmt.service;

import java.io.File;
import java.io.InputStream;
import java.util.List;

import com.svan.veille.site.bsmt.dto.GalleryDTO;

/**
 * 
 * 
 * @author stephane stephane.gronowski@gmail.com
 * 
 */
public interface GalleryService {

	/**
	 * Return all the Galleries
	 * 
	 * @return
	 */
	public List<GalleryDTO> getAllGalleries();

	/**
	 * Return the Gallery by id
	 * 
	 * @param id
	 * @return
	 */
	public GalleryDTO getById(Long id);

	/**
	 * Return the picture {@link InputStream}
	 * 
	 * @param idGallery
	 * @param pictureName
	 * @param size
	 * @return
	 */
	public File getPictureFile(Long idGallery, String pictureName, String size);
}
