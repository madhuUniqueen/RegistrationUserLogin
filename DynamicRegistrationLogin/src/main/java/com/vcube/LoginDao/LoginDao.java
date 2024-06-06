package com.vcube.LoginDao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import com.vcube.LoginModel.LoginModel;
import com.vcube.util.DBConnection;

public class LoginDao {
	 public String   loginUser(LoginModel l) {
	  String userName = l.getUserName(); 
	          String password = l.getPassword();
	          Connection con = null;
	          Statement statement = null;
	          ResultSet resultSet = null;
		          String userNameDB = "";
	              String passwordDB = "";
	 	          try
	          {
	              con = DBConnection.createConnection(); 
	              statement = con.createStatement(); 
	              resultSet = statement.executeQuery("select userName,password from users"); 
	              while(resultSet.next())
	                  {
	               userNameDB = resultSet.getString("userName"); 
	               passwordDB = resultSet.getString("password");
	                 if(userName.equals(userNameDB) && password.equals(passwordDB))
	            		{
	                   return "SUCCESS"; 
	                }
	              }
	          }
	              catch(Exception e)
	              {
	                 System.out.println(e);
	              }
	              return "Invalid user dentials"; 
}
}
