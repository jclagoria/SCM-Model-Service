package com.scm.model.domain.bp.xprofile.impl;

import com.scm.model.domain.bp.xprofile.XProfileDataDAO;
import com.scm.model.domain.impl.AbstractDAOImpl;
import com.scm.model.persistance.entity.bp.xprofile.XProfileData;

public class XProfileDataDAOImpl extends AbstractDAOImpl<XProfileData, Long> 
			implements XProfileDataDAO {

	public XProfileDataDAOImpl(Class<XProfileData> _entityClass) {
		super(_entityClass);
	}

}
