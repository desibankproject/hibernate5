package com.hibernate.db.main;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

import org.hibernate.Session;

import com.hibernate.db.entity.MobileEntity;
import com.hibernate.db.util.Hibernate4SessionFactoryUtil;

public class PersistMobileMain {

	public static void main(String[] args) throws IOException {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=scanner.next();
		
		System.out.println("Enter the color");
		String color=scanner.next();
	
		
		System.out.println("Enter the model");
		String model=scanner.next();
		
		System.out.println("Enter the price");
		float price=scanner.nextFloat();
		
		System.out.println("Enter the image path");
		String ppath=scanner.next();
		File fi = new File(ppath);
		byte[] fileContent = Files.readAllBytes(fi.toPath());
		
		MobileEntity entity=new MobileEntity(0, name, model, color, price,fileContent);
		
		Session session=Hibernate4SessionFactoryUtil.getHibernate4Session();
		//starting the transaction
		session.getTransaction().begin();
		session.save(entity);
		session.getTransaction().commit();
	    session.close();
	    System.out.println(entity);
	}

}
