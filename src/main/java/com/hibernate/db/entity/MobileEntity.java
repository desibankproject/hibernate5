package com.hibernate.db.entity;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity //it is responsible to persist java object into the database
@Table(name="mobile_tbl")
public class MobileEntity {
	
		private int mid;
		private String name;
		private String model;
		private String color;
		private float price;
		private byte[] photo;
		
		private StudentEntity student;
		
		
		@ManyToOne
		@JoinColumn(name="fmid",nullable=false)
		public StudentEntity getStudent() {
			return student;
		}

		public void setStudent(StudentEntity student) {
			this.student = student;
		}

		public MobileEntity(){
		}
		
		public MobileEntity(int mid, String name, String model, String color, float price, byte[] photo) {
			super();
			this.mid = mid;
			this.name = name;
			this.model = model;
			this.color = color;
			this.price = price;
			this.photo = photo;
		}

		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		public int getMid() {
			return mid;
		}

		public void setMid(int mid) {
			this.mid = mid;
		}

		@Column(name="cname",length=100)
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getModel() {
			return model;
		}

		public void setModel(String model) {
			this.model = model;
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
		
		@Column(columnDefinition="longblob")
		public byte[] getPhoto() {
			return photo;
		}

		public void setPhoto(byte[] photo) {
			this.photo = photo;
		}

		@Override
		public String toString() {
			return "MobileEntity [mid=" + mid + ", name=" + name + ", model=" + model + ", color=" + color + ", price="
					+ price + ", photo=" + Arrays.toString(photo) + ", student=" + student + "]";
		}

}
