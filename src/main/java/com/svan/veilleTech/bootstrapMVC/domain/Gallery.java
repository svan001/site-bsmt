/**
 * 
 */
package com.svan.veilleTech.bootstrapMVC.domain;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "gallery")
public class Gallery {

	// ------------ PK -----------------------------------------------------//

	@Id
	@Column(name = "id")
	@GeneratedValue
	private Long id;

	@Column(name = "title", nullable = false, length = 255)
	private String title;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "gallery")
	private List<Picture> pictures;

	// ------------ Creation/update -----------------------------------------//

	@Column(name = "creation_date", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar creationDate;

	@Column(name = "update_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar updateDate;

	@SuppressWarnings("unused")
	@PrePersist
	private void prePersist() {
		creationDate = GregorianCalendar.getInstance();
	}

	@SuppressWarnings("unused")
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

	/**
	 * @return the pictures
	 */
	public List<Picture> getPictures() {
		return pictures;
	}

	/**
	 * @param pictures
	 *            the pictures to set
	 */
	public void setPictures(List<Picture> pictures) {
		this.pictures = pictures;
	}

}
