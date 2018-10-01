package com.hibernate.db.main;

import java.io.IOException;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.hibernate.db.entity.Frog;
import com.hibernate.db.util.Hibernate4SessionFactoryUtil;

public class FindFrogsMain {

	public static void main(String[] args) throws IOException {
		
		Session session=Hibernate4SessionFactoryUtil.getHibernate4Session();
		Query query=session.createQuery("from Frog");
		List<Frog> frogs =query.list();
		for(Frog frog: frogs){
			System.out.println(frog);
		}
	    
	}

}
