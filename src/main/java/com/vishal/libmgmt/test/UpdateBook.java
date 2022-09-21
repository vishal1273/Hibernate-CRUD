package com.vishal.libmgmt.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.vishal.libmgmt.model.Book;

public class UpdateBook {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure("com/vishal/libmgmt/resource/hibernate.cfg.xml")
				.addAnnotatedClass(Book.class).buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();

		Book theBook = session.load(Book.class, 1);
		theBook.setTitle("Thinking in Java");
		theBook.setAuthor("Bruce Eckel");
		System.out.println(theBook);
		session.getTransaction().commit();
		System.out.println("Records Update successfully!");

	}

}
