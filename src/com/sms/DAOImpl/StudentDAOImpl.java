package com.sms.DAOImpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.sms.DAO.StudentDAO;
import com.sms.Model.Student;
import com.sms.dbutils.SessionConnector;

public class StudentDAOImpl implements StudentDAO {
	SessionFactory sessionFactory=SessionConnector.HbmConnect();
	Session session;
		@Override
	public int save(Student student) {
		int register=0;
		Session session=sessionFactory.openSession();
		try {
			session.beginTransaction();
			register=(int) session.save(student);
			session.getTransaction().commit();
			System.out.println("Student SAVED");


		}catch(Exception exp) {
			System.out.println("ERROR:SAVING STUDENT "+exp);
		}
		return register;
	}

	@Override
	public void delete(Student student) {
		Session session=sessionFactory.openSession();
		try {
			session.beginTransaction();
			session.delete(student);
			session.getTransaction().commit();
			System.out.println("Student DELETED");


		}catch(Exception exp) {
			System.out.println("ERROR:DELETING STUDENT "+exp);
		}

	}

	@Override
	public void update(Student student) {
		int edit=0;
		
		Session session=sessionFactory.openSession();
		try {
			session.beginTransaction();
			session.update(student);
			session.getTransaction().commit();
			System.out.println("Student UPDATED");
		}catch(Exception exp) {
			System.out.println("ERROR:UPDATING STUDENT "+exp);			
		}	
		
	}

	@Override
	public Student get(int id) {
		Student student=null;
		Session session=sessionFactory.openSession();
		try {
			session.beginTransaction();
			student=(Student)session.get(Student.class,id);
			session.getTransaction().commit();
			System.out.println("Student GOT");


		}catch(Exception exp) {
			System.out.println("ERROR:GETTING STUDENT "+exp);
		}
		return student;
	}


	@Override
	public List<Student> list() {
		List<Student> allStudent=new ArrayList<>();
		Session session=sessionFactory.openSession();
		try {
			session.beginTransaction();
			Query query=session.createQuery("from Student Order by Student.id ASC");
			allStudent=query.getResultList();
			session.getTransaction().commit();
			System.out.println("Student LISTED");	
		}catch(Exception exp) {
			session.getTransaction().rollback();
			System.out.println("ERROR:LISTING STUDENT "+exp);
		}

		return allStudent;
	}
}
