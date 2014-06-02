package com.scm.model.persistance.entity.bp.messages.recipient;

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
@Table(name="wp_bp_messages_recipients")
public class MessagesRecipients implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Index(name="user_id")
//	@Length(min=1, max=20)
	@Column(name="user_id")
	private Long userId;
	
	@NotNull
	@Index(name="thread_id")
//	@Length(min=1)
	@Column(name="thread_id")
	private Integer threadId;
	
	@NotNull
	@Index(name="unread_count")
//	@Length(min=1, max=11)
	@Column(name="unread_count")
	private Integer unreadCount;
	
	@NotNull
	@Index(name="sender_only")
//	@Length(max=1)
	@Column(name="sender_only")
	private Integer senderOnly;
	
	@NotNull
	@Index(name="sender_only")
//	@Length(max=1)
	@Column(name="is_deleted")
	private Integer isDeleted;

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

	public Integer getThreadId() {
		return threadId;
	}

	public void setThreadId(Integer threadId) {
		this.threadId = threadId;
	}

	public Integer getUnreadCount() {
		return unreadCount;
	}

	public void setUnreadCount(Integer unreadCount) {
		this.unreadCount = unreadCount;
	}

	public Integer getSenderOnly() {
		return senderOnly;
	}

	public void setSenderOnly(Integer senderOnly) {
		this.senderOnly = senderOnly;
	}

	public Integer getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(Integer isDeleted) {
		this.isDeleted = isDeleted;
	}
}
