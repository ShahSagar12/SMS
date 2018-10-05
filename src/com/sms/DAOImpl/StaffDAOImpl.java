package com.sms.DAOImpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.sms.DAO.StaffDAO;
import com.sms.Model.Staff;
import com.sms.dbutils.SessionConnector;

public class StaffDAOImpl implements StaffDAO {
	SessionFactory sessionFactory=SessionConnector.HbmConnect();
	Session session;

	@Override
	public int save(Staff staff) {
		int register=0;
		session=sessionFactory.openSession();
			try {
				session.beginTransaction();
				register=(int) session.save(staff);
				session.getTransaction().commit();
				System.out.println("staff saved");				
			}catch(Exception exp) {
				session.getTransaction().rollback();
				System.out.println("ERROR:SAVING STAFF"+exp);					
			}
			return register;
	}

	@Override
	public void delete(Staff staff) {
		session=sessionFactory.openSession();
		try {
			session.beginTransaction();
			session.delete(staff);
			session.getTransaction().commit();
			System.out.println("staff DELETED");				
		}catch(Exception exp) {
			session.getTransaction().rollback();
			System.out.println("ERROR:DELETING STAFF"+exp);	
		}
	}

	@Override
	public void update(Staff staff) {
		session=sessionFactory.openSession();
		try {
			session.beginTransaction();
			session.update(staff);
			session.getTransaction().commit();
			System.out.println("staff updated");				
		}catch(Exception exp) {
			session.getTransaction().rollback();
			System.out.println("ERROR:UPDATING STAFF"+exp);	
		}
	}

	@Override
	public Staff get(int id) {
		Staff staff=new Staff();
		session=sessionFactory.openSession();
		try {
			session.beginTransaction();
			staff=session.get(staff.getClass(), id);
			session.getTransaction().commit();
			System.out.println("GOT STAFF");
		}catch(Exception exp) {
			System.out.println("ERROR:GETTING STAFF "+exp);
		}
		return staff;
	}

	@Override
	public List<Staff> list() {
		
		List<Staff> allStaff=new ArrayList<>();
		session=sessionFactory.openSession();
		try {
			session.beginTransaction();
			Query query=session.createQuery("FROM Staff staff Order by staff.id ASC");
			allStaff=query.getResultList();
			session.getTransaction().commit();
			System.out.println("GET LIST SUCCESSFUL");
		}catch(Exception exp) {
			System.out.println("ERROR: "+exp);
		}
		return allStaff;
	}

}
