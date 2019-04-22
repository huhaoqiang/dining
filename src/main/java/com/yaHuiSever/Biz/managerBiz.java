package com.yaHuiSever.Biz;

import java.util.List;

import com.yaHuiSever.domain.custumer;
import com.yaHuiSever.domain.empolyee;
import com.yaHuiSever.domain.food;

public interface managerBiz {
	
	//经理登陆业务
    public String logMan();
	//添加普通员工业务
	public String increaseEmployee();
	//修改普通员工业务
	public String alterEmployee();
	//删除普通员工业务
	public String removeEmployee();
	//查询普通员工业务(通过id)
	public List<empolyee> findEmployeeByid();
	//客户补卡业务
	public String alterCustumer();
	//冻结客户业务
	public String frezzCustumer();
	//查询客户业务
	public List<custumer> findCustumerByid();
	//设置优惠额度业务
	public String alterMember();
	//添加菜品业务
	public String increaseFood();
	//删除菜品业务
	public String removeFood();
	//修改菜品业务
	public String alterFood();
	//查询菜品业务
	public List<food> findFoodByid();
	//设置特价菜业务
	public String alterDisc();
	//查看菜品销量业务
	public List<food> findSales();
	
}
