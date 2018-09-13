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
	
	
	
	@Column(name="Staff_Status")
	private int status;
	
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="Teacher_Id")
	private Teacher teacher;
	
	public Staff() {
		
	}

	public Staff(int id, String staffName, String staffAddress, String staffPost, int status, Teacher teacher) {
		super();
		this.id = id;
		this.staffName = staffName;
		this.staffAddress = staffAddress;
		this.staffPost = staffPost;
		this.status = status;
		this.teacher=teacher;
	}

	public Staff(String staffName, String staffAddress, String staffPost, int status, Teacher teacher) {
		super();
		this.staffName = staffName;
		this.staffAddress = staffAddress;
		this.staffPost = staffPost;
		this.status = status;
		this.teacher=teacher;
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
	
	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	@Override
	public String toString() {
		return "Staff [id=" + id + ", staffName=" + staffName + ", staffAddress=" + staffAddress + ", staffPost="
				+ staffPost + ", status=" + status + ",teacher=" + teacher +"]";
	}	
	
	

}
