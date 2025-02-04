package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Product;

public class ProductDaoImpl implements ProductDao
{
	static Connection conn;
	static PreparedStatement pselect,pinsert,pselectById,pupdate;
	static
	{
		conn=DBUtil.getMyConnection();
		try {
			pselect=conn.prepareStatement("select * from product");
			pinsert=conn.prepareStatement("insert into product values(?,?,?,?)");
			pselectById=conn.prepareStatement("select * from product where pid=?");
			pupdate=conn.prepareStatement("update product set pname=?,qty=?,price=? where pid=?");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Override
	public List<Product> findAll() 
	{
		try {
			ResultSet rs=pselect.executeQuery();
			List<Product> pList=new ArrayList<Product>();
			while(rs.next())
			{
				Product p=new Product(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getFloat(4));
				pList.add(p);
			}
			return pList;
		} catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		return null;
	}
	@Override
	public int save(Product p) {
		try {
			pinsert.setInt(1, p.getPid());
			pinsert.setString(2, p.getPname());
			pinsert.setInt(3, p.getQty());
			pinsert.setFloat(4, p.getPrice());
			
			return pinsert.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 0;
	}
	@Override
	public Product findById(int pid) {
		try {
			pselectById.setInt(1, pid);
			ResultSet rs=pselectById.executeQuery();
			if(rs.next()) {
				Product product=new Product(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getFloat(4));
				return product;
						
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public int modifyProduct(Product p) {
		try {
			pupdate.setInt(4, p.getPid());
			pupdate.setString(1, p.getPname());
			pupdate.setInt(2, p.getQty());
			pupdate.setFloat(3, p.getPrice());
			return pupdate.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return 0;
	}
}
