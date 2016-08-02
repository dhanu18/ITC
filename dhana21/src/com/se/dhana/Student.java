package com.se.dhana;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;


@Entity @Component
public class Student {

	
	@Id @NotNull @Column(name="sid")
	private Integer sid;
	@NotEmpty@Column(name="name")
	private String name;
	/*@NotEmpty @DateTimeFormat(pattern="dd/mm/yyyy")
	private String doj;
	@NotEmpty @Email
	private String email;
	@NotEmpty @Max(10)
	private String phone;
	*/
	
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	/*public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	*/
	
	
	
	
	
	
	
	
	
	
	
}
