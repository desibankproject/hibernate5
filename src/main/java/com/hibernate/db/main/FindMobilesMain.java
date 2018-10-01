package com.hibernate.db.main;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;

import com.hibernate.db.entity.MobileEntity;
import com.hibernate.db.util.Hibernate4SessionFactoryUtil;

public class FindMobilesMain {

	public static void main(String[] args) throws IOException {
		
		Session session=Hibernate4SessionFactoryUtil.getHibernate4Session();
		Query  query=session.createQuery("select me.mid,me.color,me.model,me.name,me.price from MobileEntity as me");
		 List<Object[]> employees= (List<Object[]>)query.list();
		 for(Object[] employee: employees){
	         Integer id = (Integer)employee[0];
	         String color = (String)employee[1];
	         String model = (String)employee[2];
	         String name = (String)employee[3];
	         float price = (Float)employee[4];
	         System.out.println(" id - "+id);
	         System.out.println(" color - "+color);
	         System.out.println(" model - "+model);
	         System.out.println(" price - "+price);
	         System.out.println("___________________________@@@@@@@@@+__________________");
	         
	     }
		
	}

}
