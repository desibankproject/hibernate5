package com.hibernate.learn.entity;

import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "professor_class_assigned_tbl")
public class ProfessorClassAssigned {

	@EmbeddedId
	private ProfessorLectureComposityKey composityKey;
	private String email;
	private String name;
	private Date doe;
	private String type;

	public ProfessorLectureComposityKey getComposityKey() {
		return composityKey;
	}

	public void setComposityKey(ProfessorLectureComposityKey composityKey) {
		this.composityKey = composityKey;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDoe() {
		return doe;
	}

	public void setDoe(Date doe) {
		this.doe = doe;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "ProfessorClassAssigned [composityKey=" + composityKey + ", email=" + email + ", name=" + name + ", doe="
				+ doe + ", type=" + type + "]";
	}

}
