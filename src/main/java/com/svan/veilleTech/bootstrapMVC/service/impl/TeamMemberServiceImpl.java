/**
 * 2014
 * 8 nov. 2014 19:38:13 
 * @author stephane stephane.gronowski@gmail.com
 */
package com.svan.veilleTech.bootstrapMVC.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.svan.fwk.service.AbstractService;
import com.svan.veilleTech.bootstrapMVC.dao.TeamMemberDao;
import com.svan.veilleTech.bootstrapMVC.dto.TeamMemberDTO;
import com.svan.veilleTech.bootstrapMVC.dto.converter.TeamMemberConverter;
import com.svan.veilleTech.bootstrapMVC.service.TeamMemberService;

/**
 * 
 * 8 nov. 2014 19:38:13
 * 
 * @author stephane stephane.gronowski@gmail.com
 * 
 */
@Service
@Transactional
public class TeamMemberServiceImpl extends AbstractService implements TeamMemberService {

	@Autowired
	private TeamMemberDao teamMemberDao;

	@Autowired
	private TeamMemberConverter converter;

	@Override
	public List<TeamMemberDTO> getAllMembers() {
		return converter.toDest(teamMemberDao.findAll());
	}

	@Override
	public TeamMemberDTO getById(Long id) {
		return converter.toDest(teamMemberDao.findByPk(id));
	}

}
