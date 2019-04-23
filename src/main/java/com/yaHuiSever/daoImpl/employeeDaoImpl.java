package com.yaHuiSever.daoImpl;




import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.yaHuiSever.dao.employeeDao;
import com.yaHuiSever.domain.custumer;
import com.yaHuiSever.domain.employee;
import com.yaHuiSever.domain.food;
import com.yaHuiSever.domain.shop;
import com.yaHuiSever.until.DBUtil;

public class employeeDaoImpl implements employeeDao{
	//创建dbutil变量
	private DBUtil db;
	//员工登录
	@Override
	public employee loginEmployee(int eid,String epasswd) {
		//实例化dbutil对象
		this.db=new DBUtil();
		//创建sql语句
		String sql="select * from employee where eid=? and epasswd=?";
		try {
			ResultSet rs = this.db.query(sql,eid,epasswd);
			while(rs.next()){
				return	new employee(rs.getInt("eid"), rs.getString("ename"),rs.getString("epasswd"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	//添加顾客   已测试，可用
	@Override
	public boolean addCustumer(int cid,String cname,String cpasswd,int melevel,int cfrezz,double money) {
		//实例化dbutil对象
		this.db=new DBUtil();
		//创建sql语句
		String sql="insert into custumer values(?,?,?,?,?,?)";
		try {
			int i=this.db.update(sql,cid,cname,cpasswd,melevel,cfrezz,money);
			return i>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	//客户充值  已测试
	@Override
	public boolean updateMoney(double money,int cid) {
		//实例化dbutil对象
		this.db=new DBUtil();
		//创建sql语句
		String sql="update custumer set money=? where cid=? ";
		try {
			int i = this.db.update(sql,money,cid);
			return i>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	//客户挂失   已测试
	@Override
	public boolean addLoss(int cid,int eid) {
		//实例化dbutil对象
		this.db=new DBUtil();
		//创建sql语句
		String sql="insert into loss values((select cid from custumer where cid=?),(select cname from custumer where cid=?),(select melevel from custumer where cid=?),?)";
		try {
			int i=this.db.update(sql,cid,cid,cid,eid );
			return i>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	//添加购物车 已测试
	@Override
	public boolean addShop(int foodid,int cid,int num) {
		//实例化dbutil对象
		this.db=new DBUtil();
		//创建sql语句
		String sql="insert into shop values(?,(select foodname from food where foodid=?),(select foodprice from food where foodid=?),?)";
		try {
			int i=this.db.update(sql,foodid,foodid,foodid,num);
			return i>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}
	//删除购物车 已测试
	@Override
	public boolean deleteShop(int id) {
		//实例化dbutil对象
		this.db=new DBUtil();
		//创建sql语句
		String sql="delete  from shop where foodid="+id;
		try {
			int i = this.db.update(sql);
			return i>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	//查看购物车q
	@Override
	public List<shop> selectByEid() {
		//实例化dbutil对象
		this.db=new DBUtil();
		//创建sql语句
		String sql="select * from shop";
		try {
			ResultSet rs = this.db.query(sql);
			//创建一个list集合用于存储所有的课程
			List<shop> list=new ArrayList<shop>();
			while(rs.next()){
				list.add(new shop(rs.getInt("foodid"),rs.getNString("foodname"),rs.getDouble("foodprice"),rs.getInt("number")));
			}
			return list;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	//销量增加
	@Override
	public boolean addsales(int foodid,int foodnum) {

		this.db=new DBUtil();
		//创建sql语句
		String sql="update food set foodnum=? where foodid=?";
		try {
			int i = this.db.update(sql,foodid,foodnum);
			return i>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	//客户查询
	@Override
	public List<custumer> selectcustomer() {
		this.db=new DBUtil();
		//创建sql语句
		String sql="select * from custumer";
		try {
			ResultSet rs = this.db.query(sql);
			List<custumer> list=new ArrayList<custumer>();
			while(rs.next()){
				list.add(new custumer(rs.getInt("cid"),rs.getString("cname"),rs.getString("cpasswd"),rs.getInt("cfrezz"),rs.getDouble("money"),rs.getInt("melevel")));
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}





}
