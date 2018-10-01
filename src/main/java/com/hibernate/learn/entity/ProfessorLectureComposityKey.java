package com.hibernate.learn.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class ProfessorLectureComposityKey implements Serializable {

	private String pid;
	private String lclass;
	private String subject;

	public ProfessorLectureComposityKey() {

	}

	public ProfessorLectureComposityKey(String pid, String lclass, String subject) {
		this.pid = pid;
		this.lclass = lclass;
		this.subject = subject;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getLclass() {
		return lclass;
	}

	public void setLclass(String lclass) {
		this.lclass = lclass;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "ProfessorLectureComposityKey [pid=" + pid + ", lclass=" + lclass + ", subject=" + subject + "]";
	}

}
