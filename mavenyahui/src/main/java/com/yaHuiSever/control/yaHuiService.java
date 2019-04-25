package com.yaHuiSever.control;

import java.util.List;

import com.yaHuiSever.domain.custumer;
import com.yaHuiSever.domain.employee;
import com.yaHuiSever.domain.food;
import com.yaHuiSever.domain.gretype;
import com.yaHuiSever.domain.manager;
import com.yaHuiSever.domain.member;
import com.yaHuiSever.domain.order;
import com.yaHuiSever.domain.shop;


public interface yaHuiService {
	//员工的
	//员工登录业务
	public employee logEm(int eid,String epasswd);
	//添加客户业务
	public String increaseCustomer(int cid,String cname,String cpasswd,int melevel,int cfrezz,double money);
	//会员卡充值业务
	public String upMoney(double money,int eid);
	//会员卡挂失业务
	public String upCustomerByE(int cid,int eid );
	//点餐添加购物车业务
	public String insertShop(int foodid,int cid,int num);
	//删除购物车业务
	public String delShop(int id);
	//查看购物车业务,展示购物车
	public List<shop> findShop();
	//更改销量的业务
	public String changeSales(int foodid,int foodnum);
	//客户查询业务
	public List<custumer> findAllCustomer();
	//购物车总价计算
	public double findfprice();
	//11.单个菜品总价计算
	public double findfnummoney(int foodid,int cid);
	//添加一个为订单表提供 eid cid orderid的方法
	public boolean insertorder(int cid,int eid,String orderid,double ordermoney);
	//13.一个查询订单的方法
	public List<order> findAlltorder(); 
	//14.清空购物车的方法
	public boolean DropAllshops();
	//15.修改单个价钱
		public boolean updatefmoney(double foodmoney,int foodid);
	//16.扣钱
		public boolean disMoney(double a,int cid);
    

	//经理的
	//经理登陆业务
	public manager logM(int mid, String mpasswd);
	//添加普通员工业务
	public String insertEmployee(employee e);
	//修改普通员工业务
	public String upEmployee(int eid,String ename,String epasswd);
	//删除普通员工业务
	public String delEmployee(int eid);
	//查询普通员工业务(通过id)
	public employee findEmp( int eid);
	//客户补卡业务         还没写
	public String upCustumerByM(int cid,String cpasswd);
	//冻结客户业务(修改客户状态)      
	public String frezzCustumerByM(int cid,int cfrezz);
	//查询客户业务
	public custumer findCustumerByE(int cid);
	//设置优惠额度业务
	public String upMember(int melevel,double medisc);
	//添加菜品业务
	public String insertFood(int foodid,int typeid,String foodname,double foodprice);
	//删除菜品业务
	public String delFood(int foodid);
	//修改菜品业务
	public String upFood(int foodid,String foodname,double foodprice);
	//查询菜品业务
	public List<food> findFoodByM(int typeid);
	//		//设置特价菜业务
	//		public String upDisc(food f);
	//查看菜品销量业务
	public List<food> findSalesByM();
	//查询所有员工
	public List<employee> findAllEm();
	//查看菜类表
	public List<gretype>  findAllGre();
	//查看会员表
	public List<member> findAllMe();
	
	

}
