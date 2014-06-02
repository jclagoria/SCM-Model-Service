package com.scm.model.domain.post.meta.impl;

import com.scm.model.domain.impl.AbstractDAOImpl;
import com.scm.model.domain.post.meta.PostMetaDAO;
import com.scm.model.persistance.entity.post.meta.PostMeta;

public class PostMetaDAOImpl extends AbstractDAOImpl<PostMeta, Long> implements PostMetaDAO {

	public PostMetaDAOImpl(Class<PostMeta> _entityClass) {
		super(_entityClass);
	}

}
