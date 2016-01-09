/**
 * 
 */
package com.svan.veille.site.bsmt.domain;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author stephane 3 janv. 2015
 * 
 */
@Entity
@Table(name = "picture")
public class Picture {

	// ------------ PK -----------------------------------------------------//

	@Id
	@Column(name = "id")
	@GeneratedValue
	private Long id;

	@Column(name = "title", nullable = false, length = 255)
	private String title;

	@ManyToOne()
	@JoinColumn(name = "gallery", nullable = false)
	private Gallery gallery;

	// ------------ Creation/update -----------------------------------------//

	@Column(name = "creation_date", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar creationDate;

	@Column(name = "update_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar updateDate;

	@PrePersist
	private void prePersist() {
		creationDate = GregorianCalendar.getInstance();
	}

	@PreUpdate
	private void preUpdate() {
		updateDate = GregorianCalendar.getInstance();
	}

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

	public Gallery getGallery() {
		return gallery;
	}

	public void setGallery(Gallery gallery) {
		this.gallery = gallery;
	}

}
