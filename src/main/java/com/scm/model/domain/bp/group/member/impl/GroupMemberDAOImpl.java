package com.scm.model.domain.bp.group.member.impl;

import com.scm.model.domain.bp.group.member.GroupMemberDAO;
import com.scm.model.domain.impl.AbstractDAOImpl;
import com.scm.model.persistance.entity.bp.group.member.GroupMember;

public class GroupMemberDAOImpl extends AbstractDAOImpl<GroupMember, Long> 
				implements GroupMemberDAO {

	public GroupMemberDAOImpl(Class<GroupMember> _entityClass) {
		super(_entityClass);
	}

}
