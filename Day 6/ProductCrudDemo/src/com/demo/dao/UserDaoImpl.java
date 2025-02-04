package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.demo.beans.MyUser;

public class UserDaoImpl implements UserDao
{
	static Connection conn;
	static PreparedStatement pvalidate;
	static {
		conn=DBUtil.getMyConnection();
		try {
			pvalidate=conn.prepareStatement("select uname,password,role from user where uname=? and password=?");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	@Override
	public MyUser authenticateUser(String uname, String pass) {
		try {
			pvalidate.setString(1, uname);
			pvalidate.setString(2, pass);
			ResultSet rs=pvalidate.executeQuery();
			if(rs.next())
			{
				MyUser user=new MyUser(rs.getString(1),rs.getString(2),rs.getString(3));
				return user;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
