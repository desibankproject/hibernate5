package com.hibernate.learn.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;

//means we want to persist it into the database

@Entity
@Table(name="employees_tbl")
@Cache(usage=org.hibernate.annotations.CacheConcurrencyStrategy.READ_WRITE)
public class Employee {
	
	private int empid;
	private String name;
	private String email;
	private String mobile;
	private String company;
	private String education;
	
	
	public Employee(){
		System.out.println();
	}
	
	public Employee(String name, String email, String mobile, String company, String education) {
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.company = company;
		this.education = education;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(length=100)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(length=20)
	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Column(length=100)
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Column(length=70)
	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", email=" + email + ", mobile=" + mobile + ", company="
				+ company + ", education=" + education + "]";
	}

}
