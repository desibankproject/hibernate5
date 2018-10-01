package com.hibernate.learn.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.hibernate.learn.entity.Employee;

public class PersistEmployee {
	public static void main(String[] args) {
		//
		Configuration configuration=new Configuration();
		configuration=configuration.configure();//loading the hibernate.cfg.xml and compile the data in such 
		//a format which hibernate can understand
		ServiceRegistry  serviceRegistry  = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
	    SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
	    //In Hibernate if you want to talk to the database fetch a session from sessionFactory
	    Session session=sessionFactory.openSession();
	    //transaction demarcation
	    //Programmatically transaction management
	    session.getTransaction().begin();
	    Employee employee=new Employee("devidking","king@gmail.com","234322","California","M.Tech");
	    ///////////////////////////////////
	    //now associate this employee instance with session
	    session.save(employee);
	    session.getTransaction().commit();
	    session.close();
	    System.out.println(employee); //here employee is into the database but not in session, is known as detached state
	     System.out.println(")@()#(#(#(#*#*&#&#&#&Saved!!!!!!!!!!!!");
	     
	}

}
