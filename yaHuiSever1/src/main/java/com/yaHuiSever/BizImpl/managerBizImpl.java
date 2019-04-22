package com.yaHuiSever.BizImpl;

import java.util.List;

import com.yaHuiSever.Biz.managerBiz;
import com.yaHuiSever.dao.managerDao;
import com.yaHuiSever.domain.custumer;
import com.yaHuiSever.domain.employee;
import com.yaHuiSever.domain.food;

public class managerBizImpl implements managerBiz{
	
	private managerDao mana;
	
	public managerBizImpl(managerDao mana) {
		super();
		this.mana = mana;
	}
//经理登录
	@Override
	public String logMan(int mid, String mpasswd) {
		// TODO Auto-generated method stub
		return null;
	}
//添加普通员工
	@Override
	public String increaseEmployee(employee e) {
		// TODO Auto-generated method stub
		return null;
	}
//修改员工信息
	@Override
	public String alterEmployee(employee e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String removeEmployee(int eid, String ename, String epasswd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<employee> findEmployeeByid(int eid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String alterCustumer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String frezzCustumer(int cid, int cfrezz) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<custumer> findCustumerByid(int cid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String alterMember(int melevel, double medisc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String increaseFood(food f) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String removeFood(int foodid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String alterFood(int foodid, String foodname, double foodprice) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<food> findFoodByid() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<food> findSales() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
