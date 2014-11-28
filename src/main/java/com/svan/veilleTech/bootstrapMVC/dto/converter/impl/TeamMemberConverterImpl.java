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
 * @author stephane stephane.gronowski@gmail.com
 *
 */
@Component
public class TeamMemberConverterImpl extends AbstractConverter<TeamMember,TeamMemberDTO> implements TeamMemberConverter {

	@Override
	public TeamMemberDTO toDest(TeamMember entity) {
		TeamMemberDTO dto = new TeamMemberDTO();
		
		dto.setId(entity.getId());
		dto.setNickName(entity.getNickName());
		dto.setRole(entity.getRole());
		dto.setGear(entity.getGear());
		dto.setDescription(entity.getDescription());
		dto.setPostulant(entity.isPostulant());
		
		dto.setCreationDate(entity.getCreationDate());
		dto.setUpdateDate(entity.getUpdateDate());

		return dto;
	}

}
