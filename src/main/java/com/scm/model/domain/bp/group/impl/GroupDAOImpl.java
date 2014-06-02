package com.scm.model.domain.bp.group.impl;

import com.scm.model.domain.bp.group.GroupDAO;
import com.scm.model.domain.impl.AbstractDAOImpl;
import com.scm.model.persistance.entity.bp.group.Group;

public class GroupDAOImpl extends AbstractDAOImpl<Group, Long> implements GroupDAO {

	public GroupDAOImpl(Class<Group> _entityClass) {
		super(_entityClass);
	}

}
