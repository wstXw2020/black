package com.ssh.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssh.DAO.StuDAO;
import com.ssh.Service.StuServiceDAO;
import com.ssh.pojo.Student;

@Transactional
@Service
public class StuServiceDAOImpl implements StuServiceDAO{
	
	@Autowired
	StuDAO StuDAO;

	public StuServiceDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	public StuDAO getStuDAO() {
		return StuDAO;
	}

	public void setStuDAO(StuDAO stuDAO) {
		StuDAO = stuDAO;
	}

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		List<Student> list = StuDAO.findAll();
		return list;
	}

	@Override
	public Student findone(Integer sid) {
		// TODO Auto-generated method stub
		Student stu = StuDAO.findone(sid);
		return stu;
	}

}
