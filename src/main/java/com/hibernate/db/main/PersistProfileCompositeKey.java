package com.hibernate.db.main;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

import org.hibernate.Session;

import com.hibernate.db.entity.MobileEntity;
import com.hibernate.db.entity.ProfileEntity;
import com.hibernate.db.util.Hibernate4SessionFactoryUtil;

public class PersistProfileCompositeKey {

	public static void main(String[] args) throws IOException {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=scanner.next();
		
		System.out.println("Enter the empid");
		String empid=scanner.next();
		
		
		System.out.println("Enter the address");
		String address=scanner.next();
		
		System.out.println("Enter the email");
		String email=scanner.next();
		System.out.println("Enter the age");
		int age=scanner.nextInt();

		ProfileEntity entity=new  ProfileEntity(name, empid, email, age, address);
		
		Session session=Hibernate4SessionFactoryUtil.getHibernate4Session();
		//starting the transaction
		session.getTransaction().begin();
		session.save(entity);
		session.getTransaction().commit();
	    session.close();
	    System.out.println(entity);
	}

}
