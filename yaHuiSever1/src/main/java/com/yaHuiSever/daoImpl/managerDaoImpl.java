package com.yaHuiSever.daoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.yaHuiSever.dao.managerDao;
import com.yaHuiSever.domain.custumer;
import com.yaHuiSever.domain.employee;
import com.yaHuiSever.domain.food;
import com.yaHuiSever.domain.manager;
import com.yaHuiSever.until.DBUtil;

public class managerDaoImpl implements managerDao{

	//创建dbutil变量
	private DBUtil db;
	//经理登陆
	@Override
	public manager loginManager(int mid, String passwd) {
		//实例化dbutil对象
		this.db=new DBUtil();
		//创建sql语句
		String sql="select * from manager where mid=? and mpasswd=?";
		try {
			ResultSet rs = this.db.query(sql);
			while(rs.next()){
				return new	manager(rs.getInt("mid"),rs.getString("mname"),rs.getString("mpasswd"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	//添加员工
	@Override
	public boolean addEmployee(employee e) {
		//实例化dbutil对象
		this.db=new DBUtil();
		//创建sql语句
		String sql="insert into employee values(?,?,?)";
		try {
			int i=this.db.update(sql, e.getEid(),e.getEname(),e.getEpasswed());
			return i>0;
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return false;
	}
	//删除员工
	@Override
	public boolean deleteEmployee(employee e) {
		//实例化dbutil对象
		this.db=new DBUtil();
		//创建sql语句
		String sql="delete from employee where id=?";
		try {
			int i = this.db.update(sql,e.getEid() );
			return i>0;
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		return false;
	}
	//修改员工
	@Override
	public boolean updeteEmployee(int eid,String ename,String epasswd) {
		//实例化dbutil对象
		this.db=new DBUtil();
		//创建sql语句
		String sql="update  employee set ename=?,epasswd=? where eid=?";
		try {
			int i = this.db.update(sql,eid,ename,epasswd);
			return i>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}
	//通过id查询员工
	@Override
	public employee selectEmployeeByid(int eid) {
		//实例化dbutil对象
		this.db=new DBUtil();
		//创建sql语句
		String sql="select * from employee where eid=?";
		try {
			ResultSet rs = this.db.query(sql,eid);
			if(rs.next()){
				employee e=new employee();
				e.setEid(e.getEid());
				e.setEname(e.getEpasswed());
				e.setEpasswed(e.getEpasswed());
				return  e;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	//客户补卡
	@Override
	public void addCard() {
		// TODO Auto-generated method stub

	}
	//客户冻结
	@Override
	public boolean updateCustumer(int cid,int cfrezz) {
		//实例化dbutil对象
		this.db=new DBUtil();
		//创建sql语句
		String sql="update customer set cfrezz=? where cid=?";
		try {
			int i = this.db.update(sql,cid,cfrezz);
			return i>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	//客户查询
	@Override
	public custumer selectCustumerById(int cid) {
		//实例化dbutil对象
				this.db=new DBUtil();
				//创建sql语句
				String sql="select * from employee where eid=?";
				try {
					ResultSet rs = this.db.query(sql,cid);
					if(rs.next()){
						custumer c=new custumer();
						c.setCid(c.getCid());
						c.setCname(c.getCname());
						c.setCpasswd(c.getCpasswd());
						return c ;
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	
		return null;
	}
	//修改折扣
	@Override
	public boolean updateDisc(int melevel,double medisc ) {
		//实例化dbutil对象
		this.db=new DBUtil();
		//创建sql语句
		String sql="update  employee set medisc=? where melevel=?";
		try {
			int i = this.db.update(sql,melevel,medisc);
			return i>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
//	//查看菜品销量
//	@Override
//	public List<food> selectSalesById() {
//		// TODO Auto-generated method stub
//		return null;
//	}
	//查看菜品 和销量
	@Override
	public List<food> selectAllFood() {
		this.db=new DBUtil();
		//创建sql语句
		String sql="select * from course";
		try {
			ResultSet rs = this.db.query(sql);
			List<food> list=new ArrayList<food>();
			while(rs.next()){
				list.add(new food(rs.getInt("foodid"), rs.getString("foodname"),rs.getDouble("foodprice"),rs.getInt("typeid"),rs.getInt("foodnum")));
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	//修改菜品
	@Override
	public boolean updateFood(int foodid,String foodname,double foodprice) {
		//实例化dbutil对象
		this.db=new DBUtil();
		//创建sql语句
		String sql="update food set foodname=?,foodprice=?  where foodid=?";
		try {
			int i = this.db.update(sql,foodid,foodname,foodprice);
			return i>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	//删除菜品
	@Override
	public boolean deleteFood(int foodid) {
		//实例化dbutil对象
		this.db=new DBUtil();
		//创建sql语句
		String sql="delete from food where foodid=?";
		try {
			int i = this.db.update(sql,foodid);
			return i>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	//   //修改特价菜
	//	@Override
	//	public boolean updateDiscFood() {
	//		// TODO Auto-generated method stub
	//		return false;
	//	}
	//添加菜品
	@Override
	public boolean addFood(food f) {
		//实例化dbutil对象
		this.db=new DBUtil();
		//创建sql语句
		String sql="insert into food values(?,?,?,?,0)";

		try {
			int i=this.db.update(sql, f.getFoodid(),f.getFoodname(),f.getFoodprice(),f.getTypeid());
			return i>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	//查看销量的方法
	@Override
	public List<food> selectsales() {
		// TODO Auto-generated method stub
		return null;
	}



}
