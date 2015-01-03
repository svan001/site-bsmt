/**
 * 2014
 * 8 nov. 2014 19:23:30 
 * @author stephane stephane.gronowski@gmail.com
 */
package com.svan.veilleTech.bootstrapMVC.dto.converter.impl;

import org.springframework.stereotype.Component;

import com.svan.fwk.dto.AbstractConverter;
import com.svan.veilleTech.bootstrapMVC.domain.TeamMember;
import com.svan.veilleTech.bootstrapMVC.dto.TeamMemberDTO;
import com.svan.veilleTech.bootstrapMVC.dto.converter.TeamMemberConverter;

/**
 * 
 * 8 nov. 2014 19:23:30
 * 
 * @author stephane stephane.gronowski@gmail.com
 * 
 */
@Component
public class TeamMemberConverterImpl extends AbstractConverter<TeamMember, TeamMemberDTO> implements
		TeamMemberConverter {

	@Override
	public TeamMemberDTO toDest(TeamMember entity) {
		TeamMemberDTO dto = new TeamMemberDTO();

		dto.setId(entity.getId());
		dto.setNickName(entity.getNickName());
		dto.setRole(entity.getRole());
		dto.setGear(entity.getGear());
		dto.setDescription(entity.getDescription());
		dto.setBirthDate(entity.getBirthDate());
		dto.setDoesntlikes(entity.getDoesntlikes());
		dto.setForname(entity.getForname());
		dto.setLikes(entity.getLikes());
		dto.setMembershipDate(entity.getMembershipDate());
		dto.setDepartureDate(entity.getDepartureDate());
		dto.setSexe(entity.getSexe());
		dto.setStatus(entity.getStatus());

		dto.setCreationDate(entity.getCreationDate());
		dto.setUpdateDate(entity.getUpdateDate());

		return dto;
	}
}
