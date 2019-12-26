package com.ssh.Action;

import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ssh.Service.ClazzService;
import com.ssh.Service.RolService;
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
	@Autowired
	private RolService rs;
	@Autowired
	private ClazzService cs;
	private List<Clazz> listc;
	private List<Rol> listr;
	private Rol rol;
	private Student student;
	private List<Student> slist;
	private Clazz clazz;
	private User user;
	private List<Rol> listbzr;
	
	public List<Clazz> getListc() {
		return listc;
	}

	public void setListc(List<Clazz> listc) {
		this.listc = listc;
	}

	public ClazzService getCs() {
		return cs;
	}

	public void setCs(ClazzService cs) {
		this.cs = cs;
	}

	public List<Rol> getListbzr() {
		return listbzr;
	}

	public void setListbzr(List<Rol> listbzr) {
		this.listbzr = listbzr;
	}

	public List<Rol> getListr() {
		return listr;
	}

	public void setListr(List<Rol> listr) {
		this.listr = listr;
	}


	@Autowired
	private StuServiceDAO StuServiceDAO;


	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
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

	public String findAll() {
		slist = StuServiceDAO.findAll();
		return "findAll";
	}
	
	public String findone() {
		student = StuServiceDAO.findone(student.getSid());
		return "findAll";
	}
	
	public String save() {
		listr = rs.findrAll();
		return "save";
	}
	
	public String findrAll() {
		listr = rs.findrAllls();
		listbzr = rs.findrAllbzr();
		return "findrAll";
	}
	
	public String update() {
		listr = rs.findrAllls();
		return "update";
	}
	
	public String findcAll() {
		listc = cs.findcAll();
		return "findcAll";
	}
	
	public String savec() {
		cs.save(clazz);
		return "savec";
	}
	
	public String login() {
		user = UserServiceDAO.login(user);
		String s = null;
		if(user!=null) {
			String uname = user.getUname();
			ServletActionContext.getRequest().getSession().setAttribute("uname", uname);
			if(user.getStudent()==null) {
				String str = user.getRol().getRtype();
				if(str.equals("教学主管")) {//跳转到教学主管界面
					s = "jxzg";
				}
				if(str.equals("班主任")) {//跳转到班主任界面
					s = "bzr";
				}
				if(str.equals("老师")) {//跳转到教师界面
					s = "js";
				}
			}else {
				s = "findlogin";
			}
		}else{
			s = "login1";
		}
		return s;
	}
	
}
