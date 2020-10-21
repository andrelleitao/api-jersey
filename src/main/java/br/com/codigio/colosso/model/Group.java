package br.com.codigio.colosso.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "groups", schema = "administration")
public class Group {

	private Long id;
	private String name;
	private Integer isEnabled;

	public Group() {
	}

	public Group(Long id, String name, Integer isEnabled) {
		this.id = id;
		this.name = name;
		this.isEnabled = isEnabled;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_GROUP")
	@SequenceGenerator(name="SEQ_GROUP", sequenceName = "SEQ_GROUP", schema = "administration", initialValue = 1, allocationSize = 1)
	@Column(name = "ID_GROUP")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "NAME", nullable = false, length = 50)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "IS_ENABLED", nullable = false)
	public Integer getIsEnabled() {
		return isEnabled;
	}

	public void setIsEnabled(Integer isEnabled) {
		this.isEnabled = isEnabled;
	}
}