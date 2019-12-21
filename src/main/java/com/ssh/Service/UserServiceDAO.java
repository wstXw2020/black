package com.ssh.Service;

import java.util.List;

import com.ssh.pojo.User;

public interface UserServiceDAO {

	List<User> findAll();
	User login(User user);
	
}
