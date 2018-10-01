package com.hibernate.db.cache;

import java.util.Scanner;

import org.hibernate.Session;

import com.hibernate.db.entity.Laptop;
import com.hibernate.db.util.Hibernate4SessionFactoryUtil;

public class FirstLevelSecondCaching {
	public static void main(String[] args) {
		Session session=Hibernate4SessionFactoryUtil.getHibernate4Session();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the lid");
		int lid=scanner.nextInt();
	
		///Loading laptop entity first time
		System.out.println("___Loading data firsttime__________");
		Laptop laptop=(Laptop)session.load(Laptop.class, lid);
		System.out.println("Hashcode  = == "+laptop.hashCode());
		System.out.println(laptop);
		System.out.println("_________________________Ahaha_______________________________");
		System.out.println("_________________________Ahaha_______________________________");
		System.out.println("((@(@Hey  I am going to load same entity!!!!!!!!!!!!!!!!!!!!");
		System.out.println("___Loading data second time__________");
		laptop=(Laptop)session.load(Laptop.class, lid);
		System.out.println("Hashcode  = == "+laptop.hashCode());
		System.out.println(laptop);
		System.out.println("_________________________Ahaha_______________________________");
		System.out.println("_________________________Ahaha_______________________________");
		System.out.println("_@)@(@*@&@&@&Query is not fired so far................");
		System.out.println("___closing the session____");
		session.close();
		session=Hibernate4SessionFactoryUtil.getHibernate4Session();
		System.out.println("___Loading data third time__________");
		laptop=(Laptop)session.load(Laptop.class, lid);
		System.out.println("Hashcode  = == "+laptop.hashCode());
		System.out.println(laptop);
		System.out.println("_@)@(@*@&@&@&Query is not fired so far................");
	}

}
