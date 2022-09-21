package com.vishal.libmgmt.test;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.vishal.libmgmt.model.Book;

public class ConnectionTest {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure("com/vishal/libmgmt/resource/hibernate.cfg.xml")
				.addAnnotatedClass(Book.class).buildSessionFactory();


	}

}
