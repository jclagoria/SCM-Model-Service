package com.scm.model.domain.comments.meta.impl;

import com.scm.model.domain.comments.meta.CommentsMetaDAO;
import com.scm.model.domain.impl.AbstractDAOImpl;
import com.scm.model.persistance.entity.comments.meta.CommentMeta;

public class CommentsMetaDAOImpl extends AbstractDAOImpl<CommentMeta, Long> 
				implements CommentsMetaDAO {

	public CommentsMetaDAOImpl(Class<CommentMeta> _entityClass) {
		super(_entityClass);
	}

}
