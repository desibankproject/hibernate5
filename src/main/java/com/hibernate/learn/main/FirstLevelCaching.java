package com.hibernate.learn.main;

import java.util.Scanner;

import org.hibernate.Session;

import com.hibernate.db.entity.Laptop;
import com.hibernate.db.util.Hibernate4SessionFactoryUtil;
import com.hibernate.learn.entity.Employee;

public class FirstLevelCaching {
	public static void main(String[] args) {
		Session session=Hibernate4SessionFactoryUtil.getHibernate4Session();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the empid");
		int lid=scanner.nextInt();
	
		long ct=System.currentTimeMillis();
		System.out.println("C = "+ct);
		///Loading laptop entity first time
		System.out.println("___Loading data firsttime__________");
		Employee employee=(Employee)session.load(Employee.class, lid);
		//employee=(Employee)session.load(Employee.class, lid);
		System.out.println("Hashcode  = == "+employee.hashCode());
		System.out.println(employee); //first time query will be fired
		System.out.println("_________________________Ahaha_______________________________");
		System.out.println("_________________________Ahaha_______________________________");
		System.out.println("((@(@Hey  I am going to load same entity!!!!!!!!!!!!!!!!!!!!");
		System.out.println("___Loading data second time__________");
		employee=(Employee)session.load(Employee.class, lid);
		System.out.println("Hashcode  = == "+employee.hashCode());
		System.out.println(employee);
		System.out.println("_________________________Ahaha_______________________________");
		System.out.println("_________________________Ahaha_______________________________");
		System.out.println("_@)@(@*@&@&@&Query is not fired so far................");
		System.out.println("___closing the session____");
		session.close();
		//here first level caching will be destroy
		session=Hibernate4SessionFactoryUtil.getHibernate4Session();
		System.out.println("___Loading data third time__________");
		employee=(Employee)session.load(Employee.class, lid);
		System.out.println("Hashcode  = == "+employee.hashCode());
		System.out.println(employee);
		long et=System.currentTimeMillis();
		System.out.println("___Waiting time is   =  "+(et-ct)+ "milliseconds");
		System.out.println("_@)@(@*@&@&@&Query is not fired so far................");
	}

}
