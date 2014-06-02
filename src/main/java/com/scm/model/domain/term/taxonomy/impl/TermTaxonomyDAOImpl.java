package com.scm.model.domain.term.taxonomy.impl;

import org.springframework.stereotype.Repository;

import com.scm.model.domain.impl.AbstractDAOImpl;
import com.scm.model.domain.term.taxonomy.TermTaxonomyDAO;
import com.scm.model.persistance.entity.term.taxonomy.TermTaxonomy;

@Repository("termTaxonomyDAO")
public class TermTaxonomyDAOImpl 
				extends AbstractDAOImpl<TermTaxonomy, Long> 
				implements TermTaxonomyDAO {

	public TermTaxonomyDAOImpl(Class<TermTaxonomy> _entityClass) {
		super(_entityClass);		
	}

}
