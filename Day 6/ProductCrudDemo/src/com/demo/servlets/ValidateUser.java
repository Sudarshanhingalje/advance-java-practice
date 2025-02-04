package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.demo.beans.MyUser;
import com.demo.service.UserService;
import com.demo.service.UserServiceImpl;


@WebServlet("/validate")
public class ValidateUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		String uname=request.getParameter("uname");
		String pass=request.getParameter("pass");
		UserService uservice=new UserServiceImpl();
		MyUser u=uservice.validateUser(uname,pass);
		System.out.println(u);
		if(u!=null)
		{
			HttpSession session=request.getSession();
			session.setAttribute("user", u);
			RequestDispatcher rd=request.getRequestDispatcher("displayproduct");
			rd.forward(request, response);
		}
		else {
			out.println("credential are wrong...please reenter");
			RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");
			rd.include(request, response);
		}
	}

}
