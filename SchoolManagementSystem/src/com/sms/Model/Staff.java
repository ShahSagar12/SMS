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
@Table(name="tbl_Staff")
public class Staff {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Staff_Id")
	private int id;
	
	@Column(name="Staff_Name")
	private String staffName;
	
	@Column(name="Staff_Address")
	private String staffAddress;
	
	@Column(name="Staff_Post")
	private String staffPost;	
	
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="V_Id")
	private Vehicle vehicle;
	
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="LM_Id")
	private Library library;
	
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="Att_Id")
	private Attendence attendence;
	
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="Staff_Account_No")
	private StaffAccount staffAccount;
	
	@Column(name="Staff_Status")
	private int status;
	
	public Staff() {
		
	}
	public Staff(int id, String staffName, String staffAddress, String staffPost, int status, Vehicle vehicle, Library library,Attendence attendence,StaffAccount staffAccount) {
		super();
		this.id = id;
		this.staffName = staffName;
		this.staffAddress = staffAddress;
		this.staffPost = staffPost;
		this.status = status;
		this.vehicle=vehicle;
		this.library=library;
		this.attendence=attendence;
		this.staffAccount=staffAccount;
	}

	public Staff(String staffName, String staffAddress, String staffPost, int status, Vehicle vehicle, Library library,Attendence attendence,StaffAccount staffAccount) {
		super();
		this.staffName = staffName;
		this.staffAddress = staffAddress;
		this.staffPost = staffPost;
		this.status = status;
		this.vehicle=vehicle;
		this.library=library;
		this.attendence=attendence;
		this.staffAccount=staffAccount;
	}
	

	public StaffAccount getStaffAccount() {
		return staffAccount;
	}
	public void setStaffAccount(StaffAccount staffAccount) {
		this.staffAccount = staffAccount;
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

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public String getStaffAddress() {
		return staffAddress;
	}

	public void setStaffAddress(String staffAddress) {
		this.staffAddress = staffAddress;
	}

	public String getStaffPost() {
		return staffPost;
	}

	public void setStaffPost(String staffPost) {
		this.staffPost = staffPost;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setTeacher(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	@Override
	public String toString() {
		return "Staff [id=" + id + ", staffName=" + staffName + ", staffAddress=" + staffAddress + ", staffPost="
				+ staffPost + ", vehicle=" + vehicle + ", library=" + library + ", attendence=" + attendence
				+ ", staffAccount=" + staffAccount + ", status=" + status + "]";
	}

		
	

}
