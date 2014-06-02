package com.scm.model.persistance.entity.bp.xprofile;

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
@Table(name="wp_bp_xprofile_fields")
public class XProfileFields implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Index(name="group_id")
//	@Length(min=1, max=20)
	@Column(name="group_id")
	private Long groupId;
	
	@NotNull
	@Index(name="parent_id")
//	@Length(min=1, max=20)
	@Column(name="parent_id")
	private Long parentId;
	
	@NotNull
	@Length(max=150)
	private String type;
	
	@NotNull
	@Length(max=150)
	private String name;
	
	@NotNull
	private String description;
	
	@NotNull
	@Index(name="is_requiered")
	@Column(name="is_requiered")
	private Integer isRequiered;
	
	@NotNull
//	@Length(max=1)
	@Column(name="is_default_option")
	private Integer isDefaultOption;
	
	@NotNull
	@Index(name="field_order")
//	@Length(max=22)
	@Column(name="field_order")
	private Long fieldOrder;
	
	@NotNull
	@Length(max=15)
	@Column(name="order_by")
	private String orderBy;
	
	@NotNull
	@Index(name="can_delete")
	@Column(name="can_delete")
	private Integer canDelete;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getGroupId() {
		return groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
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

	public Integer getIsRequiered() {
		return isRequiered;
	}

	public void setIsRequiered(Integer isRequiered) {
		this.isRequiered = isRequiered;
	}

	public Integer getIsDefaultOption() {
		return isDefaultOption;
	}

	public void setIsDefaultOption(Integer isDefaultOption) {
		this.isDefaultOption = isDefaultOption;
	}

	public Long getFieldOrder() {
		return fieldOrder;
	}

	public void setFieldOrder(Long fieldOrder) {
		this.fieldOrder = fieldOrder;
	}

	public String getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}

	public Integer getCanDelete() {
		return canDelete;
	}

	public void setCanDelete(Integer canDelete) {
		this.canDelete = canDelete;
	}
}
