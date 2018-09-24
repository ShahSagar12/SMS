package com.sms.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.sun.javafx.collections.MappingChange.Map;

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
	
	@ManyToMany(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	@JoinTable(joinColumns = @JoinColumn(name = "userId", referencedColumnName = "id"), 
		    inverseJoinColumns = @JoinColumn(name = "roleId", referencedColumnName = "id"))
	private Role role;
	
	
	public User() {
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
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


	public Role getRole() {
		return role;
	}


	public void setRole(Role role) {
		this.role = role;
	}


	public User(int id, String userName, String userPassword, int status, Role role) {
		super();
		this.id = id;
		this.userName = userName;
		this.userPassword = userPassword;
		this.status = status;
		this.role = role;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", userPassword=" + userPassword + ", status=" + status
				+ ", role=" + role + "]";
	}


	
}
