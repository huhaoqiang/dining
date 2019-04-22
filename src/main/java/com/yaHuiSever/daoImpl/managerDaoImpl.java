package com.yaHuiSever.daoImpl;

import java.util.List;


import com.yaHuiSever.dao.managerDao;
import com.yaHuiSever.domain.custumer;
import com.yaHuiSever.domain.empolyee;
import com.yaHuiSever.domain.food;
import com.yaHuiSever.until.DBUtil;

public class managerDaoImpl implements managerDao{
    
	//创建dbutil变量
		private DBUtil db;
		//经理登陆
		@Override
		public boolean loginManager(int mid, String mname) {
			
			return false;
		}
		//添加员工
	@Override
	public boolean addEmployee() {
		//实例化dbutil对象
		this.db=new DBUtil();
		//创建sql语句
				String sql="s";
		return false;
	}

	@Override
	public boolean deleteEmployee() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updeteEmployee() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<empolyee> selectEmployeeByid() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addCard() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCustumer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<custumer> selectCustumerById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateDisc() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<food> selectSalesById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<food> selectFoodById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateFood() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteFood() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateDiscFood() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addFood() {
		// TODO Auto-generated method stub
		return false;
	}

	

}
