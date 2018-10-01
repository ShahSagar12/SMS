package com.sms.DAOImpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.sms.DAO.StaffAccountDAO;
import com.sms.Model.StaffAccount;
import com.sms.dbutils.SessionConnector;

public class StaffAccountDAOImpl implements StaffAccountDAO {
	SessionFactory sessionFactory=SessionConnector.HbmConnect();
	Session session;

	@Override
	public int save(StaffAccount staffAccount) {
		int store=0;
		session=sessionFactory.openSession();
		try {
			session.beginTransaction();
			store=(int) session.save(staffAccount);
			session.getTransaction().commit();
			System.out.println("STAFFACCOUNT SAVED");			
		}catch(Exception exp) {
			session.getTransaction().rollback();
			System.out.println("ERROR:Saving SatffAccount "+exp);			
		}		
		return store;
	}

	@Override
	public void delete(StaffAccount staffAccount) {
		
		session=sessionFactory.openSession();
		try {
			session.beginTransaction();
			session.delete(staffAccount);
			session.getTransaction().commit();
			System.out.println("STAFFACCOUNT REMOVED");			
		}catch(Exception exp) {
			session.getTransaction().rollback();
			System.out.println("ERROR:Deleting SatffAccount "+exp);			
		}		
	
	}

	@Override
	public void update(StaffAccount staffAccount) {
		session=sessionFactory.openSession();
		try {
			session.beginTransaction();
			session.update(staffAccount);
			session.getTransaction().commit();
			System.out.println("STAFFACCOUNT REMOVED");			
		}catch(Exception exp) {
			session.getTransaction().rollback();
			System.out.println("ERROR:Deleting SatffAccount "+exp);			
		}	
		
	}

	@Override
	public StaffAccount get(String staff_AccNo) {
		StaffAccount staffAccount=new StaffAccount();
		session=sessionFactory.openSession();
		try {
		session.beginTransaction();
		staffAccount=session.get(staffAccount.getClass(), staff_AccNo);
		session.getTransaction().commit();
		System.out.println("GETTING staffAccount");
			
		}catch(Exception exp) {
		session.getTransaction().rollback();
		System.out.println("ERROR:GETTING StaffAccount"+exp);	
		}				
		return staffAccount;
	}

	@Override
	public List<StaffAccount> list() {
		List<StaffAccount> allStaffAccount=new ArrayList<>();
		session=sessionFactory.openSession();
		try {
			session.beginTransaction();
			Query query=session.createQuery("from StaffAccount");
			allStaffAccount=query.getResultList();
			session.getTransaction().commit();
			System.out.println("StaffAccount Listed");
		}catch(Exception exp) {
			session.getTransaction().rollback();
			System.out.println("ERROR:LISTING StaffAccount"+exp);
		}		
		return allStaffAccount;
	}

}
