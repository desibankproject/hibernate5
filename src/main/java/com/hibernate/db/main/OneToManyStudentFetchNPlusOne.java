package com.hibernate.db.main;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.hibernate.db.entity.MobileEntity;
import com.hibernate.db.entity.StudentEntity;
import com.hibernate.db.util.Hibernate4SessionFactoryUtil;

public class OneToManyStudentFetchNPlusOne {
	public static void main(String[] args) {
		Session session=Hibernate4SessionFactoryUtil.getHibernate4Session();
		Query query=session.createQuery("from StudentEntity");
		List<StudentEntity>  studentList=query.list();
		for(StudentEntity entity:studentList){
			 List<MobileEntity> mobile=entity.getMobiles();
			 System.out.println(mobile);
			 System.out.println("___!@__________________________________________________________________");
			 System.out.println("___!@++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			 System.out.println("___!@__________________________________________________________________");
		}
		System.out.println("Hey!!!!!!!!!!!! data  is fetched from the  database!!!!!!!");
	}

}
