package com.svan.veille.site.bsmt.domain;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "team_member")
public class TeamMember {

	// ------------ PK -----------------------------------------------------//

	@Id
	@Column(name = "id")
	@GeneratedValue
	private Long id;

	// ------------ Columns-------------------------------------------------//

	// Person
	@Column(name = "forname", nullable = false, length = 255)
	private String forname;

	@Column(name = "sexe", nullable = false, length = 1)
	private String sexe;

	@Column(name = "birth_date", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar birthDate;

	// Member
	@Column(name = "nick_name", nullable = false, length = 255)
	private String nickName;

	@Column(name = "gear", nullable = false, length = 255)
	private String gear;

	@Column(name = "role", nullable = false, length = 255)
	private String role;

	@Column(name = "description", nullable = false, length = 5000)
	private String description;

	@Column(name = "status", nullable = false, length = 1)
	private String status;

	@Column(name = "membership_date", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar membershipDate;

	@Column(name = "departure_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar departureDate;

	@Column(name = "likes", nullable = false, length = 255)
	private String likes;

	@Column(name = "doesntlikes", nullable = false, length = 255)
	private String doesntlikes;

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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getForname() {
		return forname;
	}

	public void setForname(String forname) {
		this.forname = forname;
	}

	public Calendar getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Calendar birthDate) {
		this.birthDate = birthDate;
	}

	public Calendar getMembershipDate() {
		return membershipDate;
	}

	public void setMembershipDate(Calendar membershipDate) {
		this.membershipDate = membershipDate;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public String getLikes() {
		return likes;
	}

	public void setLikes(String likes) {
		this.likes = likes;
	}

	public String getDoesntlikes() {
		return doesntlikes;
	}

	public void setDoesntlikes(String doesntlikes) {
		this.doesntlikes = doesntlikes;
	}

	public Calendar getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(Calendar departureDate) {
		this.departureDate = departureDate;
	}

}
