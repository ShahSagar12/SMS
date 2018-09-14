package com.sms.DAO;

import java.util.List;

import com.sms.Model.Vehicle;

public interface VehicleDAO {
	void save (Vehicle vehicle);
	void delete(Vehicle vehicle);
	void update (Vehicle vehicle);


	Vehicle get(int id);
	List<Vehicle> list();

}
