package com.ssh.Action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ssh.ServiceDAO.StuServiceDAO;
import com.ssh.ServiceDAO.UserServiceDAO;
import com.ssh.pojo.Student;
import com.ssh.pojo.User;

@SuppressWarnings("all")
@Controller
public class StuAction {
	
	private Student student;
	private List<Student> slist;
	
	@Autowired
	private StuServiceDAO StuServiceDAO;

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public List<Student> getSlist() {
		return slist;
	}

	public void setSlist(List<Student> slist) {
		this.slist = slist;
	}

	public StuServiceDAO getStuServiceDAO() {
		return StuServiceDAO;
	}

	public void setStuServiceDAO(StuServiceDAO stuServiceDAO) {
		StuServiceDAO = stuServiceDAO;
	}

	public String findAll() {
		slist = StuServiceDAO.findAll();
		System.out.println(slist);
		return "findAll";
	}
	
	
}
