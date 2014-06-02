package com.scm.model.persistance.entity.term;

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
@Table(name="wp_terms")
public class Terms implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="term_id")
	private Long termId;
	
	@NotNull
	@Length(max=200)
	@Index(name="name")
	@Column(name="name")
	private String name;
	
	@NotNull
	@Length(max=200)
	@Index(name="slug")
	@Column(name="slug")
	private String slug;
	
	@NotNull
	@Column(name="term_group")
	private Long termGroup;

	public Long getTermId() {
		return termId;
	}

	public void setTermId(Long termId) {
		this.termId = termId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public Long getTermGroup() {
		return termGroup;
	}

	public void setTermGroup(Long termGroup) {
		this.termGroup = termGroup;
	}
	
}