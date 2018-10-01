package com.hibernate.db.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;

@Entity
@Table(name="frogs_tbl")
//@Cache(usage=org.hibernate.annotations.CacheConcurrencyStrategy.READ_WRITE)
public final class Frog {
	
	private int fid;
	private String name;
	private String color;
	private int price;	
	private byte[] image;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getFid() {
		return fid;
	}

	public void setFid(int fid) {
		this.fid = fid;
	}

	
	@Column(length=100)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	@Column(columnDefinition="longblob")
	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "Frog [fid=" + fid + ", name=" + name + ", color=" + color + ", price=" + price + "]";
	}

}
