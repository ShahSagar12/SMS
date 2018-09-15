package com.sms.DAOImpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.sms.DAO.SubjectDAO;
import com.sms.Model.Subject;
import com.sms.dbutils.SessionConnector;

public class SubjectDAOImpl implements SubjectDAO{
	SessionFactory SessionFactory = SessionConnector.HbmConnect();
	Session session;

	@Override
	public void save(Subject subject) {
		session = SessionFactory.openSession();
		try {
			session.beginTransaction();
			session.save(subject);
			session.getTransaction().commit();
			System.out.println("Saving Subject successfull");
		}catch(Exception e) {
			System.out.println("Error : saving Subject : "+e);
			session.getTransaction().rollback();
		}
		session.clear();
	}

	@Override
	public void delete(Subject subject) {
		session = SessionFactory.openSession();
		try {
			session.beginTransaction();
			session.delete(subject);
			session.getTransaction().commit();
			System.out.println("Subject Deletion Successfull");
		}catch(Exception e) {
			System.out.println("Error : deleting subject : "+e);
			session.getTransaction().rollback();
		}
		session.clear();
	}

	@Override
	public void update(Subject subject) {
		session = SessionFactory.openSession();
		try {
			session.beginTransaction();
			session.update(subject);
			session.getTransaction().commit();
			System.out.println("Updating subject successfull");
		}catch(Exception e) {
			System.out.println("Error : updating subject : "+e);
		}
		session.clear();
	}

	@Override
	public Subject get(int id) {
		Subject subject = new Subject();
		session = SessionFactory.openSession();
		try {
			session.beginTransaction();
			subject = session.get(Subject.class,id);
			session.getTransaction().commit();
		}catch(Exception e) {
			System.out.println("Error : getting subject Id :"+e);
			session.getTransaction().rollback();
		}
		session.clear();
		return subject;
	}

	@Override
	public List<Subject> list() {
		List<Subject> subject = new ArrayList<>();
		session = SessionFactory.openSession();
		try {
			session.beginTransaction();
			Query query = session.createQuery("Select * from tbl_subject");
			subject = query.getResultList();
			session.getTransaction().commit();
		}catch(Exception e) {
			System.out.println("Error : getting subject list : "+e);
			session.getTransaction().rollback();
		}
		session.clear();
		return subject;
	}

}
