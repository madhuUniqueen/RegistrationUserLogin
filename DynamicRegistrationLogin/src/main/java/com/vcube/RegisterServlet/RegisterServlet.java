package com.vcube.RegisterServlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.vcube.RegisterDao.RegisterDao;
import com.vcube.RegisterModel.Student;

/**
 * Servlet implementation class RegisterServlet
 */
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fullName = request.getParameter("fullname");
		         String email = request.getParameter("email");
		         String userName = request.getParameter("username");
		         String password = request.getParameter("password");
		         Student s= new Student();
		         s.setFullName(fullName);
		s.setEmail(email);
		s.setUserName(userName);
		s.setPassword(password);
		         RegisterDao d = new RegisterDao();
		         String status = d.registerUser(s);
		         if(status.equals("SUCCESS"))   
		         {
		            request.getRequestDispatcher("/login.jsp").forward(request, response);
		         }
		         else   
		         {
		            request.setAttribute("errMessage", status);
		            request.getRequestDispatcher("/index.jsp").forward(request, response);
		         }
		     }
	}

