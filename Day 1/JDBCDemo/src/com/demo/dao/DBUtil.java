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
				String url="jdbc:mysql://192.168.10.150:3306/dac89";
				conn=DriverManager.getConnection(url,"dac89","welcome");
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
