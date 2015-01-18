/**
 * 2014
 * 8 nov. 2014 19:37:29 
 * @author stephane stephane.gronowski@gmail.com
 */
package com.svan.veilleTech.bootstrapMVC.service;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

import com.svan.veilleTech.bootstrapMVC.dto.GalleryDTO;

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
	 * @throws FileNotFoundException
	 */
	public InputStream getPictureStream(Long idGallery, String pictureName,
			String size) throws FileNotFoundException;
}
