package com.hibernate.db.cache;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.stat.Statistics;

import com.hibernate.db.entity.Frog;
import com.hibernate.db.util.Hibernate4SessionFactoryUtil;

public class FirstLevelSecondCachingWithFrog {
	 private final static NumberFormat NF = new DecimalFormat("0.0###");
	public static void main(String[] args) {
		Session session=Hibernate4SessionFactoryUtil.getHibernate4Session();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the lid");
		int lid=scanner.nextInt();
		
		Statistics statistics = Hibernate4SessionFactoryUtil.sessionFactory.getStatistics();
	      statistics.setStatisticsEnabled(true);

	      long hit0 = statistics.getQueryCacheHitCount();
	      long miss0 = statistics.getSecondLevelCacheMissCount();
	
		///Loading laptop entity first time
		System.out.println("___Loading data firsttime__________");
		Frog laptop=(Frog)session.load(Frog.class, lid);
		
		  /*long hit1 = statistics.getQueryCacheHitCount();
	      long miss1 = statistics.getQueryCacheMissCount();*/
	      
	      long hit1 = statistics.getSecondLevelCacheHitCount();
	      long miss1 = statistics.getSecondLevelCacheMissCount();
	      System.out.println("hit1"+hit1);
	      System.out.println("miss1 = "+miss1);
		
		System.out.println("Hashcode  = == "+laptop.hashCode());
		System.out.println(laptop);
		System.out.println("_________________________Ahaha_______________________________");
		System.out.println("_________________________Ahaha_______________________________");
		System.out.println("((@(@Hey  I am going to load same entity!!!!!!!!!!!!!!!!!!!!");
		System.out.println("___Loading data second time__________");
		laptop=(Frog)session.load(Frog.class, lid);
		  long hit2 = statistics.getSecondLevelCacheHitCount();
	      long miss2 = statistics.getSecondLevelCacheMissCount();
	      System.out.println("hit2 = "+hit2);
	      System.out.println("miss2 = "+miss2);
		System.out.println("Hashcode  = == "+laptop.hashCode());
		System.out.println(laptop);
		System.out.println("_________________________Ahaha_______________________________");
		System.out.println("_________________________Ahaha_______________________________");
		System.out.println("_@)@(@*@&@&@&Query is not fired so far................");
		System.out.println("___closing the session____");
		session.close();
		session=Hibernate4SessionFactoryUtil.getHibernate4Session();
		System.out.println("___Loading data third time__________");
		laptop=(Frog)session.load(Frog.class, lid);
		
		  long hit3 = statistics.getSecondLevelCacheHitCount();
	      long miss3 = statistics.getSecondLevelCacheMissCount();
	      System.out.println("hit3 = "+hit3);
	      System.out.println("miss3 = "+miss3);
	      
		System.out.println("Hashcode  = == "+laptop.hashCode());
		System.out.println(laptop);
		System.out.println("_@)@(@*@&@&@&Query is not fired so far................");
		
		session.close();
		session=Hibernate4SessionFactoryUtil.getHibernate4Session();
		System.out.println("___Loading data fourth time__________");
		laptop=(Frog)session.load(Frog.class, lid);
		System.out.println(laptop);
		  long hit4 = statistics.getSecondLevelCacheHitCount();
	      long miss4 = statistics.getSecondLevelCacheMissCount();
	      System.out.println("hit4"+hit4);
	      System.out.println("miss4 = "+miss4);
	}

}
