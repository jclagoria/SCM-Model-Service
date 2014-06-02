package com.scm.model.persistance.entity.comments;

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
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="wp_comments")
public class Comments implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="comment_id")
	private Long commentId;
	
	@NotNull
//	@NotEmpty
//	@Length(min=1, max=20)
	@Index(name="comment_post_ID")
	@Column(name="comment_post_ID")
	private Long commentPostId;
	
	@NotNull
	@NotEmpty
	@Column(name="comment_author")
	private String commentAuthor;
	
	@NotNull
	@Email
	@Length(max=100)
	@Column(name="comment_author_email")
	private String commentAuthorEmial;
	
	@NotNull
	@Length(max=200)
	@Column(name="comment_author_url")
	private String commentAuthorUrl;
	
	@NotNull
	@Length(max=100)
	@Column(name="comment_author_IP")
	private String commentAuthorIP;
	
	@NotNull
	@DateTimeFormat(pattern="0000-00-00 00:00:00")
	@Column(name="comment_date")
	private Date commentDate;
	
	@NotNull
	@Index(name="comment_date_gmt")
	@DateTimeFormat(pattern="0000-00-00 00:00:00")
	@Column(name="comment_date_gmt")
	private Date commentDateGMT;
	
	@NotNull
	@Column(name="comment_content")
	private String commentContent;
	
	@NotNull
//	@Length(min=1, max=11)
	@Column(name="comment_karma")
	private Integer commentKarma;
	
	@NotNull
	@Index(name="comment_approved_date_gmt", columnNames="comment_approved,comment_date_gmt")
	@Length(min=1, max=20)
	@Column(name="comment_approved")
	private String commentApproved;
	
	@NotNull
	@Length(max=255)
	@Column(name="comment_agent")
	private String commentAgent;
	
	@NotNull
	@Length(max=20)
	@Column(name="comment_type")
	private String commentType;
	
	@NotNull
	@Index(name="comment_parent")
//	@Length(min=1, max=20)
	@Column(name="comment_parent")
	private Long commentParent;
	
	@NotNull
//	@NotEmpty
//	@Length(min=1, max=20)
	@Column(name="user_id")
	private Long userId;

	public Long getCommentId() {
		return commentId;
	}

	public void setCommentId(Long commentId) {
		this.commentId = commentId;
	}

	public Long getCommentPostId() {
		return commentPostId;
	}

	public void setCommentPostId(Long commentPostId) {
		this.commentPostId = commentPostId;
	}

	public String getCommentAuthor() {
		return commentAuthor;
	}

	public void setCommentAuthor(String commentAuthor) {
		this.commentAuthor = commentAuthor;
	}

	public String getCommentAuthorEmial() {
		return commentAuthorEmial;
	}

	public void setCommentAuthorEmial(String commentAuthorEmial) {
		this.commentAuthorEmial = commentAuthorEmial;
	}

	public String getCommentAuthorUrl() {
		return commentAuthorUrl;
	}

	public void setCommentAuthorUrl(String commentAuthorUrl) {
		this.commentAuthorUrl = commentAuthorUrl;
	}

	public String getCommentAuthorIP() {
		return commentAuthorIP;
	}

	public void setCommentAuthorIP(String commentAuthorIP) {
		this.commentAuthorIP = commentAuthorIP;
	}

	public Date getCommentDate() {
		return commentDate;
	}

	public void setCommentDate(Date commentDate) {
		this.commentDate = commentDate;
	}

	public Date getCommentDateGMT() {
		return commentDateGMT;
	}

	public void setCommentDateGMT(Date commentDateGMT) {
		this.commentDateGMT = commentDateGMT;
	}

	public String getCommentContent() {
		return commentContent;
	}

	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}

	public Integer getCommentKarma() {
		return commentKarma;
	}

	public void setCommentKarma(Integer commentKarma) {
		this.commentKarma = commentKarma;
	}

	public String getCommentApproved() {
		return commentApproved;
	}

	public void setCommentApproved(String commentApproved) {
		this.commentApproved = commentApproved;
	}

	public String getCommentAgent() {
		return commentAgent;
	}

	public void setCommentAgent(String commentAgent) {
		this.commentAgent = commentAgent;
	}

	public String getCommentType() {
		return commentType;
	}

	public void setCommentType(String commentType) {
		this.commentType = commentType;
	}

	public Long getCommentParent() {
		return commentParent;
	}

	public void setCommentParent(Long commentParent) {
		this.commentParent = commentParent;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}
}