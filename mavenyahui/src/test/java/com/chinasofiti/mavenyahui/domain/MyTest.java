package com.chinasofiti.mavenyahui.domain;

import javax.sql.rowset.JdbcRowSet;

import com.yaHuiSever.daoImpl.employeeDaoImpl;

import oracle.jdbc.driver.OracleDriver;

public class MyTest {

	public static void main(String[] args) {
		employeeDaoImpl a=new employeeDaoImpl();
		a.addCustumer(1, "sds", "dad", 0, 0, 100.1);
       
	}

}
