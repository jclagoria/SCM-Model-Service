package com.scm.model.persistance.entity.term.taxonomy;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Index;
import org.hibernate.validator.constraints.Length;

@Entity
@Table(name="wp_term_taxonomy"/*, 
	uniqueConstraints={@UniqueConstraint(columnNames="term_id, taxonomy")}*/)
public class TermTaxonomy implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="term_taxonomy_id")
	private Long termTaxonomyId;

	@NotNull
//	@Length(min=1, max=20)	
	@Column(name="term_id")
	private Long termId;
	
	@NotNull
	@Length(min=1, max=32)
	@Index(name="taxonomy")
	private String taxonomy;
	
	@NotNull
	@Column(name="description")
	private String description;
	
	@NotNull
//	@Length(max=20)
	@Column(name="parent")
	private Long parent;
	
	@NotNull
//	@Length(max=20)
	@Column(name="count")
	private Long count;

	public Long getTermTaxonomyId() {
		return termTaxonomyId;
	}

	public void setTermTaxonomyId(Long termTaxonomyId) {
		this.termTaxonomyId = termTaxonomyId;
	}

	public Long getTermId() {
		return termId;
	}

	public void setTermId(Long termId) {
		this.termId = termId;
	}

	public String getTaxonomy() {
		return taxonomy;
	}

	public void setTaxonomy(String taxonomy) {
		this.taxonomy = taxonomy;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getParent() {
		return parent;
	}

	public void setParent(Long parent) {
		this.parent = parent;
	}

	public Long getCount() {
		return count;
	}

	public void setCount(Long count) {
		this.count = count;
	}
}
