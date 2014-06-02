package com.scm.model.persistance.entity.links;

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
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.URL;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="wp_links")
public class Links implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="link_id")
	private Long linkId;
	
	@NotNull
	@NotEmpty
	@URL
	@Length(max=255)
	@Column(name="link_url")
	private String linkUrl;
	
	@NotNull
	@NotEmpty
	@Length(max=255)
	@Column(name="link_name")
	private String linkName;
	
	@NotNull
	@Length(max=255)
	@Column(name="link_image")
	private String linkImage;
	
	@NotNull
	@Length(max=25)
	@Column(name="link_target")
	private String linkTarget;
	
	@NotNull
	@Length(max=255)
	@Column(name="link_description")
	private String linkDescription;
	
	@NotNull
	@Length(max=20)
	@Index(name="link_visible")
	@Column(name="link_visible")
	private String linkVisile;
	
	@NotNull
//	@Length(max=20)
	@Column(name="link_owner")
	private Long linkOwner;
	
	@NotNull
//	@Length(max=11)
	@Column(name="link_rating")
	private Integer linkRanting;
	
	@NotNull
	@DateTimeFormat(pattern="0000-00-00 00:00:00")
	@Column(name="link_update")
	private Date linkUpdate;
	
	@NotNull
	@Length(max=255)
	@Column(name="link_rel")
	private String linkRel;
	
	@NotNull
	@Column(name="link_notes")
	private String linkNotes;
	
	@NotNull
	@Length(max=255)
	@Column(name="link_rss")
	private String linkRss;

	public Long getLinkId() {
		return linkId;
	}

	public void setLinkId(Long linkId) {
		this.linkId = linkId;
	}

	public String getLinkUrl() {
		return linkUrl;
	}

	public void setLinkUrl(String linkUrl) {
		this.linkUrl = linkUrl;
	}

	public String getLinkName() {
		return linkName;
	}

	public void setLinkName(String linkName) {
		this.linkName = linkName;
	}

	public String getLinkImage() {
		return linkImage;
	}

	public void setLinkImage(String linkImage) {
		this.linkImage = linkImage;
	}

	public String getLinkTarget() {
		return linkTarget;
	}

	public void setLinkTarget(String linkTarget) {
		this.linkTarget = linkTarget;
	}

	public String getLinkDescription() {
		return linkDescription;
	}

	public void setLinkDescription(String linkDescription) {
		this.linkDescription = linkDescription;
	}

	public String getLinkVisile() {
		return linkVisile;
	}

	public void setLinkVisile(String linkVisile) {
		this.linkVisile = linkVisile;
	}

	public Long getLinkOwner() {
		return linkOwner;
	}

	public void setLinkOwner(Long linkOwner) {
		this.linkOwner = linkOwner;
	}

	public Integer getLinkRanting() {
		return linkRanting;
	}

	public void setLinkRanting(Integer linkRanting) {
		this.linkRanting = linkRanting;
	}

	public Date getLinkUpdate() {
		return linkUpdate;
	}

	public void setLinkUpdate(Date linkUpdate) {
		this.linkUpdate = linkUpdate;
	}

	public String getLinkRel() {
		return linkRel;
	}

	public void setLinkRel(String linkRel) {
		this.linkRel = linkRel;
	}

	public String getLinkNotes() {
		return linkNotes;
	}

	public void setLinkNotes(String linkNotes) {
		this.linkNotes = linkNotes;
	}

	public String getLinkRss() {
		return linkRss;
	}

	public void setLinkRss(String linkRss) {
		this.linkRss = linkRss;
	}
}