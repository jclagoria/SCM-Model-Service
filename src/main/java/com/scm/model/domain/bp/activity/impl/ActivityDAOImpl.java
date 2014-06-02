package com.scm.model.domain.bp.activity.impl;

import com.scm.model.domain.bp.activity.ActivityDAO;
import com.scm.model.domain.impl.AbstractDAOImpl;
import com.scm.model.persistance.entity.bp.activity.Activity;

public class ActivityDAOImpl extends AbstractDAOImpl<Activity, Long> 
				implements ActivityDAO {

	public ActivityDAOImpl(Class<Activity> _entityClass) {
		super(_entityClass);
	}

}
