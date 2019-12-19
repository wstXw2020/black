package com.ssh.pojo;
// Generated 2019-12-19 18:07:19 by Hibernate Tools 5.4.7.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Kqtype generated by hbm2java
 */
public class Kqtype implements java.io.Serializable {

	private int kid;
	private String kname;
	private Set kqjilus = new HashSet(0);

	public Kqtype() {
	}

	public Kqtype(int kid) {
		this.kid = kid;
	}

	public Kqtype(int kid, String kname, Set kqjilus) {
		this.kid = kid;
		this.kname = kname;
		this.kqjilus = kqjilus;
	}

	public int getKid() {
		return this.kid;
	}

	public void setKid(int kid) {
		this.kid = kid;
	}

	public String getKname() {
		return this.kname;
	}

	public void setKname(String kname) {
		this.kname = kname;
	}

	public Set getKqjilus() {
		return this.kqjilus;
	}

	public void setKqjilus(Set kqjilus) {
		this.kqjilus = kqjilus;
	}

	@Override
	public String toString() {
		return "Kqtype [kid=" + kid + ", kname=" + kname + "]";
	}

}
