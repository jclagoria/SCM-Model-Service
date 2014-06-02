package com.scm.model.domain.bp.friend.impl;

import com.scm.model.domain.bp.friend.FriendDAO;
import com.scm.model.domain.impl.AbstractDAOImpl;
import com.scm.model.persistance.entity.bp.friend.Friend;

public class FriendDAOImpl extends AbstractDAOImpl<Friend, Long> implements FriendDAO {

	public FriendDAOImpl(Class<Friend> _entityClass) {
		super(_entityClass);
	}

}
