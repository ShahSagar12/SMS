package com.sms.ServiceImpl;

import java.util.List;

import com.sms.DAO.StaffDAO;
import com.sms.DAOImpl.StaffDAOImpl;
import com.sms.Model.Staff;
import com.sms.Service.StaffService;

public class StaffServiceImpl implements StaffService{
	StaffDAO staffDAO=new StaffDAOImpl();

	@Override
	public int save(Staff staff) {
		
		 return staffDAO.save(staff);
		
	}

	@Override
	public void delete(Staff staff) {
		
		
		staffDAO.delete(staff);
	}

	@Override
	public void update(Staff staff) {
		
		staffDAO.update(staff);
		
	}

	@Override
	public Staff get(int id) {
		
		return staffDAO.get(id);
	}

	@Override
	public List<Staff> list() {
		
		return staffDAO.list();
	}

}
