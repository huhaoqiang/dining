package com.yaHuiSever.dao;

import java.util.List;

import com.yaHuiSever.domain.custumer;
import com.yaHuiSever.domain.empolyee;
import com.yaHuiSever.domain.food;

public interface managerDao {
	//创建一个经理登陆的方法
	public boolean loginManager(int mid, String mname);
    //创建一个添加普通员工的方法
	public boolean addEmployee();
	//创建一个删除普通员工的方法
	public boolean deleteEmployee();
	//创建一个修改普通员工的方法
	public boolean updeteEmployee();
	//创建一个查询普通员工的方法
	public List<empolyee> selectEmployeeByid();
	//创建一个客户补卡的方法
	public void addCard();
	//创建一个客户冻结的方法
	public void updateCustumer();
	//创建一个客户查询的方法
	public List<custumer> selectCustumerById();
	//创建一个设置优惠额度的方法
	public boolean updateDisc();
	//创建一个查看菜品销量的方法
	public List<food> selectSalesById();
	//创建一个增加菜品的方法
	public boolean addFood();
	//创建一个查看菜品种类的方法
	public List<food> selectFoodById();
	//创建一个修改菜品的方法
	public boolean updateFood();
	//创建一个删除菜品的方法
	public boolean deleteFood();
	//创建一个设置特价菜品（修改菜名，单价）的方法
	public boolean updateDiscFood();
	
}
