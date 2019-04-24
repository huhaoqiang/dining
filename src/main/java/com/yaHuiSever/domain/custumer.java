package com.yaHuiSever.domain;

import java.io.Serializable;

public class custumer implements Serializable{
	private int cid;
	private String cname;
	private String cpasswd;
	private int cfrezz;
	private double money;
	private int melevel;
	private String menane;
	private double medisc;
	public custumer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public custumer(int cid, String cname, String cpasswd, int cfrezz, double money, int melevel ) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cpasswd = cpasswd;
		this.cfrezz = cfrezz;
		this.money = money;
		this.melevel = melevel;
		this.menane = menane;
		this.medisc = medisc;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCpasswd() {
		return cpasswd;
	}
	public void setCpasswd(String cpasswd) {
		this.cpasswd = cpasswd;
	}
	public int getCfrezz() {
		return cfrezz;
	}
	public void setCfrezz(int cfrezz) {
		this.cfrezz = cfrezz;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public int getMelevel() {
		return melevel;
	}
	public void setMelevel(int melevel) {
		this.melevel = melevel;
	}
	public String getMenane() {
		return menane;
	}
	public void setMenane(String menane) {
		this.menane = menane;
	}
	public double getMedisc() {
		return medisc;
	}
	public void setMedisc(double medisc) {
		this.medisc = medisc;
	}
	@Override
	public String toString() {
		return "\t" + cid + "\t" + cname + "\t" + cpasswd + "\t" + cfrezz + "\t"
				+ money + "\t" + melevel + "\t";
	}
	
	

}
