package com.ssh.DAOImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ssh.DAO.StuDAO;
import com.ssh.pojo.Student;

@SuppressWarnings("all")
@Repository
public class StuDAOImpl implements StuDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		List<Student> list = sessionFactory.getCurrentSession().createQuery("from Student").list();
		return list;
	}

	@Override
	public Student findone(Integer sid) {
		// TODO Auto-generated method stub
		Query createQuery = sessionFactory.getCurrentSession().createQuery("from Student where sid=?");
		createQuery.setParameter(1, sid);
		Student stu = (Student) createQuery.list();
		return stu;
	}
}
