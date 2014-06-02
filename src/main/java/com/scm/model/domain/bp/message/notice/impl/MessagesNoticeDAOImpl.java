package com.scm.model.domain.bp.message.notice.impl;

import com.scm.model.domain.bp.message.notice.MessagesNoticeDAO;
import com.scm.model.domain.impl.AbstractDAOImpl;
import com.scm.model.persistance.entity.bp.messages.notices.MessagesNotices;

public class MessagesNoticeDAOImpl extends AbstractDAOImpl<MessagesNotices, Long> 
				implements	MessagesNoticeDAO {

	public MessagesNoticeDAOImpl(Class<MessagesNotices> _entityClass) {
		super(_entityClass);
	}

}
