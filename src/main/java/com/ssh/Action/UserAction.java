package com.ssh.Action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ssh.ServiceDAO.UserServiceDAO;
import com.ssh.pojo.User;

@SuppressWarnings("all")
@Controller
public class UserAction {
	
	private User user;
	@Autowired
	private UserServiceDAO UserServiceDAO;
	
	public String login() {
		boolean b = UserServiceDAO.login(user);
		System.out.println(b);
		return "success";
	}

}
