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
	
	
	
	
	@Column(name = "Total_Fee")
	private int totalFee;
	
	@Column(name = "Fee_Payment")
	private int feePayment;
	
	@Column(name = "Due_Amount")
	private int dueAmount;
	
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="S_Name")
	private Student studentName;

	public String getStudentAccNo() {
		return StudentAccNo;
	}

	public void setStudentAccNo(String studentAccNo) {
		StudentAccNo = studentAccNo;
	}

	public Student getStudentName() {
		return studentName;
	}

	public void setStudentName(Student studentName) {
		this.studentName = studentName;
	}

	public int getTotalFee() {
		return totalFee;
	}

	public void setTotalFee(int totalFee) {
		this.totalFee = totalFee;
	}

	public int getFeePayment() {
		return feePayment;
	}

	public void setFeePayment(int feePayment) {
		this.feePayment = feePayment;
	}

	public int getDueAmount() {
		return dueAmount;
	}

	public void setDueAmount(int dueAmount) {
		this.dueAmount = dueAmount;
	}

	public StudentAccount(String studentAccNo, Student studentName, int totalFee, int feePayment, int dueAmount) {
		super();
		StudentAccNo = studentAccNo;
		this.studentName = studentName;
		this.totalFee = totalFee;
		this.feePayment = feePayment;
		this.dueAmount = dueAmount;
	}

	@Override
	public String toString() {
		return "StudentAccount [StudentAccNo=" + StudentAccNo + ", studentName=" + studentName + ", totalFee="
				+ totalFee + ", feePayment=" + feePayment + ", dueAmount=" + dueAmount + "]";
	}

	public StudentAccount() {
		
	}
	
	
	
	
	
	
}
