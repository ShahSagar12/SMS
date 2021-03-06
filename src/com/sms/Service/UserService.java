package com.sms.Service;


import java.util.List;

import com.sms.Model.User;

public interface UserService {
	
	public int save(User user);
	public void update(User user);
	public void delete(User user);
	
	public User get(int id);
	public List<User> list();

	public int checkAuthenticate(User user);
	public String getUserName(int id);
}
