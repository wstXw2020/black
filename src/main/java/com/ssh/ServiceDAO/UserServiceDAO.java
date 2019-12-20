package com.ssh.ServiceDAO;

import java.util.List;

import com.ssh.pojo.User;

public interface UserServiceDAO {

	List<User> findAll();
	boolean login(User user);
	
}
