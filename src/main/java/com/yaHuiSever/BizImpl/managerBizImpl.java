package com.yaHuiSever.BizImpl;

import java.util.List;

import com.yaHuiSever.Biz.managerBiz;
import com.yaHuiSever.dao.managerDao;
import com.yaHuiSever.daoImpl.managerDaoImpl;
import com.yaHuiSever.domain.custumer;
import com.yaHuiSever.domain.employee;
import com.yaHuiSever.domain.food;
import com.yaHuiSever.domain.gretype;
import com.yaHuiSever.domain.manager;
import com.yaHuiSever.domain.member;

public class managerBizImpl implements managerBiz{
	
	private managerDao mana;
	
	public managerBizImpl() {
		super();
		this.mana = new managerDaoImpl();
	}
//经理登录
	@Override
	public manager logMan(int mid, String mpasswd) {
	
		return this.mana.loginManager(mid, mpasswd);
	}
//添加普通员工
	@Override
	public String increaseEmployee(employee e) {
	
		return this.mana.addEmployee(e)?"添加成功！":"添加失败！";
	}
//修改员工信息
	@Override
	public String alterEmployee(int eid,String ename,String epasswd) {
		
		return this.mana.updeteEmployee(eid, ename, epasswd)?"修改成功！":"修改失败！";
	}
//删除员工
	@Override
	public String removeEmployee(int eid) {
		
		return this.mana.deleteEmployee(eid)?"删除成功！":"删除失败！";
	}
//通过id查询员工
	@Override
	public employee findEmployeeByid(int eid) {
		
		return this.mana.selectEmployeeByid(eid);
	}
//客户补卡操作
	@Override
	public String alterCustumer(int cid,String cpasswd) {
		
		return this.mana.addCard(cid, cpasswd)?"补卡成功！":"补卡失败！";
	}
// 冻结客户
	@Override
	public String frezzCustumer(int cid, int cfrezz) {
		
		return this.frezzCustumer(cid, cfrezz);
	}
//通过id查询
	@Override
	public custumer findCustumerByid(int cid) {
		
		return this.mana.selectCustumerById(cid);
	}
//设置优惠额度业务
	@Override
	public String alterMember(int melevel, double medisc) {
		
		return this.mana.updateDisc(melevel, medisc)?"修改成功！":"修改失败！";
	}
	//添加菜品业务
	@Override
	public String increaseFood(int foodid,int typeid,String foodname,double foodprice) {
		
		return this.mana.addFood(foodid,typeid, foodname, foodprice)?"添加成功！":"添加失败！";
	}
	//删除菜品业务
	@Override
	public String removeFood(int foodid) {
		
		return this.mana.deleteFood(foodid)?"删除成功！":"删除失败！";
	}
	//修改菜品业务
	@Override
	public String alterFood(int foodid, String foodname, double foodprice) {
		
		return this.mana.updateFood(foodid, foodname, foodprice)?"修改成功！":"修改失败！";
	}
	//查询菜品业务
	@Override
	public List<food> findFood() {
		
		return this.mana.selectAllFood();
	}
	//查看菜品销量业务
	@Override
	public List<food> findSales() {
		
		return null;
	}
	//查询所有员工
	@Override
	public List<employee> findAllEmp() {
		
		return this.mana.selectAllEmp();
	}
	//查看菜类表的方法
	@Override
	public List<gretype> findAllType() {
	
		return this.mana.selectAllType();
	}
	//查看会员表
	@Override
	public List<member> findAllMember() {
	
		return this.mana.selectAllMember();
	}
	

}
