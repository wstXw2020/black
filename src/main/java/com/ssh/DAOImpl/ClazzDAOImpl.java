package com.ssh.DAOImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ssh.DAO.ClazzDAO;
import com.ssh.pojo.Clazz;

@Repository
public class ClazzDAOImpl implements ClazzDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Clazz> findcAll() {
		// TODO Auto-generated method stub
		List list = sessionFactory.getCurrentSession().createQuery("from Clazz").list();
		return list;
	}
	@Override
	public void save(Clazz clazz) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(clazz);
	}

}
