package com.ssh.DAOImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ssh.DAO.RolDAO;
import com.ssh.pojo.Rol;

@Repository
public class RolDAOImpl implements RolDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Rol> findrAll() {
		// TODO Auto-generated method stub
		List list = sessionFactory.getCurrentSession().createQuery("from Rol").list();
		return list;
	}
	
	@Override
	public List<Rol> findrAllls() {
		// TODO Auto-generated method stub
		List list = sessionFactory.getCurrentSession().createQuery("from Rol where rtype = '老师'").list();
		return list;
	}
	
	@Override
	public List<Rol> findrAllbzr() {
		// TODO Auto-generated method stub
		List list = sessionFactory.getCurrentSession().createQuery("from Rol where rtype = '班主任'").list();
		return list;
	}

}
