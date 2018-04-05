package com.luv2code.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.demo.entity.Instructor;
import com.luv2code.demo.entity.InstructorDetail;

public class DeleteDemo {

	public static void main(String[] args) {
									 
		SessionFactory factory = new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(Instructor.class)
									.addAnnotatedClass(InstructorDetail.class)
									.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			int id = 1;
			
			session.beginTransaction();
			
			Instructor theInstructor = session.get(Instructor.class, id); 
			
			if( theInstructor != null) {
				
				session.delete(theInstructor);
			}
			
			
			session.getTransaction().commit();
			
			
		}
		finally {
			factory.close();
		}
		
	
	}
	
}
