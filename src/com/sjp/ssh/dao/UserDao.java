package com.sjp.ssh.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.sjp.ssh.domain.User;
import com.sjp.ssh.util.C3p0Util;

public class UserDao {

	public User findUser(User user) throws SQLException {
		QueryRunner runner = C3p0Util.getRunner();
		String sql = "select * from user where username = ? and password = ?";
		BeanHandler<User> bh = new BeanHandler<>(User.class);
		return runner.query(sql, bh, user.getUsername(), user.getPassword());
	}

}
