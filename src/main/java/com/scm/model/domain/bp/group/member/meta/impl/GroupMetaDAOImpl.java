package com.scm.model.domain.bp.group.member.meta.impl;

import com.scm.model.domain.bp.group.member.meta.GroupMetaDAO;
import com.scm.model.domain.impl.AbstractDAOImpl;
import com.scm.model.persistance.entity.bp.group.meta.GroupMeta;

public class GroupMetaDAOImpl extends AbstractDAOImpl<GroupMeta, Long> 
				implements GroupMetaDAO {

	public GroupMetaDAOImpl(Class<GroupMeta> _entityClass) {
		super(_entityClass);
	}

}
