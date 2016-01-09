/**
 * 2014
 * 8 nov. 2014 19:38:13 
 * @author stephane stephane.gronowski@gmail.com
 */
package com.svan.veille.site.bsmt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.svan.veille.site.bsmt.dao.jpa.TeamMemberDao;
import com.svan.veille.site.bsmt.dto.TeamMemberDTO;
import com.svan.veille.site.bsmt.dto.converter.TeamMemberConverter;
import com.svan.veille.site.bsmt.service.TeamMemberService;

/**
 * 
 * 8 nov. 2014 19:38:13
 * 
 * @author stephane stephane.gronowski@gmail.com
 * 
 */
@Service
@Transactional
public class TeamMemberServiceImpl implements TeamMemberService {

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
		return converter.toDest(teamMemberDao.findOne(id));
	}

}
