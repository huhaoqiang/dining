package com.yaHuiSever.dao;

import java.util.List;

import com.yaHuiSever.domain.custumer;
import com.yaHuiSever.domain.employee;
import com.yaHuiSever.domain.food;
import com.yaHuiSever.domain.order;
import com.yaHuiSever.domain.shop;

public interface employeeDao {
	//1.创建一个员工登录的方法
	public employee loginEmployee(int eid,String epasswd);
	//2.创建一个客户添加的方法
	public boolean addCustumer(int cid,String cname,String cpasswd,int melevel,int cfrezz,double money);
	//3.创建一个会员卡充值的方法
	public boolean updateMoney(double money,int eid);
	//4.创建一个会员卡挂失的方法
	public boolean addLoss(int cid,int eid);
	//5.创建一个点菜添加购物车的方法
	public boolean addShop(int foodid,int cid,int num);
	//6.创建一个删除购物车的方法
	public boolean deleteShop(int id);
	//7.创建一个查看购物车的方法
	public List<shop> selectByEid();
	//8.创建一个将更改销量的方法
	public boolean addsales(int foodid,int foodnum);
	//9.创建一个客户查询的方法
	public List<custumer> selectcustomer();
	//10.创建一个计算购物车总价
	public double selectfoodprice();
	//11.创建一个计算单个菜品总价的
	public double selectfoodnum(int foodid,int cid);
	//12.添加一个为订单表提供 eid cid orderid的方法
	public boolean addorder(int cid,int eid,String orderid,double ordermoney);
	//13.创建一个查询订单的方法
	public List<order> selectorder(); 
	//14.清空购物车的方法
	public boolean dropshop();
	//15.修改单个价钱
	public boolean updatefoodmoney(double foodmoney,int foodid);
	//16.扣钱
	public boolean disMoney(double a,int cid);
}