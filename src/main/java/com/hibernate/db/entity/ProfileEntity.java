package com.hibernate.db.entity;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="profiles_tbl")
public class ProfileEntity {

	@EmbeddedId
	private NameEmpIdPK empIdPK;
	
	@Column(length=100)
	private String email;
	private int age;
	private String address;
	private String color="white";
	
	public ProfileEntity(){
		
	}
	
	public ProfileEntity(String name,String empid,String email,int age,String address){
		empIdPK=new NameEmpIdPK(name, empid);
		this.email=email;
		this.age=age;
		this.address=address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "ProfileEntity [empIdPK=" + empIdPK + ", email=" + email + ", age=" + age + ", address=" + address + "]";
	}

	

}
