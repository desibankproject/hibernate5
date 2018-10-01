package com.hibernate.learn.main;

import java.util.Date;

import org.hibernate.Session;

import com.hibernate.db.entity.Developer;
import com.hibernate.db.entity.Meetings;
import com.hibernate.db.util.Hibernate4SessionFactoryUtil;

public class ManyToManyMain {
	
	public static void main(String[] args) {
		
		Session session = Hibernate4SessionFactoryUtil.getHibernate4Session();
        session.beginTransaction();
        
        Meetings meeting1=new Meetings("Hibernate Session",new Date());
        Meetings meeting2=new Meetings("Spring 4.x Session",new Date());

        Developer developer1=new Developer(401717,"Nagendra","Technical Architect","Abc","Noduet1cdd");
        Developer developer2=new Developer(871314,"Amit Kumar","Technical Manager","Oracle","Bangalore!!!!");
        developer1.getMeetings().add(meeting1);
        developer1.getMeetings().add(meeting2);
        developer2.getMeetings().add(meeting1);
        developer2.getMeetings().add(meeting2);
         
        session.save(developer1);
        session.save(developer2);
         
        session.getTransaction().commit();
        session.close();
	}

}
