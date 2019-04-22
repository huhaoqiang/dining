package com.yaHuiSever.control;

import java.util.List;

import com.yaHuiSever.domain.custumer;
import com.yaHuiSever.domain.empolyee;
import com.yaHuiSever.domain.food;


public interface yaHuiService {
	//员工的
	    //员工登录业务
	   public String logEm(String eid,String epassed);
		//添加客户业务
		public String increaseCustomer(int id,String name,String passwd,int level,double money);
		//会员卡充值业务
		public String upMoney(custumer c);
		//会员卡挂失业务
		public String upCustomerByE(int cid,String cname,int clevel,int eid );
		//点餐添加购物车业务
		public String insertShop(int fid,int cid,int eid,String fname,double fprice,int num);
		//删除购物车业务
		public String delShop(int id);
		//查看购物车业务,展示购物车
		public List<food> findShop();
 
	//经理的
		//经理登陆业务
	    public String logM(String mid,String mpassed);
		//添加普通员工业务
		public String insertEmployee(int id,String name,String passwd);
		//修改普通员工业务
		public String upEmployee(empolyee e);
		//删除普通员工业务
		public String delEmployee(int id);
		//查询普通员工业务(通过id)
		public List<empolyee> findEmp(int id);
		//客户补卡业务
		public String upCustumerByM(custumer c);
		//冻结客户业务(修改客户状态)
		public String frezzCustumerByM(int c);
		//查询客户业务
		public List<custumer> findCustumerByE();
		//设置优惠额度业务
		public String upMember(double d);
		//添加菜品业务
		public String insertFood(int id,String name,double price,int type);
		//删除菜品业务
		public String delFood(int id);
		//修改菜品业务
		public String upFood(food f);
		//查询菜品业务
		public List<food> findFoodByM();
		//设置特价菜业务
		public String upDisc(food f);
		//查看菜品销量业务
		public List<food> findSalesByM();

}
