package com.scm.model.domain.post.impl;

import com.scm.model.domain.impl.AbstractDAOImpl;
import com.scm.model.domain.post.PostDAO;
import com.scm.model.persistance.entity.post.Post;

public class PostDAOImpl extends AbstractDAOImpl<Post, Long> implements PostDAO{

	public PostDAOImpl(Class<Post> _entityClass) {
		super(_entityClass);
	}

}
