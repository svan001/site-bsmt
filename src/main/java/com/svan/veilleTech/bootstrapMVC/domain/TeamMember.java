package com.svan.veilleTech.bootstrapMVC.domain;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "team_member")
@SequenceGenerator(name = "team_member_id_generator", sequenceName = "TEAM_MEMBER_PK_SEQ", allocationSize = 1)
public class TeamMember {

	// ------------ PK -----------------------------------------------------//

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "team_member_id_generator")
	private Long id;

	// ------------ Columns-------------------------------------------------//

	@Column(name = "nick_name", nullable = false, length = 255)
	private String nickName;

	@Column(name = "gear", nullable = false, length = 255)
	private String gear;

	@Column(name = "role", nullable = false, length = 255)
	private String role;

	@Column(name = "description", nullable = false, length = 5000)
	private String description;

	@Column(name = "is_postulant", nullable = false)
	private boolean postulant;

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

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setCreationDate(Calendar creationDate) {
		this.creationDate = creationDate;
	}

	public void setUpdateDate(Calendar updateDate) {
		this.updateDate = updateDate;
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

	public String getGear() {
		return gear;
	}

	public void setGear(String gear) {
		this.gear = gear;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public boolean isPostulant() {
		return postulant;
	}

	public void setPostulant(boolean postulant) {
		this.postulant = postulant;
	}

}
