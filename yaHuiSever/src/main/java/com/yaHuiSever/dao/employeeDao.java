package com.yaHuiSever.dao;

import java.util.List;

import com.yaHuiSever.domain.custumer;
import com.yaHuiSever.domain.employee;
import com.yaHuiSever.domain.food;

public interface employeeDao {
	//1.创建一个员工登录的方法
	public employee loginEmployee(int eid,String epasswd);
    //2.创建一个客户添加的方法
	public boolean addCustumer(custumer c);
	//3.创建一个会员卡充值的方法
	public boolean updateMoney(double money,int eid);
	//4.创建一个会员卡挂失的方法
	public boolean addLoss(int cid,int eid);
	//5.创建一个点菜添加购物车的方法
	public boolean addShop(int foodid,int cid,int eid,int num);
	//6.创建一个删除购物车的方法
	public boolean deleteShop(int id);
	//7.创建一个查看购物车的方法
	public List<food> selectByEid();
	//8.创建一个将更改销量的方法
	public String addsales();
	//9.创建一个客户查询的方法
	public List<custumer> selectcustomer();


			
}
