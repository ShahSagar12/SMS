package com.sms.DAOImpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
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

	@Override
	public int checkAuthenticate(User user) {
		int register=0;
		session=sessionFactory.openSession();
		try {
			session.beginTransaction();
			PreparedStatement ps=(PreparedStatement) session.createNamedQuery("Select id from User where User_name=? and Password=? and status='1'");
			ps.setString(1, user.getUserName());
			ps.setString(2, user.getUserPassword());
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				register=rs.getInt("id");
			}
			session.getTransaction().commit();
			
			
		}catch(Exception exp) {
		System.out.println("ERROR:Authentication "+exp);	
		}
		return register;
	}

	@Override
	public String getUserName(int id) {
		String userName="";
		session=sessionFactory.openSession();
		try {
			session.beginTransaction();
			PreparedStatement ps=(PreparedStatement) session.createNamedQuery("Select userName from User where id=?");
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				userName=rs.getString("userName");
			}
			session.getTransaction().commit();
			
			
		}catch(Exception exp) {
		System.out.println("ERROR:Authentication "+exp);	
		}
		return userName;
	}
	
	

}
