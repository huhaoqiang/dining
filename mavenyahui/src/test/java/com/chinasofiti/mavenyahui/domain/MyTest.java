package com.chinasofiti.mavenyahui.domain;

import java.util.List;

import javax.sql.rowset.JdbcRowSet;

import org.junit.Test;

import com.yaHuiSever.control.yaHuiServiceImpl;
import com.yaHuiSever.daoImpl.employeeDaoImpl;
import com.yaHuiSever.daoImpl.managerDaoImpl;
import com.yaHuiSever.domain.custumer;
import com.yaHuiSever.domain.employee;
import com.yaHuiSever.domain.food;
import com.yaHuiSever.domain.gretype;
import com.yaHuiSever.domain.manager;
import com.yaHuiSever.domain.member;
import com.yaHuiSever.domain.order;
import com.yaHuiSever.domain.shop;

import oracle.jdbc.driver.OracleDriver;

public class MyTest {
	employeeDaoImpl a=new employeeDaoImpl();
    managerDaoImpl b=new managerDaoImpl();
    yaHuiServiceImpl c=new yaHuiServiceImpl();

   @Test
	public void kk(){
//	custumer c = b.selectCustumerById(1);
//	System.out.println(c);
//	   List<gretype> c = b.selectAllType();
//	   for (gretype a : c) {
//		   System.out.println(a);
//		
//	}
//	   List<member> c = b.selectAllMember();
//	   for (member a : c) {
//		   System.out.println(a);
//		employee c = a.loginEmployee(1, "123456");
//		System.out.println(c);
//	   manager c = b.loginManager(1, "123456");
//	   System.out.println(c);
//	   employee s = c.logEm(1, "123456");
//	   System.out.println(s);
//	   a.selectfoodprice();
//	   List<order> c = a.selectorder();
//	   for (order a : c) {
//		   System.out.println(a);
//		
//	}
	   double s = a.selectfoodnum(101, 1);
	   System.out.println(s);
	}
	
		
	
	
	
	
	

	public static void main(String[] args) {
		employeeDaoImpl a=new employeeDaoImpl();
	    managerDaoImpl b=new managerDaoImpl();
		
//		a.addCustumer(1, "sds", "dad", 0, 0, 100.1);
//       a.updateMoney(1001, 1);
//	    b.addEmployee(new employee(1,"asd","123456"));
//	    b.updeteEmployee(1, "zzz", "123");
//	    b.selectCustumerById(1); 
//	    b.updateCustumer(1, 1);
//	    b.updateDisc(1, 0.9);
//         b.addFood(101,10,"宫保鸡丁",100.1);
//	    b.selectAllEmp();
//	    b.updateFood(1, "zzzas", 99.9);
//          b.deleteFood(101);
//          b.deleteEmployee(1);
//	    b.selectAllFood();
//	    a.addLoss(1,1);
	    a.addShop(101,1,1);
//	    a.deleteShop(101);
//	   b.addCard(1, "sds");
//b.selectAllFood();
	   
//	  a.addsales(101, 1);  
//	    
	    
	    
	}

}
