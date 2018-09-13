package com.sms.DAOImpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.sms.DAO.LibraryDAO;
import com.sms.Model.Library;
import com.sms.dbutils.SessionConnector;

public class LibraryDAOImpl implements LibraryDAO {
	SessionFactory sessionFactory=SessionConnector.HbmConnect();
	Session session;

	@Override
	public void save(Library library) {
		session=sessionFactory.openSession();
		try {
			session.beginTransaction();
			session.save(library);
			session.getTransaction().commit();
			System.out.println("Save Successful");
		}catch(Exception exp){
			session.getTransaction().rollback();
			System.out.println("ERROR:SAVING LIBRARY :"+exp);
		}
	}

	@Override
	public void delete(Library library) {
		session=sessionFactory.openSession();
		try {
			session.beginTransaction();
			session.delete(library);
			session.getTransaction().commit();
			System.out.println("Delete Successful");
		}catch(Exception exp){
			session.getTransaction().rollback();
			System.out.println("ERROR:DELETING LIBRARY :"+exp);
		}
	}

	@Override
	public void update(Library library) {
		session=sessionFactory.openSession();
		try {
			session.beginTransaction();
			session.update(library);
			session.getTransaction().commit();
			System.out.println("update Successful");
		}catch(Exception exp){
			session.getTransaction().rollback();
			System.out.println("ERROR:SAVING LIBRARY :"+exp);
		}
	}

	@Override
	public Library get(int id) {
		Library library=new Library();
		session=sessionFactory.openSession();
		try {
		session.beginTransaction();
		library=session.get(library.getClass(), id);	
		session.getTransaction().commit();	
		}catch(Exception exp) {
			session.getTransaction().rollback();
			System.out.println("ERROR:GETTING LIBRARY :"+exp);				
		}
		return library;
	}
	
	@Override
	public List<Library> list() {
		List<Library> allLibrary=new ArrayList<>();
		session=sessionFactory.openSession();
		try {
			session.beginTransaction();
			Query query=session.createQuery("From Library");			
			allLibrary=query.getResultList();
			session.getTransaction().commit();
			System.out.println("Listed Successfully");
		}catch(Exception exp) {
			session.getTransaction().rollback();
			System.out.println("ERROR:LISTING LIBRARY"+exp);
		}
		return allLibrary;
	}
}
