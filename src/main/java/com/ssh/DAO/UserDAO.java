package com.ssh.DAO;

import java.util.List;

import com.ssh.pojo.User;

public interface UserDAO {
	
	List<User> findAll();

}
