package com.vishal.empmgmt.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.vishal.empmgmt.model.Employee;

public class SaveEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sf = new Configuration().configure("com/vishal/libmgmt/resource/hibernate.cfg.xml").
				buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		Employee emp = new Employee("XX", "XX", 10000);
		session.save(emp);
		session.getTransaction().commit();
		System.out.println("Record Save Successfully!");

	}

}
