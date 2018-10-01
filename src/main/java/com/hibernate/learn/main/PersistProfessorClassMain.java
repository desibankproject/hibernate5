package com.hibernate.learn.main;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.hibernate.db.util.Hibernate4SessionFactoryUtil;
import com.hibernate.learn.entity.ProfessorClassAssigned;
import com.hibernate.learn.entity.ProfessorLectureComposityKey;

public class PersistProfessorClassMain {
	public static void main(String[] args) {
	    Session session=Hibernate4SessionFactoryUtil.getHibernate4Session();
	    //transaction demarcation
	    //Programmatically transaction management
	    session.getTransaction().begin();
	    ProfessorLectureComposityKey professorLectureComposityKey=new ProfessorLectureComposityKey("E9303","ME-IV-A","Operating System");
	    ProfessorClassAssigned professorClassAssigned=new ProfessorClassAssigned();
	    professorClassAssigned.setComposityKey(professorLectureComposityKey);
	    professorClassAssigned.setEmail("professor@gmail.com");
	    professorClassAssigned.setName("Mr. David King");
	    professorClassAssigned.setType("Lecture");
	    professorClassAssigned.setDoe(new Date());
	    ///////////////////////////////////
	    //now associate this employee instance with session
	    session.save(professorClassAssigned);
	    session.getTransaction().commit();
	    session.close();
	    System.out.println(professorClassAssigned); //here employee is into the database but not in session, is known as detached state
	     System.out.println(")@()#(#(#(#*#*&#&#&#& professorClassAssigned Saved!!!!!!!!!!!!");
	     
	}

}
