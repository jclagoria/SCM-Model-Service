package com.scm.model.domain.bp.message.impl;

import com.scm.model.domain.bp.message.MessagesDAO;
import com.scm.model.domain.impl.AbstractDAOImpl;
import com.scm.model.persistance.entity.bp.messages.Messages;

public class MessagesDAOImpl extends AbstractDAOImpl<Messages, Long> 
				implements MessagesDAO {

	public MessagesDAOImpl(Class<Messages> _entityClass) {
		super(_entityClass);
	}

}
