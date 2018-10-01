package com.hibernate.db.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "student_tbl")
public class StudentEntity {

	private int sid;
	private String name;
	private String email;
	private String mobile;
	private List<MobileEntity> mobiles;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@OneToMany(cascade=CascadeType.ALL,mappedBy="student",fetch=FetchType.LAZY)
//	@Fetch(FetchMode.SELECT)
	//@BatchSize(size=2)
	public List<MobileEntity> getMobiles() {
		return mobiles;
	}

	public void setMobiles(List<MobileEntity> mobiles) {
		this.mobiles = mobiles;
	}

	@Override
	public String toString() {
		return "StudentEntity [sid=" + sid + ", name=" + name + ", email=" + email + ", mobile=" + mobile + ", mobiles=]";
	}

}
