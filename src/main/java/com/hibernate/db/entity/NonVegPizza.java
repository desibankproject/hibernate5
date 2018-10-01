package com.hibernate.db.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
//@Table(name="hnonpizza_tbl")
@DiscriminatorValue(value="NP")
public class NonVegPizza extends Pizza {

	private String toppings;
	private String meatType;
	private float price;

	public String getToppings() {
		return toppings;
	}

	public void setToppings(String toppings) {
		this.toppings = toppings;
	}

	@Column(length=20)
	public String getMeatType() {
		return meatType;
	}

	public void setMeatType(String meatType) {
		this.meatType = meatType;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "NonVegPizza [toppings=" + toppings + ", meatType=" + meatType + ", price=" + price + "]";
	}

}
