package com.yaHuiSever.domain;

import java.io.Serializable;

public class gretype  implements Serializable {
    private int typeid;
    private String typename;
	public gretype() {
		super();
		// TODO Auto-generated constructor stub
	}
	public gretype(int typeid, String typename) {
		super();
		this.typeid = typeid;
		this.typename = typename;
	}
	public int getTypeid() {
		return typeid;
	}
	public void setTypeid(int typeid) {
		this.typeid = typeid;
	}
	public String getTypename() {
		return typename;
	}
	public void setTypename(String typename) {
		this.typename = typename;
	}
	@Override
	public String toString() {
		return "\t" + typeid + "\t" + typename + "\t";
	}
	
}
