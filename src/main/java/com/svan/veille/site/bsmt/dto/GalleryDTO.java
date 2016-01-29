/**
 * 
 */
package com.svan.veille.site.bsmt.dto;

import java.util.Calendar;
import java.util.List;

/**
 * @author stephane 3 janv. 2015
 *
 */
public class GalleryDTO {

	// ------------ PK -----------------------------------------------------//

	private Long id;

	private String title;

	private String description;

	private String source;

	private List<PictureDTO> pictures;

	// ------------ Creation/update -----------------------------------------//

	private Calendar creationDate;

	private Calendar updateDate;

	// ------------ Getter/setter -------------------------------------------//

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the creationDate
	 */
	public Calendar getCreationDate() {
		return creationDate;
	}

	/**
	 * @return the updateDate
	 */
	public Calendar getUpdateDate() {
		return updateDate;
	}

	/**
	 * @return the pictures
	 */
	public List<PictureDTO> getPictures() {
		return pictures;
	}

	/**
	 * @param pictures
	 *            the pictures to set
	 */
	public void setPictures(List<PictureDTO> pictures) {
		this.pictures = pictures;
	}

	/**
	 * @param creationDate
	 *            the creationDate to set
	 */
	public void setCreationDate(Calendar creationDate) {
		this.creationDate = creationDate;
	}

	/**
	 * @param updateDate
	 *            the updateDate to set
	 */
	public void setUpdateDate(Calendar updateDate) {
		this.updateDate = updateDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

}
