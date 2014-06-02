package com.scm.model.persistance.entity.bp.xprofile;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name="wp_bp_xprofile_groups")
public class XProfileGroups implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Length(max=150)
	private String name;
	
	@NotNull
	private String description;
	
	@NotNull
//	@Length(max=20)
	@Column(name="group_order")
	private Long groupOrder;
	
	@NotNull
//	@Length(max=1)
	@Column(name="can_delete")
	private Integer canDelete;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getGroupOrder() {
		return groupOrder;
	}

	public void setGroupOrder(Long groupOrder) {
		this.groupOrder = groupOrder;
	}

	public Integer getCanDelete() {
		return canDelete;
	}

	public void setCanDelete(Integer canDelete) {
		this.canDelete = canDelete;
	}

}