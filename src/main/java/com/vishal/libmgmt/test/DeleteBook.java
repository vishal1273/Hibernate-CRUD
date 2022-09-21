package com.vishal.libmgmt.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.vishal.libmgmt.model.Book;

public class DeleteBook {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure("com/vishal/libmgmt/resource/hibernate.cfg.xml")
				.addAnnotatedClass(Book.class).buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		Book book = session.load(Book.class,1);
		System.out.println(book);
		session.delete(book);
		tx.commit();
		session.close();
		sf.close();
	}

}
