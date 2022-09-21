package com.vishal.empmgmt.test;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.vishal.empmgmt.model.Employee;

public class UpdateEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sf = new Configuration().configure("com/vishal/libmgmt/resource/hibernate.cfg.xml")
				.addAnnotatedClass(Employee.class).buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		Query query = session.createQuery("update Employee set salary = :sal where id = :empId");
		query.setParameter("sal", 10000);
		query.setParameter("empId", 8);
		int status = query.executeUpdate();
		System.out.println(status);
		//session.getTransaction().commit();
	}

}
