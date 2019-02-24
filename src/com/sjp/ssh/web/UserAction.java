package com.sjp.ssh.web;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.sjp.ssh.domain.User;
import com.sjp.ssh.service.UserService;
import com.sjp.ssh.serviceImpl.UserServiceImpl;

@SuppressWarnings("serial")
public class UserAction extends ActionSupport implements ModelDriven<User> {
	
	public User user = new User();
	
	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}

	public String execute() throws Exception {
		return SUCCESS;
	}

	public void login() throws Exception {
		UserService userService = new UserServiceImpl();
		if (userService.exist(user)) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}
	
}
