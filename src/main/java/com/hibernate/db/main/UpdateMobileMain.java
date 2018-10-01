package com.hibernate.db.main;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

import org.hibernate.Session;

import com.hibernate.db.entity.MobileEntity;
import com.hibernate.db.util.Hibernate4SessionFactoryUtil;

public class UpdateMobileMain {

	public static void main(String[] args) throws IOException {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=scanner.next();
		
		System.out.println("Enter the color");
		String color=scanner.next();
	
		
		System.out.println("Enter the mid");
		int mid=scanner.nextInt();
		Session session=Hibernate4SessionFactoryUtil.getHibernate4Session();
		//starting the transaction
		session.getTransaction().begin();
		MobileEntity entity=(MobileEntity)session.load(MobileEntity.class,mid);
		entity.setName(name);
		entity.setColor(color);
		System.out.println("_@)@)@)@)State is updated!!!!!!!!!!!!!!!!!!!!");
		session.getTransaction().commit();
	    session.close();
	}

}
