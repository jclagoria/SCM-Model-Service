package com.scm.model.domain.comments.impl;

import com.scm.model.domain.comments.CommentsDAO;
import com.scm.model.domain.impl.AbstractDAOImpl;
import com.scm.model.persistance.entity.comments.Comments;

public class CommentsDAOImpl extends AbstractDAOImpl<Comments, Long> 
				implements CommentsDAO {

	public CommentsDAOImpl(Class<Comments> _entityClass) {
		super(_entityClass);
	}

}
