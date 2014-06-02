package com.scm.model.domain.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.scm.model.domain.impl.AbstractDAOImpl;
import com.scm.model.domain.user.UserDAO;
import com.scm.model.persistance.entity.user.User;

@Transactional
@Repository("UserDAO")
public class UserDAOImpl extends AbstractDAOImpl<User, Long> implements UserDAO {

	@Autowired
	public UserDAOImpl(Class<User> _entityClass) {
		super(_entityClass);		
	}

}
