package com.ssh.ServiceDAOImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssh.DAO.UserDAO;
import com.ssh.ServiceDAO.UserServiceDAO;
import com.ssh.pojo.User;

@Transactional
@Service
public class UserServiceDAOImpl implements UserServiceDAO {
	
	@Autowired
	UserDAO UserDAO;
	public UserServiceDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	public UserDAO getUserDAO() {
		return UserDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		UserDAO = userDAO;
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		List<User> list = UserDAO.findAll();
		return list;
	}

}
