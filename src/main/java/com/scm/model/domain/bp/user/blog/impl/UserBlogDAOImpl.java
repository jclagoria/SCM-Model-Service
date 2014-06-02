package com.scm.model.domain.bp.user.blog.impl;

import com.scm.model.domain.bp.user.blog.UserBLogDAO;
import com.scm.model.domain.impl.AbstractDAOImpl;
import com.scm.model.persistance.entity.bp.user.blog.UserBlogs;

public class UserBlogDAOImpl extends AbstractDAOImpl<UserBlogs, Long> 
				implements UserBLogDAO {

	public UserBlogDAOImpl(Class<UserBlogs> _entityClass) {
		super(_entityClass);
	}

}
