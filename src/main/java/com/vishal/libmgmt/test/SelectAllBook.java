package com.vishal.libmgmt.test;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.vishal.libmgmt.model.Book;

public class SelectAllBook {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure("com/vishal/libmgmt/resource/hibernate.cfg.xml")
				.addAnnotatedClass(Book.class).buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		Query query = session.createQuery("from Book");
		List<Book> books = query.getResultList();
		tx.commit();
		for (Book book : books) {
			System.out.println(book);
		}
		session.close();
		sf.close();
	}

}
