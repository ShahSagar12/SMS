package com.sms.dbutils;



import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionConnector {
	
	public static SessionFactory HbmConnect() {
		SessionFactory sessionFactory= null;
		try {
		sessionFactory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		System.out.println("Connection Successful");
		}catch(Exception exp) {
			System.out.println("Exception:Hibernate Connection :"+exp);
		}
		
		return sessionFactory;
	}

	public static void main(String[] args) {
		HbmConnect();
		

	}

}
