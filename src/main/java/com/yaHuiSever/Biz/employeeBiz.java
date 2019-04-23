package com.yaHuiSever.Biz;

import java.util.List;

import com.yaHuiSever.domain.custumer;
import com.yaHuiSever.domain.employee;
import com.yaHuiSever.domain.food;
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
		public String addShop(int foodid,int cid,int eid,int num);
		//删除购物车业务
		public String removeShop(int id);
		//查看购物车业务,展示购物车
		public List<shop> findShops();
		//更改销量的业务
		public String alterSales(int foodid,int foodnum);
		//客户查询业务
		public List<custumer> findCustomer();

}
