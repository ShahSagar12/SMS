package com.sms.DAO;

import java.util.ArrayList;
import java.util.List;

import com.sms.Model.User;

public interface UserDAO {

	public void save(User user);
	public void update(User user);
	public void delete(User user);
	
	public User get(int id);
	public List<User> list();
}
