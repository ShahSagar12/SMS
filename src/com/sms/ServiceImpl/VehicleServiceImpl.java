package com.sms.ServiceImpl;

import java.util.List;

import com.sms.DAO.VehicleDAO;
import com.sms.DAOImpl.VehicleDAOImpl;
import com.sms.Model.Vehicle;
import com.sms.Service.VehicleService;

public class VehicleServiceImpl implements VehicleService{
	VehicleDAO vehicleDAO=new VehicleDAOImpl();
	@Override
	public void save(Vehicle vehicle) {
		vehicleDAO.save(vehicle);
	}

	@Override
	public void delete(Vehicle vehicle) {
		vehicleDAO.delete(vehicle);
		
	}

	@Override
	public void update(Vehicle vehicle) {
		vehicleDAO.update(vehicle);
		
	}

	@Override
	public Vehicle get(int id) {
		
		return vehicleDAO.get(id);
	}

	@Override
	public List<Vehicle> list() {
		
		return vehicleDAO.list();
	}

	

}
