package com.scm.model.domain.bp.message.recipient.impl;

import com.scm.model.domain.bp.message.recipient.MessageRecipientDAO;
import com.scm.model.domain.impl.AbstractDAOImpl;
import com.scm.model.persistance.entity.bp.messages.recipient.MessagesRecipients;

public class MessageRecipientDAOImpl extends AbstractDAOImpl<MessagesRecipients, Long> 
				implements MessageRecipientDAO {

	public MessageRecipientDAOImpl(Class<MessagesRecipients> _entityClass) {
		super(_entityClass);
	}

}
