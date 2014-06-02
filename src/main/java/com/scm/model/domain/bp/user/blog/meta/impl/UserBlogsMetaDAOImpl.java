package com.scm.model.domain.bp.user.blog.meta.impl;

import com.scm.model.domain.bp.user.blog.meta.UserBlogsMetaDAO;
import com.scm.model.domain.impl.AbstractDAOImpl;
import com.scm.model.persistance.entity.bp.user.blog.meta.UserBlogsMeta;

public class UserBlogsMetaDAOImpl extends AbstractDAOImpl<UserBlogsMeta, Long> 
				implements UserBlogsMetaDAO {

	public UserBlogsMetaDAOImpl(Class<UserBlogsMeta> _entityClass) {
		super(_entityClass);
	}

}
