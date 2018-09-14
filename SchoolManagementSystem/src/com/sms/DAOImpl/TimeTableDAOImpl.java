package com.sms.DAOImpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.sms.DAO.TimeTableDAO;
import com.sms.Model.TimeTable;
import com.sms.dbutils.SessionConnector;

public class TimeTableDAOImpl implements TimeTableDAO {
	SessionFactory sessionFactory=SessionConnector.HbmConnect();
	Session session;
	@Override
	public void save(TimeTable timeTable) {
		session=sessionFactory.openSession();
		try {
			session.beginTransaction();
			session.save(timeTable);
			session.getTransaction().commit();
			System.out.println("Save Successful");
		}catch(Exception exp){
			session.getTransaction().rollback();
			System.out.println("ERROR:SAVING TimeTable :"+exp);
		}

	}

	@Override
	public void delete(TimeTable timeTable) {
		session=sessionFactory.openSession();
		try {
			session.beginTransaction();
			session.delete(timeTable);
			session.getTransaction().commit();
			System.out.println("Deleted Successful");
		}catch(Exception exp){
			session.getTransaction().rollback();
			System.out.println("ERROR:Deleting TimeTable :"+exp);
		}
	}

	@Override
	public void update(TimeTable timeTable) {
		session=sessionFactory.openSession();
		try {
			session.beginTransaction();
			session.update(timeTable);
			session.getTransaction().commit();
			System.out.println("update Successful");
		}catch(Exception exp){
			session.getTransaction().rollback();
			System.out.println("ERROR:Updating TimeTable :"+exp);
		}

	}

	@Override
	public TimeTable get(int id) {
		TimeTable timeTable=new TimeTable();
		session=sessionFactory.openSession();
		try {
			session.beginTransaction();
			timeTable=session.get(timeTable.getClass(), id);
			session.getTransaction().commit();
			System.out.println("Getting Successful");
		}catch(Exception exp){
			session.getTransaction().rollback();
			System.out.println("ERROR:Getting TimeTable :"+exp);
		}
		return timeTable;
	}

	@Override
	public List<TimeTable> list() {
		List<TimeTable> allTimeTable=new ArrayList<>();
		session=sessionFactory.openSession();
		try {
			session.beginTransaction();
			Query query=session.createQuery("From TimeTable");
			allTimeTable=query.getResultList();
			session.getTransaction().commit();
			System.out.println("Save Successful");
		}catch(Exception exp){
			session.getTransaction().rollback();
			System.out.println("ERROR:SAVING TimeTable :"+exp);
		}
		return allTimeTable;
	}

}
