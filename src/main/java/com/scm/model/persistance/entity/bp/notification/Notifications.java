package com.scm.model.persistance.entity.bp.notification;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Index;
import org.hibernate.validator.constraints.Length;

public class Notifications implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Index(name="useritem", columnNames="user_id, is_new")
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Index(name="user_id")
//	@Length(min=1, max=20)
	@Column(name="user_id")
	private Long userId;
	
	@NotNull
	@Index(name="item_id")
//	@Length(min=1, max=20)
	@Column(name="item_id")
	private Long itemId;
	
	@Index(name="secondary_item_id")
//	@Length(min=1, max=20)
	@Column(name="secondary_item_id")
	private Long secondaryItemId;
	
	@NotNull
	@Index(name="component_name")
	@Length(max=75)
	@Column(name="component_name")
	private String componentName;
	
	@NotNull
	@Index(name="component_action")
	@Length(max=75)
	@Column(name="component_action")
	private String componentAction;
	
	@NotNull
	@Column(name="date_notified")
	private Date dateNotified;
	
	@NotNull
	@Index(name="is_new")
//	@Length(max=1)
	@Column(name="is_new")
	private Integer isNew;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public Long getSecondaryItemId() {
		return secondaryItemId;
	}

	public void setSecondaryItemId(Long secondaryItemId) {
		this.secondaryItemId = secondaryItemId;
	}

	public String getComponentName() {
		return componentName;
	}

	public void setComponentName(String componentName) {
		this.componentName = componentName;
	}

	public String getComponentAction() {
		return componentAction;
	}

	public void setComponentAction(String componentAction) {
		this.componentAction = componentAction;
	}

	public Date getDateNotified() {
		return dateNotified;
	}

	public void setDateNotified(Date dateNotified) {
		this.dateNotified = dateNotified;
	}

	public Integer getIsNew() {
		return isNew;
	}

	public void setIsNew(Integer isNew) {
		this.isNew = isNew;
	}
}
