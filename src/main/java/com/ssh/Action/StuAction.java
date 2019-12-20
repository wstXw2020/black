package com.ssh.Action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ssh.ServiceDAO.StuServiceDAO;
import com.ssh.ServiceDAO.UserServiceDAO;
import com.ssh.pojo.Clazz;
import com.ssh.pojo.Rol;
import com.ssh.pojo.Student;
import com.ssh.pojo.User;

@SuppressWarnings("all")
@Controller
public class StuAction {
	
	
	@Autowired
	private UserServiceDAO UserServiceDAO;
	private Student student;
	private List<Student> slist;
	private Clazz clazz;
	private User user;
	private List<User> ulist;
	
	public List<User> getUlist() {
		return ulist;
	}

	public void setUlist(List<User> ulist) {
		this.ulist = ulist;
	}

	@Autowired
	private StuServiceDAO StuServiceDAO;

	public UserServiceDAO getUserServiceDAO() {
		return UserServiceDAO;
	}

	public void setUserServiceDAO(UserServiceDAO userServiceDAO) {
		UserServiceDAO = userServiceDAO;
	}

	public Clazz getClazz() {
		return clazz;
	}

	public void setClazz(Clazz clazz) {
		this.clazz = clazz;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

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
		return "findAll";
	}
	
	public String login() {
		boolean b = UserServiceDAO.login(user);
		String s = null;
		if(b==true) {
			s = "findlogin";
		}else if(b==false){
			s = "login";
		}
		return s;
	}
	
}
