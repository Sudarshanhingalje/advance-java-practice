package com.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
      static Connection conn;
      public static Connection getMyConnection() {
    	  if(conn==null) {
    		  try {
				DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
				String url="jdbc:mysql://localhost:3306/harry_potter?useSSL=false";
				conn=DriverManager.getConnection(url,"harry_potter","Sudu@1308");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		 
    	  }
    	  return conn;
      }
      
      public static void closeMyConnection() {
    	  try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      }
}
