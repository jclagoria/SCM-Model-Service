package com.scm.model.domain.bp.xprofile.impl;

import com.scm.model.domain.bp.xprofile.XProfileGroupsDAO;
import com.scm.model.domain.impl.AbstractDAOImpl;
import com.scm.model.persistance.entity.bp.xprofile.XProfileGroups;

public class XProfileGroupsDAOImpl extends AbstractDAOImpl<XProfileGroups, Long> 
				implements XProfileGroupsDAO {

	public XProfileGroupsDAOImpl(Class<XProfileGroups> _entityClass) {
		super(_entityClass);
	}

}
