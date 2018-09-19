package com.sms.Model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_studentaccount")
public class StudentAccount {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "student_Account_Number")
	private String StudentAccNo;
	
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="S_Name")
	private Student studentName;
	
	@OneToOne
	@JoinColumn(name = "")
	
	@Column(name = "Total_Fee")
	private int totalFee;
	
	@Column(name = "Fee_Payment")
	private int feePayment;
	
	@Column(name = "Due_Amount")
	private int dueAmount;
	
}
