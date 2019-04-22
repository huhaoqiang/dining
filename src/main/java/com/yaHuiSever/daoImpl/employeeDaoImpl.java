package com.yaHuiSever.daoImpl;




import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.yaHuiSever.dao.employeeDao;
import com.yaHuiSever.domain.custumer;
import com.yaHuiSever.domain.empolyee;
import com.yaHuiSever.domain.food;
import com.yaHuiSever.until.DBUtil;

public class employeeDaoImpl implements employeeDao{
	//创建dbutil变量
	   private DBUtil db;
	   //员工登录
	    @Override
	public empolyee loginEmployee(int eid,String epasswd) {
	    	//实例化dbutil对象
			this.db=new DBUtil();
			//创建sql语句
			String sql="select * from employee where eid=? and epassed=?";
			try {
				ResultSet rs = this.db.query(sql);
				while(rs.next()){
				 return	new empolyee(rs.getInt("eid"), rs.getString("ename"));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}
   //添加顾客
	@Override
	public boolean addCustumer(custumer c) {
		//实例化dbutil对象
				this.db=new DBUtil();
				//创建sql语句
				String sql="insert into customer values(?,?,?,?,?,?)";
				try {
					int i=this.db.update(sql, c.getCid(),c.getCname(),c.getCpasswd(),c.getMelevel(),c.getCfrezz(),c.getMoney());
					return i>0;
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		return false;
	}
      //客户充值
	@Override
	public boolean updateMoney() {
		//实例化dbutil对象
		this.db=new DBUtil();
		//创建sql语句
		String sql="update ";
		return false;
	}
     //客户挂失
	@Override
	public boolean addLoss() {
		// TODO Auto-generated method stub
		return false;
	}
    //添加购物车
	@Override
	public boolean addShop() {
		// TODO Auto-generated method stub
		return false;
	}
    //删除购物车
	@Override
	public boolean deleteShop(int id) {
		//实例化dbutil对象
				this.db=new DBUtil();
				//创建sql语句
				String sql="delete  from shop where clid="+id;
				try {
					int i = this.db.update(sql);
					return i>0;
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		return false;
	}
    //查看购物车
	@Override
	public List<food> selectByEid() {
//		//实例化dbutil对象
//				this.db=new DBUtil();
//				//创建sql语句
//				String sql="select * from shop";
//				try {
//					ResultSet rs = this.db.query(sql);
//					//创建一个list集合用于存储所有的课程
//					List<custumer> list=new ArrayList<custumer>();
//					while(rs.next()){
//						list.add(new custumer(rs.getInt("cid"), rs.getInt("foodid"), rs.getString(arg0), 0, 0, 0, sql, 0));
//					}
//					return list;
//				} catch (SQLException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
		return null;
	}



	

}
