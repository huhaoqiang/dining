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
import com.yaHuiSever.domain.order;
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
			if(rs.next()){
				return	new employee(rs.getInt("eid"), rs.getString("ename"),rs.getString("epasswd"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			db.closed();
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
		}finally{
			this.db.closed();
		}
		return false;
	}
	//客户充值  已测试
	@Override
	public boolean updateMoney(double money,int cid) {

        //实例化dbutil对象
		this.db=new DBUtil();
		//创建sql语句
		//充值，从数据库查出钱后相加，再传回去
		String  moneys="select money from custumer where cid=?";
		ResultSet r;
		double s=0;
		try {
			r = this.db.query(moneys, cid);
			while(r.next()){
				s = r.getDouble("money");
			}
			 
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String sql="update custumer set money=? where cid=? ";
		try {
			double sum=s+money;
			int i = this.db.update(sql,sum,cid);
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
		}finally{
			this.db.closed();
		}
		return false;
	}
	//添加购物车 已测试
	@Override
	public boolean addShop(int foodid,int cid,int num) {
		//实例化dbutil对象
		this.db=new DBUtil();
		//创建sql语句
		String sql="insert into shop values(?,(select foodname from food where foodid=?),(select foodprice from food where foodid=?),?,0)";
		try {
			int i=this.db.update(sql,foodid,foodid,foodid,num);
			return i>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			this.db.closed();
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
		}finally{
			this.db.closed();
		}
		return false;
	}
	//查看购物车q  已测试
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
				list.add(new shop(rs.getInt("foodid"),rs.getNString("foodname"),rs.getDouble("foodprice"),rs.getInt("foodnum"),rs.getDouble("foodmoney")));
			}
			return list;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			this.db.closed();
		}
		return null;
	}
	//销量增加  可操作
	@Override
	public boolean addsales(int foodid,int foodnum) {

		this.db=new DBUtil();
		//创建sql语句
		String sql="update food set foodnum=? where foodid=?";
		String sql1="select * from food where foodid=?";
		int n=0;
		try {
			ResultSet as = this.db.query(sql1);
			int i1 = this.db.update(sql,foodid);
			int c=as.getInt("foodnum");
			n=c+foodnum;
			ResultSet rs = this.db.query(sql);
			int i = this.db.update(sql,n,foodid);
			
			return i>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			this.db.closed();
		}

		return false;
	}

	//客户查询  已测试
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
		}finally{
			this.db.closed();
		}
		return null;

	}
	
	
	//购物车金额添加
	@Override
	public double selectfoodnum(int foodid,int cid) {
		this.db=new DBUtil();
		//创建sql语句
		//String sql="select foodprice from food where foodid=?";
		String sql1="select foodprice,foodnum from shop where foodid=?";
		String sql2="select medisc from member where melevel=(select melevel from custumer where cid=?)";
		
		try {
			double d=0;
			double fp=0;
			double fn=0;
			double m=0;
			ResultSet rs=this.db.query(sql1,foodid);
			while(rs.next()){
				 fp=rs.getDouble("foodprice");
				fn=rs.getDouble("foodnum");
			}
			ResultSet q = this.db.query(sql2, cid);
			while(q.next()){
				 m=q.getDouble("medisc");
			}
			return d=fp*fn*m;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	//11.创建一个查询菜品数量的方法
	@Override
	public double selectfoodprice() {
		this.db=new DBUtil();
		//创建sql语句
		String sql="select foodmoney from shop ";
//		String sql1="update into orders set ordermoney=?";
		
		try {
			double s = 0;
			ResultSet rs=this.db.query(sql);
			int i=this.db.update(sql);
			while(rs.next()){
				double	c=rs.getDouble("foodmoney");
				s=s+c;
			}
			return s;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
		
	}

	//添加一个为订单表提供 eid cid orderid的方法
	@Override
	public boolean addorder(int cid, int eid, String orderid,double ordermoney) {
//		this.db=new DBUtil();
//		//创建sql语句
//		String sql="update into orders set orderid=?";
//		String sql1="update into orders set eid=?";
//		String sql2="update into orders set cid=?";
//		try {
//			ResultSet rs=this.db.query(sql,orderid);
//			int i=this.db.update(sql);
//			ResultSet as=this.db.query(sql1,eid);
//			int i1=this.db.update(sql1);
//			ResultSet cs=this.db.query(sql2,cid);
//			int i2=this.db.update(sql2);
//			return i>0;
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		this.db=new DBUtil();
		//创建sql语句
		String sql="insert into orders values(?,?,?,?)";
		//ResultSet rs;
		try {
//			rs=this.db.query(sql,orderid,ordermoney,eid,cid);
			int i=this.db.update(sql,orderid,ordermoney,eid,cid);
			return i>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	//查询订单的方法 可用
	@Override
	public List<order> selectorder() {
		this.db=new DBUtil();
		//创建sql语句
		String sql="select * from orders";
		try {
			ResultSet rs = this.db.query(sql);
			//创建一个list集合用于存储所有的课程
			List<order> list=new ArrayList<order>();
			while(rs.next()){
				list.add(new order(rs.getString("orderid"),rs.getInt("cid"),rs.getInt("eid"),rs.getDouble("ordermoney")));
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;	
	}
	//清空购物车  可用
	@Override
	public boolean dropshop() {
		this.db=new DBUtil();
		//创建sql语句
		String sql="truncate table shop";
		try {
			int i=this.db.update(sql);
			return i>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false ;
		
	}
	
	//修改单个价钱
	@Override
	public boolean updatefoodmoney(double foodmoney,int foodid) {
		 //实例化dbutil对象
		this.db=new DBUtil();
		//创建sql语句
		String  sql="update into shop set foodmoney=? where foodid";
		try {
			int i = this.db.update(sql,foodmoney,foodid);
			return i>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	//扣钱
	@Override
	public boolean disMoney(double a,int cid) {
		this.db=new DBUtil();
		//创建sql语句
		String sql="select * from customer";
		String sql1="update into custumer set money=? where cid";
		try {
			ResultSet rs = this.db.query(sql);
			double b=rs.getDouble("money");
			double c=b-a;
			int i = this.db.update(sql,c,cid);
			return i>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
   




}
