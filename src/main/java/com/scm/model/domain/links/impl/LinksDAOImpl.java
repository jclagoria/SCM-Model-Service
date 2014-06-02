package com.scm.model.domain.links.impl;

import com.scm.model.domain.impl.AbstractDAOImpl;
import com.scm.model.domain.links.LinksDAO;
import com.scm.model.persistance.entity.links.Links;

public class LinksDAOImpl extends AbstractDAOImpl<Links, Long> implements LinksDAO {

	public LinksDAOImpl(Class<Links> _entityClass) {
		super(_entityClass);
	}

}
