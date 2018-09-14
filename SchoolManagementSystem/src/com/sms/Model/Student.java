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
	
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="S_Id")
	private StudentAccount studentAccount;
	
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="V_Id")
	private Vehicle vehicle;
	
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="LM_Id")
	private Library library;
	
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="Att_Id")
	private Attendence attendence;
	
	
	
	public Student() {
		
	}
	
	
	public Vehicle getVehicle() {
		return vehicle;
	}


	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}


	public Library getLibrary() {
		return library;
	}


	public void setLibrary(Library library) {
		this.library = library;
	}


	public Attendence getAttendence() {
		return attendence;
	}


	public void setAttendence(Attendence attendence) {
		this.attendence = attendence;
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
	

	public StudentAccount getStudentAccount() {
		return studentAccount;
	}

	public void setStudentAccount(StudentAccount studentAccount) {
		this.studentAccount = studentAccount;
	}


	public Student(int studentId, String studentName, String studentAddress, String studentPhoneNo, String fatherName,
			String motherName, int status, StudentAccount studentAccount, Vehicle vehicle, Library library,
			Attendence attendence) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.studentPhoneNo = studentPhoneNo;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.status = status;
		this.studentAccount = studentAccount;
		this.vehicle = vehicle;
		this.library = library;
		this.attendence = attendence;
	}


	public Student(String studentName, String studentAddress, String studentPhoneNo, String fatherName,
			String motherName, int status, StudentAccount studentAccount, Vehicle vehicle, Library library,
			Attendence attendence) {
		super();
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.studentPhoneNo = studentPhoneNo;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.status = status;
		this.studentAccount = studentAccount;
		this.vehicle = vehicle;
		this.library = library;
		this.attendence = attendence;
	}


	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ ", studentPhoneNo=" + studentPhoneNo + ", fatherName=" + fatherName + ", motherName=" + motherName
				+ ", status=" + status + ", studentAccount=" + studentAccount + ", vehicle=" + vehicle + ", library="
				+ library + ", attendence=" + attendence + "]";
	}

	

		
}
