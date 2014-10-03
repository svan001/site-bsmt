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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name = "team_member")
@SequenceGenerator(name = "team_member_id_generator", sequenceName = "TEAM_MEMBER_PK_SEQ", allocationSize = 1)
public class TeamMember {

	// ------------ PK -----------------------------------------------------//

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "team_member_id_generator")
	private Long id;

	// ------------ Columns-------------------------------------------------//

	@Column(name = "nickname", nullable = false, length = 256)
	private String nickname;

	@Column(name = "real_name", nullable = true, length = 256)
	private String realName;

	@Column(name = "role", nullable = true, length = 256)
	private String role;

	@Column(name = "gear", nullable = true, length = 256)
	private String gear;

	@Column(name = "integration_date", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar integrationDate;

	@Column(name = "description", nullable = false, length = 5000)
	private String description;

	// image
	// private

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
	 * @return the creationDate
	 */
	public Calendar getCreationDate() {
		return creationDate;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getGear() {
		return gear;
	}

	public void setGear(String gear) {
		this.gear = gear;
	}

	public Calendar getIntegrationDate() {
		return integrationDate;
	}

	public void setIntegrationDate(Calendar integrationDate) {
		this.integrationDate = integrationDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Calendar getUpdateDate() {
		return updateDate;
	}

}
