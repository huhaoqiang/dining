package com.yaHuiSever.control;

import java.util.List;

import com.yaHuiSever.domain.custumer;
import com.yaHuiSever.domain.empolyee;
import com.yaHuiSever.domain.food;

public class yaHuiServiceImpl implements yaHuiService{

	@Override
	public String logEm(String id, String passed) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String increaseCustomer(int id, String name, String passwd, int level, double money) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String upMoney(custumer c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String upCustomerByE(int cid, String cname, int clevel, int eid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String insertShop(int fid, int cid, int eid, String fname, double fprice, int num) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delShop(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<food> findShop() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String logM(String id, String passed) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String insertEmployee(int id, String name, String passwd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String upEmployee(empolyee e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delEmployee(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<empolyee> findEmp(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String upCustumerByM(custumer c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String frezzCustumerByM(int c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<custumer> findCustumerByE() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String upMember(double d) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String insertFood(int id, String name, double price, int type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delFood(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String upFood(food f) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<food> findFoodByM() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String upDisc(food f) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<food> findSalesByM() {
		// TODO Auto-generated method stub
		return null;
	}

}
