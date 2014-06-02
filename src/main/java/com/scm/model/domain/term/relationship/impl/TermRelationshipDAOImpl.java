package com.scm.model.domain.term.relationship.impl;

import org.springframework.stereotype.Repository;

import com.scm.model.domain.impl.AbstractDAOImpl;
import com.scm.model.domain.term.relationship.TermRelationshipsDAO;
import com.scm.model.persistance.entity.term.relationship.TermRelationships;

@Repository("termRelationshipDAO")
public class TermRelationshipDAOImpl 
				extends AbstractDAOImpl<TermRelationships, Long> 
				implements TermRelationshipsDAO {

	public TermRelationshipDAOImpl(Class<TermRelationships> _entityClass) {
		super(_entityClass);	
	}

}
