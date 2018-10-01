package com.sms.Model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="tbl_role")
public class Role implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="roleId")
	private int Role_id;
	
	@Column(name="roleName")
	private String roleName;

	@ManyToMany(mappedBy="roles",fetch=FetchType.LAZY)
	private List<User> userList;

	public int getRole_id() {
		return Role_id;
	}
	public void setRole_id(int role_id) {
		Role_id = role_id;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public List<User> getUserList() {
		return userList;
	}
	public void setUserList(List<User> userList) {
		this.userList = userList;
	}
	public Role(int role_id, String roleName, List<User> userList) {
		super();
		Role_id = role_id;
		this.roleName = roleName;
		this.userList = userList;
	}

	public Role() {
		super();		
	}
	@Override
	public String toString() {
		return "Role [Role_id=" + Role_id + ", roleName=" + roleName + ", userList=" + userList + "]";
	}

}
