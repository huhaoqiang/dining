package com.yaHuiSever.Biz;

import java.util.List;

import com.yaHuiSever.domain.custumer;
import com.yaHuiSever.domain.employee;
import com.yaHuiSever.domain.food;
import com.yaHuiSever.domain.gretype;
import com.yaHuiSever.domain.manager;
import com.yaHuiSever.domain.member;

public interface managerBiz {

	//经理登陆业务
	public manager logMan(int mid, String mpasswd);
	//添加普通员工业务
	public String increaseEmployee(employee e);
	//修改普通员工业务
	public String alterEmployee(int eid,String ename,String epasswd);
	//删除普通员工业务
	public String removeEmployee(int eid);
	//查询普通员工业务(通过id)
	public employee findEmployeeByid(int eid);
	//客户补卡业务
	public String alterCustumer(int cid,String cpasswd);
	//冻结客户业务
	public String frezzCustumer(int cid,int cfrezz);
	//查询客户业务
	public custumer findCustumerByid(int cid);
	//设置优惠额度业务
	public String alterMember(int melevel,double medisc);
	//添加菜品业务
	public String increaseFood(int foodid,int typeid,String foodname,double foodprice);
	//删除菜品业务
	public String removeFood(int foodid);
	//修改菜品业务
	public String alterFood(int foodid,String foodname,double foodprice);
	//查询菜品业务
	public List<food> findFood(int typeid);
	//查看菜品销量业务
	public List<food> findSales();
	//查询所有员工
	public List<employee> findAllEmp();
	//查看菜类表的方法
	public List<gretype> findAllType();
	//查看会员表
	public List<member> findAllMember();

}
