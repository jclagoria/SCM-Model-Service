package com.scm.model.domain.user.meta.impl;

import org.springframework.stereotype.Repository;

import com.scm.model.domain.impl.AbstractDAOImpl;
import com.scm.model.domain.user.meta.UserMetaDAO;
import com.scm.model.persistance.entity.user.meta.UserMeta;

@Repository("UserMetaDAO")
public class UserMetaDAOImpl 
			extends AbstractDAOImpl<UserMeta, Long> 
			implements UserMetaDAO {

	public UserMetaDAOImpl(Class<UserMeta> _entityClass) {
		super(_entityClass);		
	}
	
}
