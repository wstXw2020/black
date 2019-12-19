package com.ssh.DAOImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ssh.DAO.UserDAO;
import com.ssh.pojo.Student;
import com.ssh.pojo.User;

@SuppressWarnings("all")
@Repository
public class UserDAOImpl implements UserDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		List<User> list = sessionFactory.getCurrentSession().createQuery("from User").list();
		return list;
	}

}
