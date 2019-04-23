package com.yaHuiSever.domain;

import java.io.Serializable;

public class shop implements Serializable{
	private int foodid;
	private String foodname;
	private double foodprice;
	private int number;
	public shop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public shop(int foodid, String foodname, double foodprice, int number) {
		super();
		this.foodid = foodid;
		this.foodname = foodname;
		this.foodprice = foodprice;
		this.number = number;
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
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
}
