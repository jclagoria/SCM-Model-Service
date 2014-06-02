package com.scm.model.persistance.entity.user;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.annotations.Index;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="wp_users", uniqueConstraints={
		@UniqueConstraint(columnNames="user_login"),
		@UniqueConstraint(columnNames="user_nicename"),
		@UniqueConstraint(columnNames="user_email") })
public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private Long id;
	
	@NotNull
	@Index(name="user_login_key")
	@Length(min=6, max=60)
	@Pattern(regexp = "[A-Za-z ]*", message = "must contain only letters and spaces")
	@Column(name="user_login")
	private String userLogin;
	
	@NotNull
	@Length(min=6, max=64)
	@Pattern(regexp="[A-Za-z]*[1-9]*", message="Debe cumplir con el siguiente formato [A-Za-z]*[1-9]*")
	@Column(name="user_pass")
	private String userPass;
	
	@NotNull
	@Index(name="user_nicename")
	@Length(min=6, max=50)
	@Pattern(regexp = "[A-Za-z]*[1-9]*", message = "Formato que debe respetar es [A-Za-z]*[1-9]*")
	@Column(name="user_nicename")
	private String userNiceName;
	
	@NotNull
	@NotEmpty
	@Email
	@Column(name="user_email")
	private String userEMail;
	
	@NotNull
	@Length(max=100)
	@Column(name="user_url")
	private String userUrl;
	
	@NotNull
	@DateTimeFormat(pattern="0000-00-00 00:00:00")
	@Column(name="user_registered")
	private Date userRegistered;
	
	@NotNull
	@Length(max=60)
	@Column(name="user_activation_key")
	private String userActivationKey;
	
	@NotNull
	@Column(name="user_status")
	/**
	 * TODO Verificar si se puede poner un valor por defecto
	 */
	private Integer userStatus;
	
	@NotNull
	@Length(max=250)
	@Column(name="display_name")
	private String displayname; 

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserLogin() {
		return userLogin;
	}

	public void setUserLogin(String userLogin) {
		this.userLogin = userLogin;
	}

	public String getUserPass() {
		return userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

	public String getUserNiceName() {
		return userNiceName;
	}

	public void setUserNiceName(String userNiceName) {
		this.userNiceName = userNiceName;
	}

	public String getUserEMail() {
		return userEMail;
	}

	public void setUserEMail(String userEMail) {
		this.userEMail = userEMail;
	}

	public String getUserUrl() {
		return userUrl;
	}

	public void setUserUrl(String userUrl) {
		this.userUrl = userUrl;
	}

	public Date getUserRegistered() {
		return userRegistered;
	}

	public void setUserRegistered(Date userRegistered) {
		this.userRegistered = userRegistered;
	}

	public String getUserActivationKey() {
		return userActivationKey;
	}

	public void setUserActivationKey(String userActivationKey) {
		this.userActivationKey = userActivationKey;
	}

	public Integer getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(Integer userStatus) {
		this.userStatus = userStatus;
	}

	public String getDisplayname() {
		return displayname;
	}

	public void setDisplayname(String displayname) {
		this.displayname = displayname;
	}	
}
