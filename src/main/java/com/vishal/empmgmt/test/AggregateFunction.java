package com.vishal.empmgmt.test;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.vishal.empmgmt.model.Employee;

public class AggregateFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sf = new Configuration().configure("com/vishal/libmgmt/resource/hibernate.cfg.xml")
				.addAnnotatedClass(Employee.class).buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();

		// Example to get maximum salary of employee
		Query maxSalary = session.createQuery("select max(salary) from Employee");
		int maxSal = (Integer) maxSalary.getSingleResult();
		System.out.println(maxSal);

		// Example to get minimum salary of employee
		Query minSalary = session.createQuery("select min(salary) from Employee");
		int minSal = (Integer) minSalary.getSingleResult();
		System.out.println(minSal);

		//Example to count total number of employee ID
		Query totalEmp = session.createQuery("select count(id)from Employee");
		Long total = (Long) totalEmp.getSingleResult();
		System.out.println("Total Number of Employee: "+total);

		//Example to get average salary of each employees
		Query avgSal = session.createQuery("select avg(salary)from Employee");
		double aSal = (Double) avgSal.getSingleResult();
		System.out.println("Average Salary of Employee: "+aSal);
		session.getTransaction().commit();
	}

}
