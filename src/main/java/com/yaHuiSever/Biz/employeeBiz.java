package com.yaHuiSever.Biz;

import java.util.List;

import com.yaHuiSever.domain.custumer;
import com.yaHuiSever.domain.food;

public interface employeeBiz {
	
	
	//员工登录业务
	   public String logEm();
		//添加客户业务
		public String increaseCustomer();
		//会员卡充值业务
		public String alterMoney();
		//会员卡挂失业务
		public String changeCustomer();
		//点餐添加购物车业务
		public String addShop();
		//删除购物车业务
		public String removeShop();
		//查看购物车业务,展示购物车
		public List<food> findShop();

}
