package com.vcube.RegisterDao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.vcube.RegisterModel.Student;
import com.vcube.util.DBConnection;

public class RegisterDao {
	 public String registerUser(Student s)
	      {
	          String fullName = s.getFullName();
	          String email = s.getEmail();
	          String userName = s.getUserName();
	          String password = s.getPassword();	 
	          Connection con = null;
	          PreparedStatement preparedStatement = null;        
	          try
	          {
	              con = DBConnection.createConnection();
	              String query = "insert into users(fullName,Email,userName,password) values (?,?,?,?)"; 
	              preparedStatement = con.prepareStatement(query); 
	              preparedStatement.setString(1, fullName);
	              preparedStatement.setString(2, email);
	              preparedStatement.setString(3, userName);
	              preparedStatement.setString(4, password);
	              int i= preparedStatement.executeUpdate();
	              if (i!=0)  
	              return "SUCCESS";
	          }
	          catch(Exception e)
	          {
	             System.out.println(e);
	          }      
	          return "Oops.. Something went wrong there..!";  
}
}
