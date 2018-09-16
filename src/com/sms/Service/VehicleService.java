package com.sms.Service;

import java.util.List;

import com.sms.Model.Vehicle;

public interface VehicleService {
	public void save(Vehicle vehicle);
	public void delete(Vehicle vehicle);
	public void update (Vehicle vehicle);

	public Vehicle get(int id);
	public List<Vehicle> list();

}
