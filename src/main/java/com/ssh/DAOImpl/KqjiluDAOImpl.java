package com.ssh.DAOImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ssh.DAO.IKqjiluDAO;
import com.ssh.pojo.Kqjilu;
@Repository
@Transactional
public class KqjiluDAOImpl implements IKqjiluDAO {
    
	@Autowired
	private SessionFactory sessionFactory;
	
	

	@Override
	public List<Kqjilu> findAll() {
	//	List<Kqjilu> kq =sessionFactory.getCurrentSession().createCriteria(Kqjilu.class).list();
		List<Kqjilu> kq = sessionFactory.getCurrentSession().createQuery("from Kqjilu").list();
		//System.out.println(kq);
		return kq;
	}



	@Override
	public void save(Kqjilu obj) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(obj);
	}

}
