package com.svan.veilleTech.bootstrapMVC.dto;

import java.util.Calendar;

public class TeamMemberDTO {

	// ------------ PK -----------------------------------------------------//

	private Long id;

	// ------------ Columns-------------------------------------------------//

	private String nickName;

	private String gear;

	private String role;

	private String description;

	private boolean postulant;

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

	public boolean isPostulant() {
		return postulant;
	}

	public void setPostulant(boolean postulant) {
		this.postulant = postulant;
	}

}
