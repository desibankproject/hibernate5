package com.hibernate.db.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class Hibernate4SessionFactoryUtil {
	
	public static SessionFactory  sessionFactory;
	
	static {
		Configuration configuration=new Configuration();
		//configuration is loaded into the memory
		//configure( "/hibernate.cfg.xml" );
		 configuration.configure(); //src/main/resources/hibernate.cfg.xml
		 //Now we have to make SessionFactory
		 ServiceRegistry  serviceRegistry  = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
	      sessionFactory = configuration.buildSessionFactory(serviceRegistry);
	}
	
	public static Session getHibernate4Session(){
		return sessionFactory.openSession();
	}

}
