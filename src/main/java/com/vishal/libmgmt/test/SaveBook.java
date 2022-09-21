package com.vishal.libmgmt.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.vishal.libmgmt.model.Book;

public class SaveBook {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure("com/vishal/libmgmt/resource/hibernate.cfg.xml")
				.addAnnotatedClass(Book.class).buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();

		Book theBook = new Book("Core Java An Integrated Approach", "Dr. R. Nageswara Rao", "Java");
		Book theBook1 = new Book("Head First Java", "Kathy Sierra", "Java");
		Book theBook2 = new Book("Thinking in Java", "Bruce Eckel", "Java");
		Book theBook3 = new Book("Let us C", "Yashavant P Kanetkar", "C");
		Book theBook4 = new Book("C: The Complete Reference", "Herbert Schildt", "C");
		Book theBook5 = new Book("Python Crash Course", "Eric Mathews", "Python");
		Book theBook6 = new Book("Head First Python", "Paul Harry", "Python");

		session.saveOrUpdate(theBook);
		session.saveOrUpdate(theBook1);
		session.saveOrUpdate(theBook2);
		session.saveOrUpdate(theBook3);
		session.saveOrUpdate(theBook4);
		session.saveOrUpdate(theBook5);
		session.saveOrUpdate(theBook6);

		session.getTransaction().commit();
		System.out.println("Records Save successfully!");

	}

}
