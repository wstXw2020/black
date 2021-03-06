package com.ssh.DAOImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;
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

	@Override
	public User login(User user) {
		// TODO Auto-generated method stub
		String s = "select * from User where uname=? and upwd=?";
		NativeQuery createSQLQuery = sessionFactory.getCurrentSession().createSQLQuery(s);
		createSQLQuery.addEntity(User.class);
		createSQLQuery.setParameter(1, user.getUname());
		createSQLQuery.setParameter(2, user.getUpwd());
		List<User> u = createSQLQuery.list();
		return u.size()==0?null:u.get(0);
	}

}
