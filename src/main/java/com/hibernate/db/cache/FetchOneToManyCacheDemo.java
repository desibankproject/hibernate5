package com.hibernate.db.cache;

import java.util.List;

import org.hibernate.Session;

import com.hibernate.db.entity.Human;
import com.hibernate.db.entity.Laptop;
import com.hibernate.db.util.Hibernate4SessionFactoryUtil;

public class FetchOneToManyCacheDemo {
	
	public static void main(String[] args) {
		Session session=Hibernate4SessionFactoryUtil.getHibernate4Session();
		int count=0;
		Human human=(Human)session.load(Human.class,1);
		System.out.println("human.hashCode() = "+human.hashCode());
		System.out.println(human);
		System.out.println("_______Loading the data second time_____for same human whose pid 1");
		
		human=(Human)session.load(Human.class,1);
		List<Laptop> laptops=human.getLaptops();
		System.out.println(human);
		System.out.println("Person.hashCode() = "+human.hashCode());
		System.out.println("Total number of queries are = "+count);
		//
		System.out.println("___________Dealing with second level caching_______________________________");
		System.out.println("___________Dealing with second level caching_______________________________");
		System.out.println("___________Dealing with second level caching_______________________________");
		session.close();
		System.out.println("___________Session is closed now________________");
		session=Hibernate4SessionFactoryUtil.getHibernate4Session();
		System.out.println("_______Loading Human record once again from another session...................");
		human=(Human)session.load(Human.class,1);
		human=(Human)session.load(Human.class,1);
		System.out.println(human);
		System.out.println("Person.hashCode() = "+human.hashCode());		
	}
}
