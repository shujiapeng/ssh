package com.sjp.ssh.serviceImpl;


import java.sql.SQLException;

import com.sjp.ssh.dao.UserDao;
import com.sjp.ssh.domain.User;
import com.sjp.ssh.service.UserService;

public class UserServiceImpl implements UserService {

	private UserDao userDao = new UserDao();
	
	@Override
	public User getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exist(User user) throws SQLException {
		return userDao.findUser(user) != null;
	}

}
