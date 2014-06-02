package com.scm.model.persistance.entity.term.relationship;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Index;

@Entity
@Table(name="wp_term_relationships")
public class TermRelationships implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@NotNull
	@Column(name="object_id")
	private Long objectId;
	
	@Id
	@NotNull
//	@Length(min=1, max=20)
	@Index(name="term_taxonomy_id")
	@Column(name="term_taxonomy_id")
	private Long termTaxonomyId;
	
	@NotNull
//	@Length(max=11)
	@Column(name="term_order")
	/********
	 * TODO ver q usar para numero si Size o Lenght
	 */
	private Integer termOrder;

	public Long getObjectId() {
		return objectId;
	}

	public void setObjectId(Long objectId) {
		this.objectId = objectId;
	}

	public Long getTermTaxonomyId() {
		return termTaxonomyId;
	}

	public void setTermTaxonomyId(Long termTaxonomyId) {
		this.termTaxonomyId = termTaxonomyId;
	}

	public Integer getTermOrder() {
		return termOrder;
	}

	public void setTermOrder(Integer termOrder) {
		this.termOrder = termOrder;
	}

}
