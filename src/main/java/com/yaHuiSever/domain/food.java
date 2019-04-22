package com.yaHuiSever.domain;

public class food {
	private int foodid;
	private String foodname;
	private double foodprice;
	private int foodnum;
	private int typeid;
	private  String typename;
	public food() {
		super();
		// TODO Auto-generated constructor stub
	}
	public food(int foodid, String foodname, double foodprice, int foodnum, int typeid) {
		super();
		this.foodid = foodid;
		this.foodname = foodname;
		this.foodprice = foodprice;
		this.foodnum = foodnum;
		this.typeid = typeid;
		this.typename = typename;
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
	
	

}
