package com.hibernate.db.main;

import org.hibernate.Session;

import com.hibernate.db.entity.NonVegPizza;
import com.hibernate.db.entity.Pizza;
import com.hibernate.db.entity.VegPizza;
import com.hibernate.db.util.Hibernate4SessionFactoryUtil;

public class TablePerClassMain {
	
	public static void main(String[] args) {
		
		Session session=Hibernate4SessionFactoryUtil.getHibernate4Session();
		//start the transaction
		session.getTransaction().begin(); 
		//here we can write our queries.............
		Pizza pizza=new Pizza();
		//pizza.setPid(100);
		pizza.setBase("Plain");
		pizza.setSize("Medium");
		pizza.setType("Stylish");
		pizza.setDescription("Everyone should eat pizza daily ... because good for taste");
		
		VegPizza vegPizza=new VegPizza();
		//vegPizza.setPid(200);
		vegPizza.setBase("Plain");
		vegPizza.setSize("Medium");
		vegPizza.setType("Stylish");
		vegPizza.setDescription("Everyone should eat pizza daily ... because good for taste");
		vegPizza.setToppings("cheese,onion,masroom'");
		vegPizza.setPrice(250);
		
		
		NonVegPizza nonvegPizza=new NonVegPizza();
		//nonvegPizza.setPid(300);
		nonvegPizza.setBase("Cheese Burst");
		nonvegPizza.setSize("Family");
		nonvegPizza.setType("non stylish");
		nonvegPizza.setDescription("Everyone should not eat non veg pizza daily ... because it;s bad for taste");
		nonvegPizza.setToppings("fish,gee,masroom'");
		nonvegPizza.setPrice(400);
		
		session.save(pizza);
		session.save(vegPizza);
		//String str=null;
		//str.toCharArray();//NullPointerException
		session.save(nonvegPizza);
		
		session.getTransaction().commit();
	}

}
