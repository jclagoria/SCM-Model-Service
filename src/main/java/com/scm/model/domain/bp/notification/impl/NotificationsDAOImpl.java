package com.scm.model.domain.bp.notification.impl;

import com.scm.model.domain.bp.notification.NotificationsDAO;
import com.scm.model.domain.impl.AbstractDAOImpl;
import com.scm.model.persistance.entity.bp.notification.Notifications;

public class NotificationsDAOImpl extends AbstractDAOImpl<Notifications, Long> 
				implements NotificationsDAO {

	public NotificationsDAOImpl(Class<Notifications> _entityClass) {
		super(_entityClass);
	}

}
