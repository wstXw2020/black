package com.ssh.DAO;

import java.util.List;

import com.ssh.pojo.Student;

public interface StuDAO {

	List<Student> findAll();
	Student findone(Integer sid);
	
}
