package com.scm.model.domain.term.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.scm.model.domain.impl.AbstractDAOImpl;
import com.scm.model.domain.term.TermsDAO;
import com.scm.model.persistance.entity.term.Terms;

@Repository("termsDAO")
public class TermsDAOImpl extends AbstractDAOImpl<Terms, Long> implements TermsDAO {

	@Autowired
	public TermsDAOImpl(Class<Terms> _entityClass) {
		super(_entityClass);
	}

}
