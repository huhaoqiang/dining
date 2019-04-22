package com.yaHuiSever.control;

import java.util.List;

import com.yaHuiSever.domain.custumer;
import com.yaHuiSever.domain.employee;
import com.yaHuiSever.domain.food;
import com.yaHuiSever.domain.manager;


public interface yaHuiService {
	//员工的
	    //员工登录业务
	   public employee logEm(int eid,String epasswd);
		//添加客户业务
		public String increaseCustomer(custumer c);
		//会员卡充值业务
		public String upMoney(double money,int eid);
		//会员卡挂失业务
		public String upCustomerByE(int cid,int eid );
		//点餐添加购物车业务
		public String insertShop(int foodid,int cid,int eid,int num);
		//删除购物车业务
		public String delShop(int id);
		//查看购物车业务,展示购物车
		public List<food> findShop();
		//更改销量的业务
		public String changeSales();
		//客户查询业务
		public List<custumer> findAllCustomer();

 
	//经理的
		//经理登陆业务
	    public manager logM(int mid, String mpasswd);
		//添加普通员工业务
		public String insertEmployee(employee e);
		//修改普通员工业务
		public String upEmployee(int eid,String ename,String epasswd);
		//删除普通员工业务
		public String delEmployee(employee e);
		//查询普通员工业务(通过id)
		public employee findEmp( int eid);
		//客户补卡业务         还没写
		public String upCustumerByM();
		//冻结客户业务(修改客户状态)      
		public String frezzCustumerByM(int cid,int cfrezz);
		//查询客户业务
		public custumer findCustumerByE(int cid);
		//设置优惠额度业务
		public String upMember(int melevel,double medisc);
		//添加菜品业务
		public String insertFood(food f);
		//删除菜品业务
		public String delFood(int foodid);
		//修改菜品业务
		public String upFood(int foodid,String foodname,double foodprice);
		//查询菜品业务
		public List<food> findFoodByM();
//		//设置特价菜业务
//		public String upDisc(food f);
		//查看菜品销量业务
		public List<food> findSalesByM();

}
