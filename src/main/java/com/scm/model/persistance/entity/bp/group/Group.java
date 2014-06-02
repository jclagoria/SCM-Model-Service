package com.scm.model.persistance.entity.bp.group;

import java.io.Serializable;
import java.sql.Date;

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
@Table(name="wp_bp_groups")
public class Group implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Index(name="creator_id")
//	@Length(min=1, max=20)
	@Column(name="creator_id")
	private Long creatorId;
	
	@NotNull
	@Length(max=100)
	private String name;
	
	@NotNull
	@Length(max=200)
	private String slug;
	
	@NotNull
	private String description;
	
	@NotNull
	@Index(name="status")
	@Length(max=10)
	private String status;
	
	@NotNull
//	@Length(max=1)
	@Column(name="enabled_forum")
	private Integer enabledForum;
	
	@NotNull
	@Column(name="date_created")
	private Date dateCreated;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCreatorId() {
		return creatorId;
	}

	public void setCreatorId(Long creatorId) {
		this.creatorId = creatorId;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getEnabledForum() {
		return enabledForum;
	}

	public void setEnabledForum(Integer enabledForum) {
		this.enabledForum = enabledForum;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	
}
