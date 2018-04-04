package com.luv2code.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

import org.hibernate.engine.jdbc.connections.internal.DriverConnectionCreator;

public class TestJdbc {

	public static void main(String[] args) {
		
		String jdbcUrl = "jdbc:mysql://localhost:3306/hb_01_one_to_one_uni?useSSL=false";
		String user = "hbstudent";
		String pass= "hbstudent";
		
		try {
			System.out.println("Trying to conncet: " + jdbcUrl);
			Connection con = DriverManager.getConnection(jdbcUrl, user, pass);
			System.out.println("\n\nConncection Successful.");
		}
		catch(Exception exp) {
			exp.printStackTrace();
		}
		
	}
}
