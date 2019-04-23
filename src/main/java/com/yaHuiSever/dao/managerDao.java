package com.yaHuiSever.dao;

import java.util.List;

import com.yaHuiSever.domain.custumer;
import com.yaHuiSever.domain.employee;
import com.yaHuiSever.domain.food;
import com.yaHuiSever.domain.manager;

public interface managerDao {
	//1.创建一个经理登陆的方法
	public manager loginManager(int mid, String mpasswd);
    //2.创建一个添加普通员工的方法
	public boolean addEmployee(employee e);
	//3.创建一个删除普通员工的方法
	public boolean deleteEmployee(int eid);
	//4.创建一个修改普通员工的方法
	public boolean updeteEmployee(int eid,String ename,String epasswd);
	//5.创建一个通过id查询普通员工的方法
	public employee selectEmployeeByid(int eid);
	//6.创建一个客户补卡的方法
	public boolean addCard(int cid,String cpasswd);
	//7.创建一个客户冻结的方法
	public boolean updateCustumer(int cid,int cfrezz);
	//8.创建一个客户查询的方法通过id
	public custumer selectCustumerById(int cid);
	//9.创建一个设置优惠额度的方法
	public boolean updateDisc(int melevel,double medisc );
	//10.创建一个查看菜品销量的方法
	public List<food> selectsales();
	//11.创建一个增加菜品的方法
	public boolean addFood(food f);
	//12.创建一个查看菜品种类的方法和销量
	public List<food> selectAllFood();
	//13.创建一个修改菜品的方法
	public boolean updateFood(int foodid,String foodname,double foodprice);
	//14.创建一个删除菜品的方法
	public boolean deleteFood(int foodid);
	//15.创建一个查询所有员工的方法
	public List<employee> selectAllEmp();
	
	
	
}
