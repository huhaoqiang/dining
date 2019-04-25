package com.yaHuiSever.domain;

import java.io.Serializable;

public class employee implements Serializable{

	private int eid;
	private String ename;
	private String epasswd;
	
	public employee() {
		super();
	}

	public employee(int eid, String ename, String epasswd) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.epasswd = epasswd;
	}
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEpasswd() {
		return epasswd;
	}
	public void setEpasswd(String epasswd) {
		this.epasswd = epasswd;
	}
	@Override
	public String toString() {
		return "\t" + eid + "\t" + ename + "\t" + epasswd + "\t";
	}
	
}
