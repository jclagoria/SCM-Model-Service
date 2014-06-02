package com.scm.model.domain.cntctfrmfield.impl;

import com.scm.model.domain.cntctfrmfield.CntctfrmFieldDAO;
import com.scm.model.domain.impl.AbstractDAOImpl;
import com.scm.model.persistance.entity.cntctfrmfield.CntctfrmField;

public class CntctfrmFieldDAOImpl extends AbstractDAOImpl<CntctfrmField, Long> 
				implements CntctfrmFieldDAO {

	public CntctfrmFieldDAOImpl(Class<CntctfrmField> _entityClass) {
		super(_entityClass);
	}

}
