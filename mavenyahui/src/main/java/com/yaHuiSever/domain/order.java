package com.yaHuiSever.domain;

import java.io.Serializable;

public class order implements Serializable{
    private String orderid;
    private  int cid;
    private int eid;
    private double ordermoney;
	public order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public order(String orderid, int cid, int eid, double ordermoney) {
		super();
		this.orderid = orderid;
		this.cid = cid;
		this.eid = eid;
		this.ordermoney = ordermoney;
	}
	public String getOrderid() {
		return orderid;
	}
	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public double getOrdermoney() {
		return ordermoney;
	}
	public void setOrdermoney(double ordermoney) {
		this.ordermoney = ordermoney;
	}
	@Override
	public String toString() {
		return  orderid + "\t" + cid + "\t" + eid + "\t" + ordermoney + "\t";
	}
    
}
