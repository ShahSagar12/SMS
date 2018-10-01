package com.sms.ServiceImpl;

import java.util.List;

import com.sms.DAO.StaffAccountDAO;
import com.sms.DAOImpl.StaffAccountDAOImpl;
import com.sms.Model.StaffAccount;
import com.sms.Service.StaffAccountService;

public class StaffAccountServiceImpl implements StaffAccountService {
	StaffAccountDAO staffAccountDAO=new StaffAccountDAOImpl();
	@Override
	public int save(StaffAccount staffAccount) {
		
		return staffAccountDAO.save(staffAccount);
	}

	@Override
	public void delete(StaffAccount staffAccount) {
		
		staffAccountDAO.delete(staffAccount);
	}

	@Override
	public void update(StaffAccount staffAccount) {
		
		staffAccountDAO.update(staffAccount);
	}

	@Override
	public StaffAccount get(String staff_AccNo) {
		
		return staffAccountDAO.get(staff_AccNo);
	}

	@Override
	public List<StaffAccount> list() {
		
		return staffAccountDAO.list();
	}

	
}
