package com.sms.DAO;

import java.util.List;

import com.sms.Model.Staff;

public interface StaffDAO {
	
	public void save(Staff staff);
	public void delete(Staff staff);
	public void update(Staff staff);
	
	public Staff get(int id);
	public List<Staff> list();

}
