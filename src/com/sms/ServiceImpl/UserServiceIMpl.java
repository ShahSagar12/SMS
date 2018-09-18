package com.sms.ServiceImpl;

import java.util.List;

import com.sms.DAO.UserDAO;
import com.sms.DAOImpl.UserDAOImpl;
import com.sms.Model.User;
import com.sms.Service.UserService;

public class UserServiceIMpl implements UserService {
	UserDAO userDAO=new UserDAOImpl();

	@Override
	public void save(User user) {
		
		userDAO.save(user);
	}

	@Override
	public void update(User user) {
		
		userDAO.update(user);
	}

	@Override
	public void delete(User user) {
		userDAO.delete(user);
	}

	@Override
	public User get(int id) {
		
		return userDAO.get(id);
	}

	@Override
	public List<User> list() {
		return userDAO.list();
	}

}
