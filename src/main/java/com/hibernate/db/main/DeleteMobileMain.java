package com.hibernate.db.main;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

import org.hibernate.Session;

import com.hibernate.db.entity.MobileEntity;
import com.hibernate.db.util.Hibernate4SessionFactoryUtil;

public class DeleteMobileMain {

	public static void main(String[] args) throws IOException {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the mid");
		int mid=scanner.nextInt();
		Session session=Hibernate4SessionFactoryUtil.getHibernate4Session();
		//starting the transaction
		session.getTransaction().begin();
		//loading entity on the basis of primary
		MobileEntity mobileEntity=(MobileEntity)session.load(MobileEntity.class, mid);
		session.delete(mobileEntity);		
		session.getTransaction().commit();
	    session.close();
	}

}
