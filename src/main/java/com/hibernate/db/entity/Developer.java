package com.hibernate.db.entity;

import java.util.ArrayList;
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
@Table(name="developer_tbl")
public class Developer {

	private int empid;
	private String name;
	private String designation;
	private String companyName;
	private String workLocation;
	private List<Meetings> meetings=new ArrayList<>();
	
	public Developer(){
		
	}
	
	public Developer(int empid, String name, String designation, String companyName, String workLocation) {
		super();
		this.empid = empid;
		this.name = name;
		this.designation = designation;
		this.companyName = companyName;
		this.workLocation = workLocation;
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

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getWorkLocation() {
		return workLocation;
	}

	public void setWorkLocation(String workLocation) {
		this.workLocation = workLocation;
	}
	

	@ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name="developer_meeting_tbl", 
                joinColumns={@JoinColumn(name="empid")}, 
                inverseJoinColumns={@JoinColumn(name="meetingId")})
	public List<Meetings> getMeetings() {
		return meetings;
	}

	public void setMeetings(List<Meetings> meetings) {
		this.meetings = meetings;
	}

	@Override
	public String toString() {
		return "Developer [empid=" + empid + ", name=" + name + ", designation=" + designation + ", companyName="
				+ companyName + ", workLocation=" + workLocation + ", meetings=" + meetings + "]";
	}

}
