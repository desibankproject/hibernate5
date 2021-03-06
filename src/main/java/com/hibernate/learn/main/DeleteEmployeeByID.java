package com.hibernate.learn.main;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.hibernate.db.util.Hibernate4SessionFactoryUtil;
import com.hibernate.learn.entity.Employee;

public class DeleteEmployeeByID {
	public static void main(String[] args) {
	    //In Hibernate if you want to talk to the database fetch a session from sessionFactory
	    Session session=Hibernate4SessionFactoryUtil.getHibernate4Session();
	    Scanner scanner=new Scanner(System.in);
	    System.out.println("Enter the empid");
	    int empid=scanner.nextInt();
	    
	    session.getTransaction().begin();
	    //load and get method are used to load the Entity based on it;s primary key
	    Employee employee=(Employee)session.load(Employee.class,empid);
	    session.delete(employee);
	    session.getTransaction().commit();
	    session.close();
	    System.out.println(employee);
	    
	     System.out.println(")@()#(#(#(#*#*&delete&#&#&Saved!!!!!!!!!!!!");
	     
	}

}
