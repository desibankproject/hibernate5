package com.hibernate.learn.main;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;

import com.hibernate.db.entity.MobileEntity;
import com.hibernate.db.entity.StudentEntity;
import com.hibernate.db.util.Hibernate4SessionFactoryUtil;

public class OneToManyStudentMobile {
	public static void main(String[] args) {
		Session session=Hibernate4SessionFactoryUtil.getHibernate4Session();
		
		StudentEntity studentEntity=new StudentEntity();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the email");
		String email=scanner.next();
		studentEntity.setEmail(email);
		System.out.println("Enter the mobile");
		String mobile=scanner.next();
		studentEntity.setMobile(mobile);
		
		System.out.println("Enter the name");
		String name=scanner.next();
		studentEntity.setName(name);
		
		MobileEntity mobileEntity1=new MobileEntity();
		System.out.println("Enter the color");
		String color=scanner.next();
		mobileEntity1.setColor(color);
		mobileEntity1.setModel("S0292");
		mobileEntity1.setName("HTC");
		mobileEntity1.setPrice(1222.6F);
		mobileEntity1.setStudent(studentEntity);
		
		MobileEntity mobileEntity2=new MobileEntity();
		mobileEntity2.setColor("black");
		mobileEntity2.setModel("S0292");
		mobileEntity2.setName("Samsung");
		mobileEntity2.setPrice(1342.6F);
		mobileEntity2.setStudent(studentEntity);
		
		
		MobileEntity mobileEntity3=new MobileEntity();
		mobileEntity3.setColor("silver");
		mobileEntity3.setModel("S0292S");
		mobileEntity3.setName("iPhone");
		mobileEntity3.setPrice(3331342.6F);
		mobileEntity3.setStudent(studentEntity);
		
		List<MobileEntity> mobiles=new ArrayList<>();
		mobiles.add(mobileEntity1);
		mobiles.add(mobileEntity2);
		mobiles.add(mobileEntity3);
		studentEntity.setMobiles(mobiles);
		
			
		session.getTransaction().begin();
		session.save(studentEntity);
		
		
		session.getTransaction().commit();
		System.out.println("Hey!!!!!!!!!!!! Object is in database!!!!!!!");
	}

}
