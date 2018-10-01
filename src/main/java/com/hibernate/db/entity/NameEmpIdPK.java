package com.hibernate.db.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

/**
 * 
 * @author nagen
 *  1. it must public and default constructor
 *  2. It must implements Serializable
 *  .load(Class,Serializable);
 */
@Embeddable
public class NameEmpIdPK implements Serializable{
	
	private String name;
	private String empid;
	
	public NameEmpIdPK(){
	}
	public NameEmpIdPK(String name, String empid) {
		this.name = name;
		this.empid = empid;
	}
	
	@Override
	public String toString() {
		return "NameEmpIdPK [name=" + name + ", empid=" + empid + "]";
	}
	
}
