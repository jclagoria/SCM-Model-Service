package com.scm.model.domain;

import java.io.Serializable;
import java.util.List;

import org.hibernate.criterion.Criterion;
import org.springframework.stereotype.Component;

@Component
public interface AbstractDAO <E, I extends Serializable>{
	
	public E findById(I _id);
	public void saveOrUpdate(E _e);
	public void delete(E _e);
	public List<E> findbyCriteria(Criterion _criterion);

}