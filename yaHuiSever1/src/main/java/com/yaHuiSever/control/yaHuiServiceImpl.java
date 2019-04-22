package com.yaHuiSever.control;

import java.util.List;

import com.yaHuiSever.domain.custumer;
import com.yaHuiSever.domain.employee;
import com.yaHuiSever.domain.food;

public class yaHuiServiceImpl implements yaHuiService{
    //员工登录
	@Override
	public String logEm(int eid, String epasswd) {
		// TODO Auto-generated method stub
		return null;
	}
    //添加客户
	@Override
	public String increaseCustomer(custumer c) {
		// TODO Auto-generated method stub
		return null;
	}
    //充值
	@Override
	public String upMoney(double money, int eid) {
		// TODO Auto-generated method stub
		return null;
	}
    //会员卡挂失
	@Override
	public String upCustomerByE(int cid, int eid) {
		// TODO Auto-generated method stub
		return null;
	}
//添加购物车
	@Override
	public String insertShop(int foodid, int cid, int eid, int num) {
		// TODO Auto-generated method stub
		return null;
	}
  //删除购物车
	@Override
	public String delShop(int id) {
		// TODO Auto-generated method stub
		return null;
	}
//查看购物车
	@Override
	public List<food> findShop() {
		// TODO Auto-generated method stub
		return null;
	}
//创建一个增加销量的方法
	@Override
	public String alterSales() {
		// TODO Auto-generated method stub
		return null;
	}
//查询所有客户
	@Override
	public List<custumer> findCustomer() {
		// TODO Auto-generated method stub
		return null;
	}
//经理登陆
	@Override
	public String logM(int mid, String mpasswd) {
		// TODO Auto-generated method stub
		return null;
	}
//添加员工
	@Override
	public String insertEmployee(employee e) {
		// TODO Auto-generated method stub
		return null;
	}
//修改员工信息
	@Override
	public String upEmployee(int eid, String ename, String epasswd) {
		// TODO Auto-generated method stub
		return null;
	}
//删除员工信息
	@Override
	public String delEmployee(employee e) {
		// TODO Auto-generated method stub
		return null;
	}
////查询普通员工业务(通过id)
	@Override
	public List<employee> findEmp(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	//客户补卡业务         还没写
	@Override
	public String upCustumerByM(custumer c) {
		// TODO Auto-generated method stub
		return null;
	}
	//冻结客户业务(修改客户状态)  
	@Override
	public String frezzCustumerByM(int cid, int cfrezz) {
		// TODO Auto-generated method stub
		return null;
	}
	//查询客户业务
	@Override
	public List<custumer> findCustumerByE() {
		// TODO Auto-generated method stub
		return null;
	}
	//设置优惠额度业务
	@Override
	public String upMember(int melevel, double medisc) {
		// TODO Auto-generated method stub
		return null;
	}
	//添加菜品业务
	@Override
	public String insertFood(food f) {
		// TODO Auto-generated method stub
		return null;
	}
	//删除菜品业务
	@Override
	public String delFood(int foodid) {
		// TODO Auto-generated method stub
		return null;
	}
	//修改菜品业务
	@Override
	public String upFood(int foodid, String foodname, double foodprice) {
		// TODO Auto-generated method stub
		return null;
	}
	//查询菜品业务
	@Override
	public List<food> findFoodByM() {
		// TODO Auto-generated method stub
		return null;
	}
	//查看菜品销量业务
	@Override
	public List<food> findSalesByM() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
