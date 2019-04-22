package com.yaHuiSever.dao;

import java.util.List;

import com.yaHuiSever.domain.custumer;
import com.yaHuiSever.domain.empolyee;
import com.yaHuiSever.domain.food;

public interface employeeDao {
	//创建一个员工登录的方法
	public empolyee loginEmployee(int eid,String epasswd);
    //创建一个客户添加的方法
	public boolean addCustumer(custumer c);
	//创建一个会员卡充值的方法
	public boolean updateMoney();
	//创建一个会员卡挂失的方法
	public boolean addLoss();
	//创建一个点菜添加购物车的方法
	public boolean addShop();
	//创建一个删除购物车的方法
	public boolean deleteShop(int id);
	//创建一个查看购物车的方法
	public List<food> selectByEid();


			
}
