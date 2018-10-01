package com.hibernate.db.main;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

import org.hibernate.Session;

import com.hibernate.db.entity.Frog;
import com.hibernate.db.entity.MobileEntity;
import com.hibernate.db.util.Hibernate4SessionFactoryUtil;

public class FindFrogMain {

	public static void main(String[] args) throws IOException {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the fid");
		int fid=scanner.nextInt();
		
		Session session=Hibernate4SessionFactoryUtil.getHibernate4Session();
		//Exception in thread "main" org.hibernate.LazyInitializationException: could not initialize proxy - no Session
		Frog  entity=(Frog)session.load(Frog.class, fid);
		 session.close();
	    System.out.println(entity);
	   
	}

}
