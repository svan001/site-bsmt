package com.svan.veilleTech.bootstrapMVC.dto;

import java.util.Calendar;

public class NewsDTO {
	// ------------ PK -----------------------------------------------------//

	private Long id;

	// ------------ Columns-------------------------------------------------//

	private String title;

	private String author;

	private String content;

	// ------------ Creation/update -----------------------------------------//

	private Calendar creationDate;

	private Calendar updateDate;

	// ------------ Getter/setter -------------------------------------------//

	public Long getId() {
		return id;
	}

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
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param content
	 *            the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * @return the creationDate
	 */
	public Calendar getCreationDate() {
		return creationDate;
	}

	public Calendar getUpdateDate() {
		return updateDate;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setCreationDate(Calendar creationDate) {
		this.creationDate = creationDate;
	}

	public void setUpdateDate(Calendar updateDate) {
		this.updateDate = updateDate;
	}

}
