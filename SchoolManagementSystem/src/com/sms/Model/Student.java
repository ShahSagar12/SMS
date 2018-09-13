package com.sms.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_Student")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="S_Id")
	private int studentId;
	
	@Column(name="S_Name")
	private String studentName;
	
	@Column(name="S_Address")
	private String studentAddress;
	
	@Column(name="S_PhoneNo")
	private String studentPhoneNo;
	
	@Column(name="S_FatherName")
	private String fatherName;
	
	@Column(name="S_MotherName")
	private String motherName;
	
	@Column(name="S_Status")
	private int status;
	
	
	
	public Student() {
		
	}
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	public String getStudentPhoneNo() {
		return studentPhoneNo;
	}
	public void setStudentPhoneNo(String studentPhoneNo) {
		this.studentPhoneNo = studentPhoneNo;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}

	public Student(int studentId, String studentName, String studentAddress, String studentPhoneNo, String fatherName,
			String motherName, int status) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.studentPhoneNo = studentPhoneNo;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.status = status;
	}
	

	public Student(String studentName, String studentAddress, String studentPhoneNo, String fatherName,
			String motherName, int status) {
		super();
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.studentPhoneNo = studentPhoneNo;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.status = status;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ ", studentPhoneNo=" + studentPhoneNo + ", fatherName=" + fatherName + ", motherName=" + motherName
				+ ", status=" + status + "]";
	}
	
	
	
}
