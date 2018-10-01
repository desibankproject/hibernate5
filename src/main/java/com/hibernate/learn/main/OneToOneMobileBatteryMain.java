package com.hibernate.learn.main;

import org.hibernate.Session;

import com.hibernate.db.util.Hibernate4SessionFactoryUtil;
import com.hibernate.learn.entity.Battery;
import com.hibernate.learn.entity.Mobile;

public class OneToOneMobileBatteryMain {
	
	public static void main(String[] args) {
		Battery battery=new Battery();
		battery.setColor("black");
		battery.setLifetime("24Hr");
		battery.setPower("34MH");
		battery.setPrice(93993);
		battery.setVendor("CHINA");
		
		Mobile mobile=new Mobile();
		mobile.setColor("white");
		mobile.setModel("HT@VC@");
		mobile.setOs("Android");
		mobile.setPrice(239293);
		mobile.setVendor("Samsung");
		
		battery.setMobile(mobile);
		
		Session session=Hibernate4SessionFactoryUtil.getHibernate4Session();
		//starting the transaction
		session.getTransaction().begin();
		session.save(battery);
		session.getTransaction().commit();
		
	}

}
