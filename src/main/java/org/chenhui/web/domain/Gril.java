package org.chenhui.web.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
@Entity
@Table(name="gril")
public class Gril {
	@Id
	@Column(name="id")
	private Integer id;
	@Column(name="age")
	private Integer age;
	@Column(name="cup_size")
	private String cupSize;
	public Gril() {
		super();
	}
	public Gril(Integer id, Integer age, String cupSize) {
		super();
		this.id = id;
		this.age = age;
		this.cupSize = cupSize;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getCupSize() {
		return cupSize;
	}
	public void setCupSize(String cupSize) {
		this.cupSize = cupSize;
	}
}
