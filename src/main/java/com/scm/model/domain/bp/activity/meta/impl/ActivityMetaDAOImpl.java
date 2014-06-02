package com.scm.model.domain.bp.activity.meta.impl;

import com.scm.model.domain.bp.activity.meta.ActivityMedaDAO;
import com.scm.model.domain.impl.AbstractDAOImpl;
import com.scm.model.persistance.entity.bp.activity.meta.ActivityMeta;

public class ActivityMetaDAOImpl extends AbstractDAOImpl<ActivityMeta, Long> 
				implements ActivityMedaDAO {

	public ActivityMetaDAOImpl(Class<ActivityMeta> _entityClass) {
		super(_entityClass);
	}

}
