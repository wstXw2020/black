package com.woniu.pojo;
// Generated 2019-12-18 19:35:54 by Hibernate Tools 5.4.7.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Jieduan generated by hbm2java
 */
public class Jieduan implements java.io.Serializable {

	private int lid;
	private String lname;
	private String week;
	private Set kaoshis = new HashSet(0);
	private Set clazzs = new HashSet(0);

	public Jieduan() {
	}

	public Jieduan(int lid) {
		this.lid = lid;
	}

	public Jieduan(int lid, String lname, String week, Set kaoshis, Set clazzs) {
		this.lid = lid;
		this.lname = lname;
		this.week = week;
		this.kaoshis = kaoshis;
		this.clazzs = clazzs;
	}

	public int getLid() {
		return this.lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public String getLname() {
		return this.lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getWeek() {
		return this.week;
	}

	public void setWeek(String week) {
		this.week = week;
	}

	public Set getKaoshis() {
		return this.kaoshis;
	}

	public void setKaoshis(Set kaoshis) {
		this.kaoshis = kaoshis;
	}

	public Set getClazzs() {
		return this.clazzs;
	}

	public void setClazzs(Set clazzs) {
		this.clazzs = clazzs;
	}

}
