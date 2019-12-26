package com.ssh.pojo;
// Generated 2019-12-26 16:04:58 by Hibernate Tools 5.4.7.Final

import java.util.HashSet;
import java.util.Set;

/**
 * User generated by hbm2java
 */
public class User implements java.io.Serializable {

	private int uid;
	private Rol rol;
	private Student student;
	private String uname;
	private String upwd;
	private Set students = new HashSet(0);
	private Set rols = new HashSet(0);

	public User() {
	}

	public User(int uid) {
		this.uid = uid;
	}

	public User(int uid, Rol rol, Student student, String uname, String upwd, Set students, Set rols) {
		this.uid = uid;
		this.rol = rol;
		this.student = student;
		this.uname = uname;
		this.upwd = upwd;
		this.students = students;
		this.rols = rols;
	}

	public int getUid() {
		return this.uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public Rol getRol() {
		return this.rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	public Student getStudent() {
		return this.student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public String getUname() {
		return this.uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUpwd() {
		return this.upwd;
	}

	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}

	public Set getStudents() {
		return this.students;
	}

	public void setStudents(Set students) {
		this.students = students;
	}

	public Set getRols() {
		return this.rols;
	}

	public void setRols(Set rols) {
		this.rols = rols;
	}

}
