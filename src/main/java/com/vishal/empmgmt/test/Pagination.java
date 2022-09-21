package com.vishal.empmgmt.test;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.vishal.empmgmt.model.Employee;
import com.vishal.libmgmt.model.Book;

public class Pagination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sf = new Configuration().configure("com/vishal/libmgmt/resource/hibernate.cfg.xml")
				.addAnnotatedClass(Book.class).buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		Query query = session.createQuery("from Employee");
		List<Employee> emps = query.getResultList();
		for (Employee employee : emps) {
			System.out.println(employee);
		}
	}

}
