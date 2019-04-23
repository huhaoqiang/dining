package com.yaHuiSever.domain;

import java.io.Serializable;

public class manager implements Serializable {
	private int mid;
	private String mname;
	private String mpasswd;
	public manager() {
		super();
		// TODO Auto-generated constructor stub
	}
	public manager(int mid, String mname, String mpasswd) {
		super();
		this.mid = mid;
		this.mname = mname;
		this.mpasswd = mpasswd;
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getMpasswd() {
		return mpasswd;
	}
	public void setMpasswd(String mpasswd) {
		this.mpasswd = mpasswd;
	}
	

}
