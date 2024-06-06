package com.vcube.LoginServlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.vcube.LoginDao.LoginDao;
import com.vcube.LoginModel.LoginModel;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("username");
		        String password = request.getParameter("password");
		        LoginModel l = new LoginModel(); 
		        l.setUserName(userName); 
		         l.setPassword(password);
		        LoginDao ld = new LoginDao(); 
		        String userValidate = ld.loginUser(l); 
		        if(userValidate.equals("SUCCESS")) {
		             request.setAttribute("userName", userName); 
		             request.getRequestDispatcher("/home.jsp").forward(request, response);
		         }

		         else
		         {
		             request.setAttribute("errMessage", userValidate); 
		             request.getRequestDispatcher("/login.jsp").forward(request, response);
		         }
		    }
		}
		