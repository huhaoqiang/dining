package com.yaHuiSever.daoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.yaHuiSever.dao.managerDao;
import com.yaHuiSever.domain.custumer;
import com.yaHuiSever.domain.employee;
import com.yaHuiSever.domain.food;
import com.yaHuiSever.domain.gretype;
import com.yaHuiSever.domain.manager;
import com.yaHuiSever.domain.member;
import com.yaHuiSever.until.DBUtil;

public class managerDaoImpl implements managerDao{

	//创建dbutil变量
	private DBUtil db;
	//经理登陆  可用
	@Override
	public manager loginManager(int mid, String passwd) {
		//实例化dbutil对象
		this.db=new DBUtil();
		//创建sql语句
		String sql="select * from manager where mid=? and mpasswd=?";
		try {
			ResultSet rs = this.db.query(sql,mid,passwd);
			while(rs.next()){
				return new	manager(rs.getInt("mid"),rs.getString("mname"),rs.getString("mpasswd"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	//添加员工   已测试，可用
	@Override
	public boolean addEmployee(employee e) {
		//实例化dbutil对象
		this.db=new DBUtil();
		//创建sql语句
		String sql="insert into employee values(?,?,?)";
		try {
			int i=this.db.update(sql, e.getEid(),e.getEname(),e.getEpasswd());
			return i>0;
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return false;
	}
	//删除员工  已测试 
	@Override
	public boolean deleteEmployee(int eid) {
		//实例化dbutil对象
		this.db=new DBUtil();
		//创建sql语句
		String sql="delete from employee where eid=?";
		try {
			int i = this.db.update(sql,eid);
			return i>0;
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		return false;
	}
	//修改员工  已测试，可用
	@Override
	public boolean updeteEmployee(int eid,String ename,String epasswd) {
		//实例化dbutil对象
		this.db=new DBUtil();
		//创建sql语句
		String sql="update  employee set ename=?,epasswd=? where eid=?";
		try {
			int i = this.db.update(sql,ename,epasswd,eid);
			return i>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}
	//通过id查询员工  可用
	@Override
	public employee selectEmployeeByid(int eid) {
		//实例化dbutil对象
		this.db=new DBUtil();
		//创建sql语句
		String sql="select * from employee where eid=?";
		try {
			ResultSet rs = this.db.query(sql,eid);
			if(rs.next()){
				return  new employee(rs.getInt("eid"),rs.getString("ename"),rs.getString("epasswd"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	//客户补卡 已测试
	@Override
	public boolean addCard(int cid,String cpasswd) {
		//实例化dbutil对象
		this.db=new DBUtil();
		//创建sql语句
		String sql="delete from loss where cid=? and cpasswd=?";
		try {
			int i = this.db.update(sql,cid,cpasswd);
			return i>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;


	}
	//客户冻结    已测试 可用
	@Override
	public boolean updateCustumer(int cid,int cfrezz) {
		//实例化dbutil对象
		this.db=new DBUtil();
		//创建sql语句
		String sql="update custumer set cfrezz=? where cid=?";
		try {
			int i = this.db.update(sql,cfrezz,cid);
			return i>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	//客户查询  已测试
	@Override
	public custumer selectCustumerById(int cid) {
		//实例化dbutil对象
		this.db=new DBUtil();
		//创建sql语句
		String sql="select * from custumer where cid=?";
		try {
			ResultSet rs = this.db.query(sql,cid);
			if(rs.next()){
				custumer c=new custumer();
				c.setCid(rs.getInt("cid"));
				c.setCname(rs.getString("cname"));
				c.setCpasswd(rs.getString("cpasswd"));
				c.setMelevel(rs.getInt("melevel"));
				c.setCfrezz(rs.getInt("cfrezz"));
				c.setMoney(rs.getDouble("money"));
				return c ;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}
	//修改折扣  已测试，可用
	@Override
	public boolean updateDisc(int melevel,double medisc ) {
		//实例化dbutil对象
		this.db=new DBUtil();
		//创建sql语句
		String sql="update  member set medisc=? where melevel=?";
		try {
			int i = this.db.update(sql,medisc,melevel);
			return i>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	//查看菜品 和销量   已测试
	@Override
	public List<food> selectAllFood(int typeid) {
		this.db=new DBUtil();
		//创建sql语句
		String sql="select * from food where typeid=?";
		try {
			ResultSet rs = this.db.query(sql,typeid);
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
	//修改菜品  已测试 可以使用
	@Override
	public boolean updateFood(int foodid,String foodname,double foodprice) {
		//实例化dbutil对象
		this.db=new DBUtil();
		//创建sql语句
		String sql="update food set foodname=?,foodprice=?  where foodid=?";
		try {
			int i = this.db.update(sql,foodname,foodprice,foodid);
			return i>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	//删除菜品  已测试 
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

	//添加菜品   已测试可以使用
	@Override
	public boolean addFood(int foodid,int typeid,String foodname,double foodprice) {
		//实例化dbutil对象
		this.db=new DBUtil();
		//创建sql语句
		String sql="insert into food values(?,?,?,?,0)";

		try {
			int i=this.db.update(sql, foodid,typeid,foodname,foodprice);
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
	//查看所有员工 可用
	@Override
	public List<employee> selectAllEmp() {
		//实例化dbutil对象
		this.db=new DBUtil();
		//创建sql语句
		String sql="select * from employee";
		try {
			ResultSet rs = this.db.query(sql);
			List<employee> list=new ArrayList<employee>();
			while(rs.next()){
				list.add(new employee(rs.getInt("eid"),rs.getString("ename"),rs.getString("epasswd")));
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		return null;
	}

	//查看菜类表
	@Override
	public List<gretype> selectAllType() {
		//实例化dbutil对象
		this.db=new DBUtil();
		//创建sql语句
		String sql="select * from gretype";
		try {
			ResultSet rs = this.db.query(sql);
			List<gretype> list=new ArrayList<gretype>();
			while(rs.next()){
				list.add(new gretype(rs.getInt("typeid"),rs.getString("typename")));
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	//查看会员表
	@Override
	public List<member> selectAllMember() {
		//实例化dbutil对象
		this.db=new DBUtil();
		//创建sql语句
		String sql="select * from member";
		try {
			ResultSet rs = this.db.query(sql);
			List<member> list=new ArrayList<member>();
			while(rs.next()){
				list.add(new member(rs.getInt("melevel"),rs.getString("mename"),rs.getDouble("medisc")));
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}



}
