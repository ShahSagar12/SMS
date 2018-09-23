package com.sms.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_User")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="User_Id")
	private int id;
	@Column(name="User_Name")
	private String userName; 
	
	@Column(name="User_Password")
	private String userPassword;
	@Column(name="status")
	private int status;	
	
	public User() {
		
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public User(int id, String userName, String userPassword, int status) {
		super();
		this.id = id;
		this.userName = userName;
		this.userPassword = userPassword;
		this.status = status;
	}
	public User(String user, String password, int status) {
		super();
		this.userName = userName;
		this.userPassword = userPassword;
		this.status = status;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", userPassword=" + userPassword + ", status=" + status + "]";
	}
	
	

}
