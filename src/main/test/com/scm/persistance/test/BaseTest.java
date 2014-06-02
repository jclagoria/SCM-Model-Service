package com.scm.persistance.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

@ContextConfiguration(locations="classpath:/application-context-model.xml")
@TransactionConfiguration(transactionManager ="transactionManager", defaultRollback = true)
@Transactional
public class BaseTest extends AbstractTransactionalJUnit4SpringContextTests {

	private SessionFactory sessionFactory;
	
	protected void flush(){
		this.sessionFactory.getCurrentSession().flush();
	}
	
	protected Session getCurrentSession(){
		return sessionFactory.getCurrentSession();
	}

}
