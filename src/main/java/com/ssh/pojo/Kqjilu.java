package com.ssh.pojo;
// Generated 2019-12-23 18:00:09 by Hibernate Tools 5.4.7.Final

import java.util.Date;

/**
 * Kqjilu generated by hbm2java
 */
public class Kqjilu implements java.io.Serializable {

	private int krid;
	private Kqtype kqtype;
	private Student student;
	private Date sdate;

	public Kqjilu() {
	}

	public Kqjilu(int krid) {
		this.krid = krid;
	}

	public Kqjilu(int krid, Kqtype kqtype, Student student, Date sdate) {
		this.krid = krid;
		this.kqtype = kqtype;
		this.student = student;
		this.sdate = sdate;
	}

	public int getKrid() {
		return this.krid;
	}

	public void setKrid(int krid) {
		this.krid = krid;
	}

	public Kqtype getKqtype() {
		return this.kqtype;
	}

	public void setKqtype(Kqtype kqtype) {
		this.kqtype = kqtype;
	}

	public Student getStudent() {
		return this.student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Date getSdate() {
		return this.sdate;
	}

	public void setSdate(Date sdate) {
		this.sdate = sdate;
	}

}
