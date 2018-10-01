package com.hibernate.db.main;

import java.util.Date;

import org.hibernate.Session;

import com.hibernate.db.entity.Passport;
import com.hibernate.db.entity.Person;
import com.hibernate.db.util.Hibernate4SessionFactoryUtil;

public class SavePersonDemo {
	public static void main(String[] args) {
		Session session=Hibernate4SessionFactoryUtil.getHibernate4Session();
		Passport passport=new  Passport();
		passport.setAddress("New sssss, 20202");
		passport.setExpDate(new Date());
		passport.setLocation("Nehru sss , @3333");
		passport.setYear("2007");
		passport.setNumber("YSDH3338");
		
		Person person=new Person();
		person.setEmail("okaya@gmail.com");
		person.setGender("Male");
		person.setMobile("02938383");
		person.setName("Mr. Kumar Dave");
		
		//I child we have to always set master
		///passport.setPerson(person); //because passport is responsible for maintaining the relationship so it;s mandatory
	
		session.getTransaction().begin();
		session.save(passport);
		session.getTransaction().commit();
		System.out.println("Hey!!!!!!!!!!!! Object is in database!!!!!!!");
	}

}
