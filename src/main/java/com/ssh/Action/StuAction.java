package com.ssh.Action;

import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ssh.Service.StuServiceDAO;
import com.ssh.Service.UserServiceDAO;
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
	

	@Autowired
	private StuServiceDAO StuServiceDAO;


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

	public String findAll() {
		slist = StuServiceDAO.findAll();
		return "findAll";
	}
	
	public String login() {
		user = UserServiceDAO.login(user);
		String uname = user.getUname();
		ServletActionContext.getRequest().getSession().setAttribute("uname", uname);
		String s = null;
		if(user!=null) {
			if(user.getSid()==null) {
				int i = user.getRid();
				if(i==2) {//跳转到教学主管界面
					s = "jxzg";
				}
				if(i==3) {//跳转到班主任界面
					s = "bzr";
				}
				if(i==4) {//跳转到教师界面
					s = "js";
				}
			}else {
				s = "findlogin";
			}
		}else{
			s = "login";
		}
		return s;
	}
	
}
