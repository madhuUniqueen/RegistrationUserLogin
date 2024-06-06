package com.vcube.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	 public static Connection createConnection() {
	 Connection con = null;
	          try
	          {
	        	  Class.forName("com.mysql.jdbc.Driver");         	   
	        	  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vcube","root","root"); 
	          System.out.println(con);
	      }
	      catch (Exception e)
	      {
	        System.out.println(e);
	      }  
	      return con;
}
}
