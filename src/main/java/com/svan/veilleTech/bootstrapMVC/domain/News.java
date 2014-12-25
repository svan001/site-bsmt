package com.svan.veilleTech.bootstrapMVC.domain;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "news")
@NamedQueries({
	@NamedQuery(
			name = News.GET_LAST_NEWS,
			query = 	" SELECT n " 
						+	" FROM News n"
						+  " ORDER BY n.creationDate DESC"
			)
})
public class News {
	public static final String GET_LAST_NEWS = "GET_LAST_NEWS";
	
	
	// ------------ PK -----------------------------------------------------//

	@Id
	@Column(name = "id")
	@GeneratedValue
	private Long id;

	// ------------ Columns-------------------------------------------------//

	@Column(name = "title", nullable = false, length = 255)
	private String title;

	@Column(name = "author", nullable = false, length = 255)
	private String author;

	@Column(name = "content", nullable = false, length = 5000)
	private String content;
	

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

}
