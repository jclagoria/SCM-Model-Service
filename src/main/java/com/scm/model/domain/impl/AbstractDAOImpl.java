package com.scm.model.domain.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.scm.model.domain.AbstractDAO;

@Transactional
@Component
public class AbstractDAOImpl<E, ID extends Serializable> implements AbstractDAO<E, ID > {

	
	private Class<E> entityClass;
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public AbstractDAOImpl(final Class<E> _entityClass){
		this.entityClass = _entityClass;
	}
	
	public final Session getCurrentSession(){
		return this.sessionFactory.getCurrentSession();
	}
	
	public void setCurrenSession(SessionFactory _sessionFactory){
		this.sessionFactory = _sessionFactory;
	}
	
	@SuppressWarnings("unchecked")
	public E findById(ID _id) {
		
		return (E)this.getCurrentSession().get(this.entityClass, _id); 
	
	}

	
	public void saveOrUpdate(E _e) {
		getCurrentSession().saveOrUpdate(_e);
	}

	
	public void delete(E _e) {
		getCurrentSession().delete(_e);
	}

	@SuppressWarnings("unchecked")
	public List<E> findbyCriteria(Criterion _criterion) {
		
		Criteria criteria = getCurrentSession().createCriteria(entityClass);
		criteria.add(_criterion);
		
		return criteria.list();
	}

}
