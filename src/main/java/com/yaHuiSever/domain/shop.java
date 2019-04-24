package com.yaHuiSever.domain;

import java.io.Serializable;

public class shop implements Serializable{
	private int foodid;
	private String foodname;
	private double foodprice;
	private int foodnum;
	public shop() {
		super();
		// TODO Auto-generated constructor stub
	}

	public shop(int foodid, String foodname, double foodprice, int foodnum) {
		super();
		this.foodid = foodid;
		this.foodname = foodname;
		this.foodprice = foodprice;
		this.foodnum = foodnum;
	}

	public int getFoodid() {
		return foodid;
	}

	public void setFoodid(int foodid) {
		this.foodid = foodid;
	}

	public String getFoodname() {
		return foodname;
	}

	public void setFoodname(String foodname) {
		this.foodname = foodname;
	}

	public double getFoodprice() {
		return foodprice;
	}

	public void setFoodprice(double foodprice) {
		this.foodprice = foodprice;
	}

	public int getFoodnum() {
		return foodnum;
	}

	public void setFoodnum(int foodnum) {
		this.foodnum = foodnum;
	}

	@Override
	public String toString() {
		return "\t" + foodid + "\t" + foodname + "\t" + foodprice + "\t" + foodnum
				+ "\t";
	}
}
