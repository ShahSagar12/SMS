package com.sms.Model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_Staff")
public class Staff {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Staff_Id")
	private int staffId;
	
	@Column(name="Staff_Name")
	private String staffName;
	
	@Column(name="Staff_Address")
	private String staffAddress;
	
	@Column(name="Staff_EmailAddress")
	private String staffEmailAddress;
	
	@Column(name="Staff_Post")
	private String staffPost;		
	
	@Column(name="Staff_Status")
	private int status;
	
	@Column(name="Staff_Phone")
	private String staffPhone;
	
	public Staff() {
		
	}
	public Staff(int staffId, String staffName, String staffAddress,String staffEmailAddress, String staffPost, String staffPhone, int status) {
		super();
		this.staffId = staffId;
		this.staffName = staffName;
		this.staffAddress = staffAddress;
		this.staffPost = staffPost;
		this.staffEmailAddress=staffEmailAddress;
		this.staffPhone=staffPhone;
		this.status = status;
		
	}
	public int getStaffId() {
		return staffId;
	}

	public void setStaffId(int id) {
		this.staffId = id;
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
		
	public String getStaffPhone() {
		return staffPhone;
	}
	public void setStaffPhone(String staffPhone) {
		this.staffPhone = staffPhone;
	}
	
	public String getStaffEmailAddress() {
		return staffEmailAddress;
	}
	public void setStaffEmailAddress(String staffEmailAddress) {
		this.staffEmailAddress = staffEmailAddress;
	}
	@Override
	public String toString() {
		return "Staff [staffId=" + staffId + ", staffName=" + staffName + ", staffAddress=" + staffAddress
				+ ", staffEmailAddress=" + staffEmailAddress + ", staffPost=" + staffPost + ", status=" + status
				+ ", staffPhone=" + staffPhone + "]";
	}
	
	
}
