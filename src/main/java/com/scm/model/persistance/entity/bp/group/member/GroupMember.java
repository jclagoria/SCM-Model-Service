package com.scm.model.persistance.entity.bp.group.member;

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
@Table(name="wp_bp_groups_members")
public class GroupMember implements Serializable{

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
	@Index(name="user_id")
//	@Length(min=1, max=20)
	@Column(name="user_id")
	private Long userId;
	
	@NotNull
	@Index(name="inviter_id")
//	@Length(min=1, max=20)
	@Column(name="inviter_id")
	private Long inviterId;
	
	@NotNull
	@Index(name="is_admin")
//	@Length(max=1)
	@Column(name="is_admin")
	private Integer isAdmin;
	
	@NotNull
	@Index(name="is_mod")
//	@Length(max=1)
	@Column(name="is_mod")
	private Integer isMod;
	
	@NotNull
	@Length(max=100)
	@Column(name="user_title")
	private String userTitle;
	
	@NotNull
	@Column(name="date_modified")
	private Date dateModified;
	
	@NotNull
	private String comments;
	
	@NotNull
	@Index(name="is_confirmed")
//	@Length(max=1)
	@Column(name="is_confirmed")
	private Integer isConfirmed;
	
	@NotNull
//	@Length(max=1)
	@Column(name="is_banned")
	private Integer isBanned;
	
	@NotNull
//	@Length(max=1)
	@Column(name="invite_sent")
	private Integer inviteSent;

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

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getInviterId() {
		return inviterId;
	}

	public void setInviterId(Long inviterId) {
		this.inviterId = inviterId;
	}

	public Integer getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(Integer isAdmin) {
		this.isAdmin = isAdmin;
	}

	public Integer getIsMod() {
		return isMod;
	}

	public void setIsMod(Integer isMod) {
		this.isMod = isMod;
	}

	public String getUserTitle() {
		return userTitle;
	}

	public void setUserTitle(String userTitle) {
		this.userTitle = userTitle;
	}

	public Date getDateModified() {
		return dateModified;
	}

	public void setDateModified(Date dateModified) {
		this.dateModified = dateModified;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Integer getIsConfirmed() {
		return isConfirmed;
	}

	public void setIsConfirmed(Integer isConfirmed) {
		this.isConfirmed = isConfirmed;
	}

	public Integer getIsBanned() {
		return isBanned;
	}

	public void setIsBanned(Integer isBanned) {
		this.isBanned = isBanned;
	}

	public Integer getInviteSent() {
		return inviteSent;
	}

	public void setInviteSent(Integer inviteSent) {
		this.inviteSent = inviteSent;
	}
}
