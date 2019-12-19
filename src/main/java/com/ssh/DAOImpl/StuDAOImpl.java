package com.ssh.DAOImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ssh.DAO.StuDAO;
import com.ssh.pojo.Student;

@SuppressWarnings("all")
@Repository
public class StuDAOImpl implements StuDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}


	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		List<Student> list = sessionFactory.getCurrentSession().createQuery("from Student").list();
		return list;
	}

}
