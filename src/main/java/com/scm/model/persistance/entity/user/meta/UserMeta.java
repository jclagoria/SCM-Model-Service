package com.scm.model.persistance.entity.user.meta;

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
@Table(name="wp_usermeta")
public class UserMeta implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="umeta_id")
	private Long uMetaId;
	
	@NotNull
	@Index(name="user_id")
	private Long userId;
	
	@Index(name="meta_key")
	@Length(max=255)
	@Column(name="meta_key")
	private String metaKey;
	
	@Column(name="meta_value")
	private String metaValue;

	public Long getuMetaId() {
		return uMetaId;
	}

	public void setuMetaId(Long uMetaId) {
		this.uMetaId = uMetaId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getMetaValue() {
		return metaValue;
	}

	public void setMetaValue(String metaValue) {
		this.metaValue = metaValue;
	}
	
}
