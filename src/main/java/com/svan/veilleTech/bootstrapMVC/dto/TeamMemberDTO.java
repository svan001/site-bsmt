package com.svan.veilleTech.bootstrapMVC.dto;

import java.util.Calendar;

public class TeamMemberDTO {

	// ------------ PK -----------------------------------------------------//

	private Long id;

	// ------------ Columns-------------------------------------------------//

	// Person
	private String forname;

	private String sexe;

	private Calendar birthDate;

	// Member
	private String nickName;

	private String gear;

	private String role;

	private String description;

	private String status;

	private Calendar membershipDate;

	private Calendar departureDate;

	private String likes;

	private String doesntlikes;

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

	public String getForname() {
		return forname;
	}

	public void setForname(String forname) {
		this.forname = forname;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public Calendar getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Calendar birthDate) {
		this.birthDate = birthDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Calendar getMembershipDate() {
		return membershipDate;
	}

	public void setMembershipDate(Calendar membershipDate) {
		this.membershipDate = membershipDate;
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
