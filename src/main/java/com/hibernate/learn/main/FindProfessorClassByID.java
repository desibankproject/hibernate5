package com.hibernate.learn.main;

import java.util.Scanner;

import org.hibernate.Session;

import com.hibernate.db.util.Hibernate4SessionFactoryUtil;
import com.hibernate.learn.entity.ProfessorClassAssigned;
import com.hibernate.learn.entity.ProfessorLectureComposityKey;

public class FindProfessorClassByID {
	public static void main(String[] args) {
	    //In Hibernate if you want to talk to the database fetch a session from sessionFactory
	    Session session=Hibernate4SessionFactoryUtil.getHibernate4Session();
	    Scanner scanner=new Scanner(System.in);
	    System.out.println("Enter the empid");
	    String empid=scanner.next();
	    
	    System.out.println("Enter the class");
	    String cclass=scanner.next();
	    
	    System.out.println("Enter the subject");
	    String subject=scanner.next();
	    
	    ProfessorLectureComposityKey professorLectureComposityKey=new ProfessorLectureComposityKey(empid,cclass,subject);
	    
	    //load and get method are used to load the Entity based on it;s primary key
	    ProfessorClassAssigned employee=(ProfessorClassAssigned)session.get(ProfessorClassAssigned.class,professorLectureComposityKey);
	    System.out.println(employee);
	     System.out.println(")@()#(#(#(#*#*&#&#&#&Saved!!!!!!!!!!!!");
	     
	}

}
