package com.sms.DAOImpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.sms.DAO.SClassDAO;
import com.sms.Model.SClass;
import com.sms.dbutils.SessionConnector;

public class SClassDAOImpl implements SClassDAO {
	SessionFactory sessionFactory = SessionConnector.HbmConnect();
	Session session;
	
	@Override
	public void save(SClass class1) {
		session = sessionFactory.openSession();
		try {
			session.beginTransaction();
			session.save(class1);
			session.getTransaction().commit();
		}catch(Exception e) {
			System.out.println("Error : Saving class :"+e);
			session.getTransaction().rollback();
		}
		session.clear();
	}
	
	@Override
	public void update(SClass class1) {
		session = sessionFactory.openSession();
		try {
			session.beginTransaction();
			session.update(class1);
			session.getTransaction().commit();
			System.out.println("Class Updated Successfully");
		}catch(Exception e) {
			System.out.println("Error : Updating class :"+e);
			session.getTransaction().rollback();
		}
		session.clear();
	}
	
	@Override
	public void delete(SClass class1) {
		session = sessionFactory.openSession();
		try {
			session.beginTransaction();
			session.delete(class1);
			session.getTransaction().commit();
			System.out.println("Class Deletion Successfully");
		}catch(Exception e) {
			System.out.println("Error : Deleting class :"+e);
			session.getTransaction().rollback();
		}
		session.clear();
	}
	
	@Override
	public SClass get(int id) {
		SClass sclass = new SClass();
		session = sessionFactory.openSession();
		try {
			session.beginTransaction();
			sclass = session.get(SClass.class,id);
			session.getTransaction().commit();
			System.out.println("Getting Class Id Successful");
		}catch(Exception e) {
			System.out.println("Error : getting Class Id : "+e);
			session.getTransaction().rollback();
		}
		session.clear();
		return sclass;
	}
	
	@Override
	public List<SClass> list() {
		List<SClass> sClass = new ArrayList<>();
		session = sessionFactory.openSession();
		try {
			session.beginTransaction();
			Query query = session.createQuery("Select * from tbl_class");
			sClass = query.getResultList();
			session.getTransaction().commit();
			System.out.println("Getting Class List Successful");
		}catch(Exception e) {
			System.out.println("Error : getting Class List : "+e);
			session.getTransaction().rollback();
		}
		session.clear();
		return sClass;
	}

}
