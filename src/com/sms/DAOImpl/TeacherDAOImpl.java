package com.sms.DAOImpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.sms.DAO.TeacherDAO;
import com.sms.Model.Teacher;
import com.sms.dbutils.SessionConnector;

public class TeacherDAOImpl implements TeacherDAO {
	SessionFactory sessionFactory=SessionConnector.HbmConnect();

	@Override
	public void save(Teacher teacher) {
		Session session=sessionFactory.openSession();
		try {
			session.beginTransaction();
			session.save(teacher);
			session.getTransaction().commit();
			System.out.println("Teacher SAVED");
			
			
		}catch(Exception exp) {
			System.out.println("ERROR:SAVING Teacher "+exp);
		}
	}

	@Override
	public void delete(Teacher teacher) {
		Session session=sessionFactory.openSession();
		try {
			session.beginTransaction();
			session.delete(teacher);
			session.getTransaction().commit();
			System.out.println("Teacher deleted");
			
			
		}catch(Exception exp) {
			System.out.println("ERROR:Deleting Teacher "+exp);
		}
	}

	@Override
	public void update(Teacher teacher) {
		Session session=sessionFactory.openSession();
		try {
			session.beginTransaction();
			session.update(teacher);
			session.getTransaction().commit();
			System.out.println("Teacher Updated");
			
			
		}catch(Exception exp) {
			System.out.println("ERROR:Updating Teacher "+exp);
		}
	}

	@Override
	public Teacher get(int id) {
		Teacher teacher=new Teacher();
		Session session=sessionFactory.openSession();
		try {
			session.beginTransaction();
			teacher=session.get(teacher.getClass(), id);
			session.getTransaction().commit();
			
		}catch(Exception exp) {
			session.getTransaction().rollback();
			System.out.println("ERROR:GETTING TEACHER "+exp);
		}		
		
		return teacher;
	}

	@Override
	public List<Teacher> list() {
		Teacher teacher=new Teacher();
		List<Teacher> allTeacher=new ArrayList<>();
		Session session=sessionFactory.openSession();
		try {
			session.beginTransaction();
			Query query=session.createQuery("from the Teacher");
			allTeacher=query.getResultList();
			session.getTransaction().commit();
			
		}catch(Exception exp) {
			session.getTransaction().rollback();
			System.out.println("ERROR:Listing TEACHER "+exp);
		}		
		
		return allTeacher;
	}

	
}
