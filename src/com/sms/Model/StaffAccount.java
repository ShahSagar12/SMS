package com.sms.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_staffaccount")
public class StaffAccount {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Staff_AccNo")
	private String Staff_AccNo;
	
	@Column(name="Staff_Salary")
	private String staff_Salary;

	public String getStaff_AccNo() {
		return Staff_AccNo;
	}

	public void setStaff_AccNo(String staff_AccNo) {
		Staff_AccNo = staff_AccNo;
	}

	public String getStaff_Salary() {
		return staff_Salary;
	}

	public void setStaff_Salary(String staff_Salary) {
		this.staff_Salary = staff_Salary;
	}

	public StaffAccount(String staff_AccNo, String staff_Salary) {
		super();
		Staff_AccNo = staff_AccNo;
		this.staff_Salary = staff_Salary;
	}

	public StaffAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "StaffAccount [Staff_AccNo=" + Staff_AccNo + ", staff_Salary=" + staff_Salary + "]";
	}
	
	
	
	
}
