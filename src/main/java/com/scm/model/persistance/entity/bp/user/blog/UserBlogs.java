package com.scm.model.persistance.entity.bp.user.blog;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Index;

@Entity
@Table(name="wp_bp_user_blogs")
public class UserBlogs implements Serializable {

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
	@Index(name="blog_id")
//	@Length(min=1, max=20)
	@Column(name="blog_id")
	private Long blogId;
}
