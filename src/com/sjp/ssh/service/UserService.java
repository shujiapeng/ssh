package com.sjp.ssh.service;

import java.sql.SQLException;

import com.sjp.ssh.domain.User;

public interface UserService {
	
	/**
	 * ��ȡ�û�
	 * @param id
	 * @return
	 */
	public User getById(int id);

	/**
	 * �û��Ƿ����
	 * @param user
	 * @return
	 * @throws SQLException 
	 */
	public boolean exist(User user) throws SQLException;

}
