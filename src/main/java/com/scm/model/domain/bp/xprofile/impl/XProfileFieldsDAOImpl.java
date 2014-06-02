package com.scm.model.domain.bp.xprofile.impl;

import com.scm.model.domain.bp.xprofile.XProfileFieldsDAO;
import com.scm.model.domain.impl.AbstractDAOImpl;
import com.scm.model.persistance.entity.bp.xprofile.XProfileFields;

public class XProfileFieldsDAOImpl extends AbstractDAOImpl<XProfileFields, Long> 
				implements XProfileFieldsDAO {

	public XProfileFieldsDAOImpl(Class<XProfileFields> _entityClass) {
		super(_entityClass);
	}

}
