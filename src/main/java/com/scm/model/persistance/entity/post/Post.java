package com.scm.model.persistance.entity.post;

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
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="wp_post")
public class Post implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Index(name="type_status_post")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private Long id;
	
	@NotNull
//	@Length(min=1, max=20)
	@Index(name="post_author")
	@Column(name="post_author")
	private Long postAuthor;
	
	@NotNull
	@DateTimeFormat(pattern="0000-00-00 00:00:00")
	@Index(name="type_status_date")
	@Column(name="post_date")
	private Date postDate;
	
	@NotNull
	@DateTimeFormat(pattern="0000-00-00 00:00:00")
	@Column(name="post_data_gmt")
	private Date postDateGMT;
	
	@NotNull
	@Column(name="post_content")
	private String postContent;
	
	@NotNull
	@Column(name="post_title")
	private String postTitle;
	
	@NotNull
	@Column(name="post_excert")
	private String postExcerpt;
	
	@NotNull
	@Length(max=20)
	@Index(name="type_status_date")
	@Column(name="post_status")
	private String postStatus;
	
	@NotNull
	@Length(max=20)
	@Column(name="comment_status")
	private String commentStatus;
	
	@NotNull
	@Length(max=20)
	@Column(name="ping_status")
	private String pingStatus;
	
	@NotNull
	@Length(max=20)
	@Column(name="post_password")
	private String postPassword;
	
	@NotNull
	@Length(max=200)
	@Index(name="post_name")
	@Column(name="post_name")
	private String postName;
	
	@NotNull
	@Column(name="to_ping")
	private String toPing;
	
	@NotNull
	@Column(name="pinged")
	private String pinged;
	
	@NotNull
	@DateTimeFormat(pattern="0000-00-00 00:00:00")
	@Column(name="post_modified")
	private Date postModified;
	
	@NotNull
	@DateTimeFormat(pattern="0000-00-00 00:00:00")
	@Column(name="post_modified_gmt")
	private Date postModifiedGMT;
	
	@NotNull
	@Column(name="post_content_filtered")
	private String postContentFiltered;
	
	@NotNull
//	@Length(max=20)
	@Index(name="post_parent")
	@Column(name="post_parent")
	private Long postParent;
	
	@NotNull
	@Length(max=255)
	@Column(name="guid")
	private String guid;
	
	@NotNull
//	@Length(max=11)
	@Column(name="menu_order")
	private Integer menuOrder;
	
	@NotNull
	@Length(max=20)
	@Index(name="type_status_date")
	@Column(name="post_type")
	private String postType;
	
	@NotNull
	@Length(max=100)
	@Column(name="post_mime_type")
	private String postMimeType;
	
	@NotNull
//	@Length(min=0,max=200)
	@Column(name="comment_count")
	private Long commentCount;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getPostAuthor() {
		return postAuthor;
	}

	public void setPostAuthor(Long postAuthor) {
		this.postAuthor = postAuthor;
	}

	public Date getPostDate() {
		return postDate;
	}

	public void setPostDate(Date postDate) {
		this.postDate = postDate;
	}

	public Date getPostDateGMT() {
		return postDateGMT;
	}

	public void setPostDateGMT(Date postDateGMT) {
		this.postDateGMT = postDateGMT;
	}

	public String getPostContent() {
		return postContent;
	}

	public void setPostContent(String postContent) {
		this.postContent = postContent;
	}

	public String getPostTitle() {
		return postTitle;
	}

	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}

	public String getPostExcerpt() {
		return postExcerpt;
	}

	public void setPostExcerpt(String postExcerpt) {
		this.postExcerpt = postExcerpt;
	}

	public String getPostStatus() {
		return postStatus;
	}

	public void setPostStatus(String postStatus) {
		this.postStatus = postStatus;
	}

	public String getCommentStatus() {
		return commentStatus;
	}

	public void setCommentStatus(String commentStatus) {
		this.commentStatus = commentStatus;
	}

	public String getPingStatus() {
		return pingStatus;
	}

	public void setPingStatus(String pingStatus) {
		this.pingStatus = pingStatus;
	}

	public String getPostPassword() {
		return postPassword;
	}

	public void setPostPassword(String postPassword) {
		this.postPassword = postPassword;
	}

	public String getPostName() {
		return postName;
	}

	public void setPostName(String postName) {
		this.postName = postName;
	}

	public String getToPing() {
		return toPing;
	}

	public void setToPing(String toPing) {
		this.toPing = toPing;
	}

	public String getPinged() {
		return pinged;
	}

	public void setPinged(String pinged) {
		this.pinged = pinged;
	}

	public Date getPostModified() {
		return postModified;
	}

	public void setPostModified(Date postModified) {
		this.postModified = postModified;
	}

	public Date getPostModifiedGMT() {
		return postModifiedGMT;
	}

	public void setPostModifiedGMT(Date postModifiedGMT) {
		this.postModifiedGMT = postModifiedGMT;
	}

	public String getPostContentFiltered() {
		return postContentFiltered;
	}

	public void setPostContentFiltered(String postContentFiltered) {
		this.postContentFiltered = postContentFiltered;
	}

	public Long getPostParent() {
		return postParent;
	}

	public void setPostParent(Long postParent) {
		this.postParent = postParent;
	}

	public String getGuid() {
		return guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public Integer getMenuOrder() {
		return menuOrder;
	}

	public void setMenuOrder(Integer menuOrder) {
		this.menuOrder = menuOrder;
	}

	public String getPostType() {
		return postType;
	}

	public void setPostType(String postType) {
		this.postType = postType;
	}

	public String getPostMimeType() {
		return postMimeType;
	}

	public void setPostMimeType(String postMimeType) {
		this.postMimeType = postMimeType;
	}

	public Long getCommentCount() {
		return commentCount;
	}

	public void setCommentCount(Long commentCount) {
		this.commentCount = commentCount;
	}
	
}
