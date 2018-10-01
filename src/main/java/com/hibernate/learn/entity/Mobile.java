package com.hibernate.learn.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="mobiles_tbl")
public class Mobile {

	private long mid;
	private String color;
	private String vendor;
	private float price;
	private String model;
	private String os;
	private Battery battery;
	
	

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public long getMid() {
		return mid;
	}

	public void setMid(long mid) {
		this.mid = mid;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}
	
	
	//mappedBy means this object is not responsible for relationship
	@OneToOne(cascade=CascadeType.ALL,mappedBy="mobile",fetch=FetchType.EAGER)
	public Battery getBattery() {
		return battery;
	}

	public void setBattery(Battery battery) {
		this.battery = battery;
	}

	@Override
	public String toString() {
		return "Mobile [mid=" + mid + ", color=" + color + ", vendor=" + vendor + ", price=" + price + ", model="
				+ model + ", os=" + os + ", battery=" + battery + "]";
	}

}
