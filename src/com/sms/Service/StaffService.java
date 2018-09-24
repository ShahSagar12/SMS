package com.sms.Service;

import java.util.List;

import com.sms.Model.Staff;

public interface StaffService {
	
	public int save(Staff staff);
	public void delete(Staff staff);
	public void update(Staff staff);
	
	public Staff get(int id);
	public List<Staff> list();

}
