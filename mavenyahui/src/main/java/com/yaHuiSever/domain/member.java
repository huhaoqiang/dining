package com.yaHuiSever.domain;

import java.io.Serializable;

public class member implements Serializable{
	private int melevel;
	private String mename;
	private double medisc;
	public member() {
		super();
		// TODO Auto-generated constructor stub
	}
	public member(int melevel, String mename, double medisc) {
		super();
		this.melevel = melevel;
		this.mename = mename;
		this.medisc = medisc;
	}
	public int getMelevel() {
		return melevel;
	}
	public void setMelevel(int melevel) {
		this.melevel = melevel;
	}
	public String getMename() {
		return mename;
	}
	public void setMename(String mename) {
		this.mename = mename;
	}
	public double getMedisc() {
		return medisc;
	}
	public void setMedisc(double medisc) {
		this.medisc = medisc;
	}
	@Override
	public String toString() {
		return "\t" + melevel + "\t" + mename + "\t" + medisc + "\t";
	}
	

}
