package com.hibernate.learn.main;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;

import com.hibernate.db.util.Hibernate4SessionFactoryUtil;
import com.hibernate.learn.entity.Employee;

public class FindEmployeeByName {
	public static void main(String[] args) {
	    //In Hibernate if you want to talk to the database fetch a session from sessionFactory
	    Session session=Hibernate4SessionFactoryUtil.getHibernate4Session();
	    Scanner scanner=new Scanner(System.in);
	    System.out.println("Enter the employee name");
	    String name=scanner.next();
	    Query query=session.createQuery("from Employee e where e.name=?");//HQL -Hibernate Query Language which is database independent
	    //In HQL we write query on class and it;s attribute instead of database tables and columns.
	    //native query - SQL()
	    query.setParameter(0, name);
	    List<Employee> employees=query.list();
	    System.out.println(employees);
	    
	    System.out.println(")@()#(#(#(#*#*&#&#&#&Saved!!!!!!!!!!!!");
	     
	}

}
