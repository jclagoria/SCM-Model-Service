package com.scm.model.persistance.entity.bp.friend;

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
@Table(name="wp_bp_friends")
public class Friend implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Index(name="initiator_user_id")
//	@Length(min=1, max=20)
	@Column(name="initiator_user_id")
	private Long initiatorUserId;
	
	@NotNull
	@Index(name="friend_user_id")
//	@Length(min=1, max=20)
	@Column(name="friend_user_id")
	private Long friendUserId;
	
//	@Length(max=1)
	@Column(name="is_confirmed")
	private Integer isConfirmed;
	
//	@Length(max=1)
	@Column(name="is_limited")
	private Integer isLimited;
	
	@NotNull
	@Column(name="date_created")
	private Date date_created;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getInitiatorUserId() {
		return initiatorUserId;
	}

	public void setInitiatorUserId(Long initiatorUserId) {
		this.initiatorUserId = initiatorUserId;
	}

	public Long getFriendUserId() {
		return friendUserId;
	}

	public void setFriendUserId(Long friendUserId) {
		this.friendUserId = friendUserId;
	}

	public Integer getIsConfirmed() {
		return isConfirmed;
	}

	public void setIsConfirmed(Integer isConfirmed) {
		this.isConfirmed = isConfirmed;
	}

	public Integer getIsLimited() {
		return isLimited;
	}

	public void setIsLimited(Integer isLimited) {
		this.isLimited = isLimited;
	}

	public Date getDate_created() {
		return date_created;
	}

	public void setDate_created(Date date_created) {
		this.date_created = date_created;
	}
}
