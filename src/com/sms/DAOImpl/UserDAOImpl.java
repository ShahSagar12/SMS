package com.sms.DAOImpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.sms.DAO.UserDAO;
import com.sms.Model.User;
import com.sms.dbutils.SessionConnector;

public class UserDAOImpl implements UserDAO {
	SessionFactory sessionFactory=SessionConnector.HbmConnect();
	Session session;

	@Override
	public void save(User user) {
		session=sessionFactory.openSession();
		try {
			session.beginTransaction();
			session.save(user);
			session.getTransaction().commit();
			System.out.println("Save Successful");
		}catch(Exception exp){
			session.getTransaction().rollback();
			System.out.println("ERROR:SAVING USER :"+exp);
		}
		

	}

	@Override
	public void update(User user) {
		session=sessionFactory.openSession();
		try {
			session.beginTransaction();
			session.update(user);
			session.getTransaction().commit();
			System.out.println("UPDATE Successful");
		}catch(Exception exp){
			session.getTransaction().rollback();
			System.out.println("ERROR:UPDATING User :"+exp);
		}
		
	}

	@Override
	public void delete(User user) {
		session=sessionFactory.openSession();
		try {
			session.beginTransaction();
			session.delete(user);
			session.getTransaction().commit();
			System.out.println("Delete Successful");
		}catch(Exception exp){
			session.getTransaction().rollback();
			System.out.println("ERROR:DELETING User :"+exp);
		}
		
	}

	@Override
	public User get(int id) {
		User user=new User();
		session=sessionFactory.openSession();
		try {
			session.beginTransaction();
			user=session.get(user.getClass(), id);
			session.getTransaction().commit();
			
		}catch(Exception exp) {
			session.getTransaction().rollback();
			System.out.println("ERROR:GETTING USER"+exp);
		}
		return user;
	}
	

	@Override
	public List<User> list() {
		List<User> userList=new ArrayList<>();
		session=sessionFactory.openSession();
		try {
			session.beginTransaction();
			Query query=session.createQuery("FROM User");
			userList=query.getResultList();
			session.getTransaction().commit();
			
		}catch(Exception exp) {
			session.getTransaction().rollback();
			System.out.println("ERROR:GETTING USERLIST"+exp);
		}
		return userList;
	}

}
