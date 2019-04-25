package com.yaHuiSever.BizImpl;

import java.util.List;

import com.yaHuiSever.Biz.employeeBiz;
import com.yaHuiSever.dao.employeeDao;
import com.yaHuiSever.daoImpl.employeeDaoImpl;
import com.yaHuiSever.domain.custumer;
import com.yaHuiSever.domain.employee;
import com.yaHuiSever.domain.food;
import com.yaHuiSever.domain.order;
import com.yaHuiSever.domain.shop;

public class employeeBizImpl implements employeeBiz{

	private employeeDao emp;


	public employeeBizImpl() {
		super();
		this.emp = new employeeDaoImpl();
	}
	//员工登录业务
	@Override
	public employee logEm(int eid, String epasswd) {

		return this.emp.loginEmployee(eid, epasswd);
	}
	//添加客户业务
	@Override
	public String increaseCustomer(int cid,String cname,String cpasswd,int melevel,int cfrezz,double money) {

		return this.emp.addCustumer(cid, cname, cpasswd, melevel, cfrezz, money)?"添加成功！":"添加失败！";
	}
	//会员卡充值业务
	@Override
	public String alterMoney(double money, int eid) {

		return this.emp.updateMoney(money, eid)?"充值成功！":"充值失败！";
	}
	//会员卡挂失业务
	@Override
	public String changeCustomer(int cid, int eid) {

		return this.emp.addLoss(cid, eid)?"挂失成功！":"挂失失败！";
	}
	//点餐添加购物车业务
	@Override
	public String addShop(int foodid, int cid, int num) {

		return this.emp.addShop(foodid, cid,num)?"添加成功！":"添加失败！";
	}
	//删除购物车业务
	@Override
	public String removeShop(int id) {

		return this.emp.deleteShop(id)?"删除成功!":"删除失败！" ;
	}
	//查看购物车业务,展示购物车
	@Override
	public List<shop> findShops() {

		return this.emp.selectByEid();
	}
	//更改销量的业务
	@Override
	public String alterSales(int foodid,int foodnum) {

		return this.emp.addsales(foodid, foodnum)?"":"";
	}
	//客户查询业务
	@Override
	public List<custumer> findCustomer() {

		return this.emp.selectcustomer();
	}
	//查询菜品单价
	@Override
	public double findfoodprice() {

		return this.emp.selectfoodprice();
	}
	//订单金额添加
	@Override
	public double findfoodnum(int foodid,int cid) {
		// TODO Auto-generated method stub
		return this.emp.selectfoodnum(foodid, cid);
	}
	//添加一个为订单表提供 eid cid orderid的方法
	@Override
	public boolean increaseorder(int cid, int eid, String orderid,double ordermoney) {
		// TODO Auto-generated method stub
		return this.emp.addorder(cid, eid, orderid, ordermoney);
	}
	//13.创建一个查询订单的方法
	@Override
	public List<order> findorder() {
		
		return this.emp.selectorder();
	}
	//清空购物车
	@Override
	public boolean dropshops() {
		return this.emp.dropshop();
	}
	//修改单个购物车价格
	@Override
	public boolean changefoodmoney(double foodmoney, int foodid) {
		
		return this.emp.updatefoodmoney(foodmoney, foodid);
	}
	//扣钱
	@Override
	public boolean disAMoney(double a, int cid) {
		// TODO Auto-generated method stub
		return this.emp.disMoney(a, cid);
	}



}
