package com.yaHuiSever.Biz;

import java.util.List;

import com.yaHuiSever.domain.custumer;
import com.yaHuiSever.domain.employee;
import com.yaHuiSever.domain.order;
import com.yaHuiSever.domain.shop;

public interface employeeBiz { 
	//员工登录业务
	public employee logEm(int eid,String epasswd);
	//添加客户业务
	public String increaseCustomer(int cid,String cname,String cpasswd,int melevel,int cfrezz,double money);
	//会员卡充值业务
	public String alterMoney(double money,int eid);
	//会员卡挂失业务
	public String changeCustomer(int cid,int eid);
	//点餐添加购物车业务
	public String addShop(int foodid,int cid,int num);
	//删除购物车业务
	public String removeShop(int id);
	//查看购物车业务,展示购物车
	public List<shop> findShops();
	//更改销量的业务
	public String alterSales(int foodid,int foodnum);
	//客户查询业务
	public List<custumer> findCustomer();
	//总价计算业务
	public double findfoodprice();
	//订单金额添加
	public double findfoodnum(int foodid,int cid);
	//添加一个为订单表提供 eid cid orderid的方法
	public boolean increaseorder(int cid,int eid,String orderid,double ordermoney);
	//13.创建一个查询订单的方法
	public List<order> findorder(); 
	//14.清空购物车的方法
	public boolean dropshops();
	//修改单个价钱
	public boolean changefoodmoney(double foodmoney,int foodid);
	//16.扣钱
	public boolean disAMoney(double a,int cid);

}
