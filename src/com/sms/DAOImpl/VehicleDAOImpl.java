package com.sms.DAOImpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.sms.DAO.VehicleDAO;
import com.sms.Model.Vehicle;
import com.sms.dbutils.SessionConnector;

public class VehicleDAOImpl implements VehicleDAO{
	SessionFactory sessionFactory= SessionConnector.HbmConnect();
	Session session;
	
	@Override
	public void save(Vehicle vehicle) {
		session = sessionFactory.openSession();
		try {
			session.beginTransaction();
			session.save(vehicle);
			session.getTransaction().commit();
			System.out.println("Vehicle Saved");
		}catch(Exception exp) {
			System.out.println("ERROR: Saving vehicle" + exp);
		}
	}

	@Override
	public void delete(Vehicle vehicle) {
		session = sessionFactory.openSession();
		try {
			session.beginTransaction();
			session.delete(vehicle);
			session.getTransaction().commit();
			System.out.println("Vehicle Deleted");
		}catch(Exception exp) {
			session.getTransaction().rollback();
			System.out.println("ERROR:Deleting Vehicle "+exp);
		}
	}

	@Override
	public void update(Vehicle vehicle) {
		session = sessionFactory.openSession();
		try {
			session.beginTransaction();
			session.update(vehicle);
			session.getTransaction().commit();
			System.out.println("Vehicle updated");
		}catch(Exception exp) {
			System.out.println("ERROR: Updating Vehicle"+exp);
		}
	}

	@Override
	public List<Vehicle> list() {
		List<Vehicle>allvehicle= new ArrayList();
		session = sessionFactory.openSession();
		try {
			session.beginTransaction();
			Query query=session.createNamedQuery("From Vehicle");
			allvehicle=query.getResultList();
			session.getTransaction().commit();
		}catch(Exception exp) {
			session.getTransaction().rollback();
			System.out.println("ERROR: Listing Vehicle "+exp);
			
		}
		return allvehicle;
	}

	@Override
	public Vehicle get(int id) {
		Vehicle vehicle= new Vehicle();
		session= sessionFactory.openSession();
		try {
			session.beginTransaction();
			vehicle=session.get(vehicle.getClass(), id);
			session.getTransaction().commit();
			System.out.println("GOT Vehicle ID");
		}catch(Exception exp) {
			System.out.println("ERROR: GETTING VEHICLE"+exp);
		}
		return vehicle;
	}

}
