package com.hibernate.db.main;

import java.util.Date;
import java.util.Scanner;

import org.hibernate.Session;

import com.hibernate.db.entity.Passport;
import com.hibernate.db.entity.Person;
import com.hibernate.db.util.Hibernate4SessionFactoryUtil;

public class GetWithPassportDemo {
	
	public static void main(String[] args) {
		
		Session session=Hibernate4SessionFactoryUtil.getHibernate4Session();
		Passport passport=new  Passport();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the address");
		String address=scanner.next();
		passport.setAddress(address);
		passport.setExpDate(new Date());
		passport.setLocation("Nehru sss , @3333");
		System.out.println("Enter the year");
		String year=scanner.next();
		passport.setYear(year);
		
		System.out.println("Enter the passNumber");
		String passNumber=scanner.next();
		passport.setNumber(passNumber);
		
		System.out.println("Enter the personid");
		int personid=scanner.nextInt();
		session.getTransaction().begin();
		Person person=(Person)session.get(Person.class,personid);	
		
		//I child we have to always set master
		passport.setPerson(person); //because passport is responsible for maintaining the relationship so it;s mandatory
		
		session.save(passport);
		session.getTransaction().commit();
		System.out.println("Hey!!!!!!!!!!!! Passport  is saved into the database!!!!!!!");
		System.out.println("Hey!!!!!!!!!!!! Passport  is saved into the database!!!!!!!");
		
	}

}
