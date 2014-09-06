/**
 * 
 */
package com.svan.veilleTech.bootstrapMVC.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.svan.fwk.service.AbstractService;
import com.svan.veilleTech.bootstrapMVC.service.ArticleService;

/**
 * Default Implementation of {@link AbstractService}
 * 
 * @author stephane 3 sept. 2014
 *
 */
@Service
@Transactional
public class ArticleServiceImpl extends AbstractService implements
		ArticleService {

}
