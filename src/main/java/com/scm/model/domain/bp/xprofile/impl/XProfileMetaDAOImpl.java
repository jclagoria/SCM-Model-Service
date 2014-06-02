package com.scm.model.domain.bp.xprofile.impl;

import com.scm.model.domain.bp.xprofile.XProfileMetaDAO;
import com.scm.model.domain.impl.AbstractDAOImpl;
import com.scm.model.persistance.entity.bp.xprofile.XProfileMeta;

public class XProfileMetaDAOImpl extends AbstractDAOImpl<XProfileMeta, Long> 
				implements XProfileMetaDAO {

	public XProfileMetaDAOImpl(Class<XProfileMeta> _entityClass) {
		super(_entityClass);
	}

}
