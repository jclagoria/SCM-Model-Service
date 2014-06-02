package com.scm.model.persistance.entity.bp.activity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Index;
import org.hibernate.validator.constraints.Length;

@Entity
@Table(name="wp_bp_activity")
public class Activity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Index(name="user_id")
	@Column(name="user_id")
	private Long userId;
	
	@NotNull
	@Index(name="component")
	@Length(max=75)
	private String component;
	
	@NotNull
	@Index(name="type")
	@Length(max=75)
	private String type;
	
	@NotNull
	private String action;
	
	@NotNull
	private String content;
	
	@NotNull
	@Length(max=255)
	@Column(name="primary_link")
	private String primaryLink;
	
	@NotNull
	@Index(name="item_id")
	@Column(name="item_id")
	private Long itemId;
	
	@Index(name="secondary_item_id")
	@Column(name="secondary_item_id")
	private Long secondaryItemId;
	
	@NotNull
	@Index(name="date_recorded")
	@Column(name="date_recorded")
	private Date dateRecorded;
	
	@Index(name="hide_recorded")
	@Column(name="hide_sidewide")
	private Integer hideSiteWide;
	
	@NotNull
	@Index(name="mptt_left")
	@Column(name="mptt_left")
	private Integer mpttLeft;
	
	@NotNull
	@Index(name="mptt_right")
	@Column(name="mptt_right")
	private Integer mpttRight;
	
	@NotNull
	@Index(name="is_spam")
	@Column(name="is_spam")
	private Integer isSpam;

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

	public String getComponent() {
		return component;
	}

	public void setComponent(String component) {
		this.component = component;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getPrimaryLink() {
		return primaryLink;
	}

	public void setPrimaryLink(String primaryLink) {
		this.primaryLink = primaryLink;
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

	public Date getDateRecorded() {
		return dateRecorded;
	}

	public void setDateRecorded(Date dateRecorded) {
		this.dateRecorded = dateRecorded;
	}

	public Integer getHideSiteWide() {
		return hideSiteWide;
	}

	public void setHideSiteWide(Integer hideSiteWide) {
		this.hideSiteWide = hideSiteWide;
	}

	public Integer getMpttLeft() {
		return mpttLeft;
	}

	public void setMpttLeft(Integer mpttLeft) {
		this.mpttLeft = mpttLeft;
	}

	public Integer getMpttRight() {
		return mpttRight;
	}

	public void setMpttRight(Integer mpttRight) {
		this.mpttRight = mpttRight;
	}

	public Integer getIsSpam() {
		return isSpam;
	}

	public void setIsSpam(Integer isSpam) {
		this.isSpam = isSpam;
	}
}