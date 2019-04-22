package com.yaHuiSever.domain;

public class empolyee {

	private int eid;
	private String ename;
	private String epasswed;
	public empolyee(int i, String string) {
		super();
		// TODO Auto-generated constructor stub
	}
	public empolyee(int eid, String ename, String epasswed) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.epasswed = epasswed;
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
	public String getEpasswed() {
		return epasswed;
	}
	public void setEpasswed(String epasswed) {
		this.epasswed = epasswed;
	}
	@Override
	public String toString() {
		return "empolyee [eid=" + eid + ", ename=" + ename + ", epasswed=" + epasswed + "]";
	}
	
	
}
