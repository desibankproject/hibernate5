package com.hibernate.learn.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="battery_tbl")
public class Battery {
	
	private int bid;
	private String vendor;
	private String power;
	private String lifetime;
	private String color;
	private float price;
	
	private Mobile mobile;
	

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="fmid",nullable=true)
	public Mobile getMobile() {
		return mobile;
	}

	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}

	public String getLifetime() {
		return lifetime;
	}

	public void setLifetime(String lifetime) {
		this.lifetime = lifetime;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Battery [bid=" + bid + ", vendor=" + vendor + ", power=" + power + ", lifetime=" + lifetime + ", color="
				+ color + ", price=" + price + "]";
	}

}
