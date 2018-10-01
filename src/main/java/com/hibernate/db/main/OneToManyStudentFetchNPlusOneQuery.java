package com.hibernate.db.main;

import java.util.List;

import javax.persistence.FetchType;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Query;
import org.hibernate.Session;

import com.hibernate.db.entity.MobileEntity;
import com.hibernate.db.entity.StudentEntity;
import com.hibernate.db.util.Hibernate4SessionFactoryUtil;

public class OneToManyStudentFetchNPlusOneQuery {
	public static void main(String[] args) {
		Session session=Hibernate4SessionFactoryUtil.getHibernate4Session();
		session.getTransaction().begin();
		Criteria criteria=session.createCriteria(StudentEntity.class);
		criteria.setFetchMode("mobiles", FetchMode.EAGER);
		
		List<StudentEntity>  studentList=criteria.list();
		for(StudentEntity entity:studentList){
			 List<MobileEntity> mobile=entity.getMobiles();
			 mobile.remove(0);
			 System.out.println(mobile);
			 System.out.println("___!@__________________________________________________________________");
			 System.out.println("___!@++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			 System.out.println("___!@__________________________________________________________________");
		}
		session.getTransaction().commit();
		System.out.println("Hey!!!!!!!!!!!! data  is fetched from the  database!!!!!!!");
	}

}
