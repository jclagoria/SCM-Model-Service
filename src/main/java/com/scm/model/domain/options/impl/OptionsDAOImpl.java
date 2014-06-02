package com.scm.model.domain.options.impl;

import com.scm.model.domain.impl.AbstractDAOImpl;
import com.scm.model.domain.options.OptionsDAO;
import com.scm.model.persistance.entity.options.Options;

public class OptionsDAOImpl extends AbstractDAOImpl<Options, Long> 
				implements OptionsDAO {

	public OptionsDAOImpl(Class<Options> _entityClass) {
		super(_entityClass);
	}

}
