package com.sms.DAO;

import java.util.List;

import com.sms.Model.StaffAccount;


public interface StaffAccountDAO {
	
	public int save(StaffAccount staffAccount);
	public void delete(StaffAccount staffAccount);
	public void update(StaffAccount staffAccount);
	public StaffAccount get(String staff_AccNo);
	public List<StaffAccount> list();

}
