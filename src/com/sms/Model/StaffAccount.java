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
	
	@Column(name="StaffID")
	private Staff staff;

	public StaffAccount() {
		
	}

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

	public Staff getStaff() {
		return staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}

	public StaffAccount(String staff_AccNo, String staff_Salary, Staff staff) {
		Staff_AccNo = staff_AccNo;
		this.staff_Salary = staff_Salary;
		this.staff = staff;
	}

	public StaffAccount(String staff_Salary, Staff staff) {
		super();
		this.staff_Salary = staff_Salary;
		this.staff = staff;
	}	
}
