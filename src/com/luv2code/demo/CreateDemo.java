package com.luv2code.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.demo.entity.Instructor;
import com.luv2code.demo.entity.InstructorDetail;

public class CreateDemo {
	
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Instructor.class)
								.addAnnotatedClass(InstructorDetail.class)
								.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
		//	Instructor tempInstructor = new Instructor("Kaan","Caymaz", "kaan@hotmail.com");
		//	InstructorDetail tempInstructorDetail = new InstructorDetail("www.youtube.com/kaan", "body building");
			
			
			Instructor tempInstructor = new Instructor("Hakan","Caymaz", "hakan@hotmail.com");
			InstructorDetail tempInstructorDetail = new InstructorDetail("www.youtube.com/hakan", "network");
			
			tempInstructor.setInstructorDetail(tempInstructorDetail);

			session.beginTransaction();
			session.save(tempInstructor);
			session.getTransaction().commit();
		}
		finally {
			factory.close();
		}
	}

}
