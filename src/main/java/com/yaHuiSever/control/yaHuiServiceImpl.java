package com.yaHuiSever.control;

import java.util.List;

import com.yaHuiSever.Biz.employeeBiz;
import com.yaHuiSever.Biz.managerBiz;
import com.yaHuiSever.BizImpl.employeeBizImpl;
import com.yaHuiSever.BizImpl.managerBizImpl;
import com.yaHuiSever.domain.custumer;
import com.yaHuiSever.domain.employee;
import com.yaHuiSever.domain.food;
import com.yaHuiSever.domain.manager;

public class yaHuiServiceImpl implements yaHuiService{
	private employeeBiz embiz;
	private managerBiz mabiz;
	
    public yaHuiServiceImpl() {
		super();
		this.embiz = new employeeBizImpl();
		this.mabiz = new managerBizImpl();
	}
	//员工登录
	@Override
	public employee logEm(int eid, String epasswd) {
		
		return this.embiz.logEm(eid, epasswd);
	}
    //添加客户
	@Override
	public String increaseCustomer(custumer c) {
	
		return this.embiz.increaseCustomer(c);
	}
    //充值
	@Override
	public String upMoney(double money, int eid) {
		
		return this.embiz.alterMoney(money, eid);
	}
    //会员卡挂失
	@Override
	public String upCustomerByE(int cid, int eid) {
		
		return this.embiz.changeCustomer(cid, eid);
	}
//添加购物车
	@Override
	public String insertShop(int foodid, int cid, int eid, int num) {
		
		return this.embiz.addShop(foodid, cid, eid, num);
	}
  //删除购物车
	@Override
	public String delShop(int id) {
		
		return this.embiz.removeShop(id);
	}
//查看购物车
	@Override
	public List<food> findShop() {
	
		return this.embiz.findShops();
	}
//创建一个增加销量的方法
	@Override
	public String changeSales() {
	
		return this.embiz.alterSales();
	}
//查询所有客户
	@Override
	public List<custumer> findAllCustomer() {
		
		return this.embiz.findCustomer();
	}
//经理登陆
	@Override
	public manager logM(int mid, String mpasswd) {
	
		return this.mabiz.logMan(mid, mpasswd);
	}
//添加员工
	@Override
	public String insertEmployee(employee e) {
		
		return this.mabiz.increaseEmployee(e);
	}
//修改员工信息
	@Override
	public String upEmployee(int eid, String ename, String epasswd) {
	
		return this.mabiz.alterEmployee(eid, ename, epasswd);
	}
//删除员工信息
	@Override
	public String delEmployee(employee e) {
		
		return this.mabiz.removeEmployee(e);
	}
////查询普通员工业务(通过id)
	@Override
	public employee findEmp(int eid) {

		return this.mabiz.findEmployeeByid(eid);
	}
	//客户补卡业务         还没写
	@Override
	public String upCustumerByM() {
	
		return this.mabiz.alterCustumer();
	}
	//冻结客户业务(修改客户状态)  
	@Override
	public String frezzCustumerByM(int cid, int cfrezz) {
	
		return this.mabiz.frezzCustumer(cid, cfrezz);
	}
	//查询客户业务
	@Override
	public custumer findCustumerByE(int cid) {

		return this.mabiz.findCustumerByid(cid);
	}
	//设置优惠额度业务
	@Override
	public String upMember(int melevel, double medisc) {
	
		return this.mabiz.alterMember(melevel, medisc);
	}
	//添加菜品业务
	@Override
	public String insertFood(food f) {
		
		return this.mabiz.increaseFood(f);
	}
	//删除菜品业务
	@Override
	public String delFood(int foodid) {

		return this.mabiz.removeFood(foodid);
	}
	//修改菜品业务
	@Override
	public String upFood(int foodid, String foodname, double foodprice) {
	
		return this.mabiz.alterFood(foodid, foodname, foodprice);
	}
	//查询菜品业务
	@Override
	public List<food> findFoodByM() {
	
		return this.mabiz.findFood();
	}
	//查看菜品销量业务
	@Override
	public List<food> findSalesByM() {
	
		return this.mabiz.findSales();
	}

	
}
