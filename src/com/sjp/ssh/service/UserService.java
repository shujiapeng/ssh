package com.sjp.ssh.service;

import java.sql.SQLException;

import com.sjp.ssh.domain.User;

public interface UserService {
	
	/**
	 * 获取用户
	 * @param id
	 * @return
	 */
	public User getById(int id);

	/**
	 * 用户是否存在
	 * @param user
	 * @return
	 * @throws SQLException 
	 */
	public boolean exist(User user) throws SQLException;

}
