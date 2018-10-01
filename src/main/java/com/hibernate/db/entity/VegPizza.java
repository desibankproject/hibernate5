package com.hibernate.db.entity;

import java.io.Serializable;
import java.util.Arrays;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
/*@Table(name="vegpizza_tbl")*/
/*@AttributeOverrides({
    @AttributeOverride(name="description", column=@Column(name="vdescription"))
})
*/
@DiscriminatorValue(value="VP")
public class VegPizza extends Pizza implements  Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String toppings;
	private float price;
	private byte[] photo;

	public String getToppings() {
		return toppings;
	}

	public void setToppings(String toppings) {
		this.toppings = toppings;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

	@Override
	public String toString() {
		return "VegPizza [toppings=" + toppings + ", price=" + price + ", photo=" + Arrays.toString(photo) + "]";
	}

}
