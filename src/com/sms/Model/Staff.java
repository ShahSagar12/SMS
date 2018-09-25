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
	private int staffId;
	
	@Column(name="Staff_Name")
	private String staffName;
	
	@Column(name="Staff_Address")
	private String staffAddress;
	
	@Column(name="Staff_Post")
	private String staffPost;	
	
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="Staff_Account_No")
	private StaffAccount staffAccount;
	
	@Column(name="Staff_Status")
	private int status;
	
	public Staff() {
		
	}
	public Staff(int staffId, String staffName, String staffAddress, String staffPost, int status,StaffAccount staffAccount) {
		super();
		this.staffId = staffId;
		this.staffName = staffName;
		this.staffAddress = staffAddress;
		this.staffPost = staffPost;
		this.status = status;
		this.staffAccount=staffAccount;
	}

	public StaffAccount getStaffAccount() {
		return staffAccount;
	}
	public void setStaffAccount(StaffAccount staffAccount) {
		this.staffAccount = staffAccount;
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
	
	
	@Override
	public String toString() {
		return "Staff [staffId=" + staffId + ", staffName=" + staffName + ", staffAddress=" + staffAddress + ", staffPost="
				+ staffPost + ", staffAccount=" + staffAccount + ", status=" + status + "]";
	}

		
	

}
