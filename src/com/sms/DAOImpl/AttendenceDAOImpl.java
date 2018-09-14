package com.sms.DAOImpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.sms.DAO.AttendenceDAO;
import com.sms.Model.Attendence;

import com.sms.dbutils.SessionConnector;

public class AttendenceDAOImpl implements AttendenceDAO {
	SessionFactory sessionFactory = SessionConnector.HbmConnect();
	Session session;

	@Override
	public void save(Attendence attendence) {
		session = sessionFactory.openSession();
		try {
			session.beginTransaction();
			session.save(attendence);
			session.getTransaction().commit();
			System.out.println("Attendence Saved SucessFully");
		}catch(Exception e) {
			System.out.println("Error : Saving Attendence :"+e);
			session.getTransaction().rollback();
		}
		session.clear();
	}

	@Override
	public void delete(Attendence attendence) {
		session = sessionFactory.openSession();
		try {
			session.beginTransaction();
			session.delete(attendence);
			session.getTransaction().commit();
			System.out.println("Attendence Deleted Successfully");
		}catch(Exception e) {
			System.out.println("Error : Deleting Attendence : "+e);
			session.getTransaction().rollback();
		}
		session.clear();
	}

	@Override
	public void update(Attendence attendence) {
		session = sessionFactory.openSession();
		try {
			session.beginTransaction();
			session.update(attendence);
			session.getTransaction().commit();
			System.out.println("Attendence Updates Successfully");
		}catch(Exception e) {
			System.out.println("Error : Updating Attendence : "  +e);
			session.getTransaction().rollback();
		}
		session.clear();
	}

	@Override
	public Attendence get(int id) {
		Attendence attendence = new Attendence();
		session = sessionFactory.openSession();

		try {
			session.beginTransaction();
			attendence = session.get(Attendence.class,id);
			session.getTransaction().commit();
			System.out.println("Getting Attendence Id Sucessfully");
		}catch(Exception e) {
			System.out.println("Error : Getting Attendence ID  :"+e);
			session.getTransaction().rollback();
		}
		session.clear();
		return attendence;
	}

	@Override
	public List<Attendence> list() {
		List<Attendence> allAttendence = new ArrayList<>(); 
		session = sessionFactory.openSession();
		try {
			session.beginTransaction();
			Query query = session.createQuery("Select * from tbl_attendence");
			allAttendence = query.getResultList();
			session.getTransaction().commit();
			System.out.println("Getting Attendence List Succesfully");
		}catch(Exception e) {
			System.out.println("Error : getting Attendence : "+e);
			session.getTransaction().rollback();
		}
		return allAttendence;

	}

}
