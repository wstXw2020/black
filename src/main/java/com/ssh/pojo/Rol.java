package com.ssh.pojo;
// Generated 2019-12-26 16:04:58 by Hibernate Tools 5.4.7.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Rol generated by hbm2java
 */
public class Rol implements java.io.Serializable {

	private int rid;
	private User user;
	private String rname;
	private String rtype;
	private Set clazzs = new HashSet(0);
	private Set users = new HashSet(0);

	public Rol() {
	}

	public Rol(int rid) {
		this.rid = rid;
	}

	public Rol(int rid, User user, String rname, String rtype, Set clazzs, Set users) {
		this.rid = rid;
		this.user = user;
		this.rname = rname;
		this.rtype = rtype;
		this.clazzs = clazzs;
		this.users = users;
	}

	public int getRid() {
		return this.rid;
	}

	public void setRid(int rid) {
		this.rid = rid;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getRname() {
		return this.rname;
	}

	public void setRname(String rname) {
		this.rname = rname;
	}

	public String getRtype() {
		return this.rtype;
	}

	public void setRtype(String rtype) {
		this.rtype = rtype;
	}

	public Set getClazzs() {
		return this.clazzs;
	}

	public void setClazzs(Set clazzs) {
		this.clazzs = clazzs;
	}

	public Set getUsers() {
		return this.users;
	}

	public void setUsers(Set users) {
		this.users = users;
	}

}
