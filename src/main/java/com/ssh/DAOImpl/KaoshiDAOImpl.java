package com.ssh.DAOImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ssh.DAO.IKaoshiDAO;
import com.ssh.pojo.Kaoshi;


@Repository
@Transactional
public class KaoshiDAOImpl implements IKaoshiDAO {
    
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public void save(Kaoshi obj) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(obj);
	}

	@Override
	public void update(Kaoshi obj) {
		// TODO Auto-generated method stub
		 sessionFactory.getCurrentSession().update(obj);
	}

	@Override
	public Kaoshi findOne(Integer id) {
//		Query createQuery = sessionFactory.getCurrentSession().createQuery("from Kaoshi where scid=?");
//		createQuery.setParameter(1, id);
//		Kaoshi ka = (Kaoshi) createQuery.list();
		
		
		return (Kaoshi) sessionFactory.getCurrentSession().get(Kaoshi.class, id);
	}



	@Override
	public void delete(Kaoshi obj) {
		// TODO Auto-generated method stub
		 sessionFactory.getCurrentSession().delete(obj);
	}
	@Override
	public List<Kaoshi> findAll() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createCriteria(Kaoshi.class).list();
	}
}
