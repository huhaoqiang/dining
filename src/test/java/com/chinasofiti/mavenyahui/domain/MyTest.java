package com.chinasofiti.mavenyahui.domain;

import javax.sql.rowset.JdbcRowSet;

import com.yaHuiSever.daoImpl.employeeDaoImpl;
import com.yaHuiSever.daoImpl.managerDaoImpl;
import com.yaHuiSever.domain.employee;
import com.yaHuiSever.domain.food;

import oracle.jdbc.driver.OracleDriver;

public class MyTest {

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
//	    a.addShop(101,1,1);
//	    a.deleteShop(101);
//	   b.addCard(1, "sds");
//b.selectAllFood();
	    a.selectcustomer();
	    
	    
	    
	}

}