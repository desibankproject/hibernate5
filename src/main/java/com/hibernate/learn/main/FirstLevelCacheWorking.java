package com.hibernate.learn.main;

import java.util.Iterator;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;

import com.hibernate.db.util.Hibernate4SessionFactoryUtil;
import com.hibernate.learn.entity.Employee;

public class FirstLevelCacheWorking {
	
	public static void main(String[] args) {
		 Session session =Hibernate4SessionFactoryUtil.getHibernate4Session();
		//starting the transaction
		session.beginTransaction();
		//till here Laptop object is in transient state
		//attaching Laptop object into session
		//loading Laptop from database.
		System.out.println("Enter Empid for Employee!");
		Scanner scan=new Scanner(System.in);
		int id=scan.nextInt();
		
		Query query = session.createQuery("from Employee c where c.empid="+id); //This is HQL query!!!
		query.setCacheable(true);
		 Iterator it = query.list().iterator();
		 while (it.hasNext ()){
			 Employee p = (Employee) it.next();
			 System.out.println("Employee  =  "+p);
		 }

		 
		  System.out.println("Firing query second time!!!");
		  query = session.createQuery("from Employee c where c.empid="+id);
		  query.setCacheable(true);
		 it = query.list().iterator();
		 while (it.hasNext ()){
			 Employee p = (Employee) it.next();
			 System.out.println("Employee  =  "+p);
		 }       
		session.getTransaction().commit();
		session.close();
		//After closing the session object will be in detached state.
		System.out.println("Object is fetched");
	}
}
