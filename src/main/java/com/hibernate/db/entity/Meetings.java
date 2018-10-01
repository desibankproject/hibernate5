package com.hibernate.db.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="meetings_tbl")
public class Meetings {

	private Long meetingId;
	private String subject;
	private Date meetingDate;
	private List<Developer> developers=new ArrayList<>();
	
	public Meetings(){
		
	}

	public Meetings(String subject, Date meetingDate) {
		super();
		//this.meetingId = meetingId;
		this.subject = subject;
		this.meetingDate = meetingDate;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long getMeetingId() {
		return meetingId;
	}

	public void setMeetingId(Long meetingId) {
		this.meetingId = meetingId;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Date getMeetingDate() {
		return meetingDate;
	}

	public void setMeetingDate(Date meetingDate) {
		this.meetingDate = meetingDate;
	}
	
	@ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name="developer_meeting_tbl", 
                joinColumns={@JoinColumn(name="meetingId")}, 
                inverseJoinColumns={@JoinColumn(name="empid")})
	public List<Developer> getDevelopers() {
		return developers;
	}

	public void setDevelopers(List<Developer> developers) {
		this.developers = developers;
	}

	@Override
	public String toString() {
		return "Meetings [meetingId=" + meetingId + ", subject=" + subject + ", meetingDate=" + meetingDate
				+ ", developers=" + developers + "]";
	}

}
