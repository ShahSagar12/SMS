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
	@Column(name="User")
	private String user; 
	@Column(name="User_Password")
	private String password;
	@Column(name="status")
	private int status;	
	
	public User() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAdmin() {
		return user;
	}
	public void setAdmin(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public User(int id, String user, String password, int status) {
		super();
		this.id = id;
		this.user = user;
		this.password = password;
		this.status = status;
	}
	public User(String user, String password, int status) {
		super();
		this.user = user;
		this.password = password;
		this.status = status;
	}
	@Override
	public String toString() {
		return "Admin [id=" + id + ", user=" + user + ", password=" + password + ", status=" + status + "]";
	}	

}
