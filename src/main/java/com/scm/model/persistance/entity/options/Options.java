package com.scm.model.persistance.entity.options;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="wp_options", 
	uniqueConstraints = @UniqueConstraint(columnNames = "option_name"))
public class Options implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="option_id")
	private Long optionId;
	
	@NotNull
	@NotEmpty
	@Length(max=64)
	@Column(name="option_name")
	private String optionName;
	
	@NotNull
	@Column(name="option_value")
	private String optionValue;
	
	@NotNull
	@Length(max=64)
	@Column(name="auto_load")
	private String autoLoad;

	public Long getOptionId() {
		return optionId;
	}

	public void setOptionId(Long optionId) {
		this.optionId = optionId;
	}

	public String getOptionName() {
		return optionName;
	}

	public void setOptionName(String optionName) {
		this.optionName = optionName;
	}

	public String getOptionValue() {
		return optionValue;
	}

	public void setOptionValue(String optionValue) {
		this.optionValue = optionValue;
	}

	public String getAutoLoad() {
		return autoLoad;
	}

	public void setAutoLoad(String autoLoad) {
		this.autoLoad = autoLoad;
	}
}