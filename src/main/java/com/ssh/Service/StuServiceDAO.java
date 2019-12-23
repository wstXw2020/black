package com.ssh.Service;

import java.util.List;

import com.ssh.pojo.Student;

public interface StuServiceDAO {

	List<Student> findAll();
	Student findone(Integer sid);
	
}
