package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.service.UserService;
import com.demo.service.UserServiceImpl;

public class CheckAnswer extends HttpServlet{
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String uname=request.getParameter("uname");
		String answer=request.getParameter("ans1");
		String ans=request.getParameter("ans");
		String npass=request.getParameter("npass");
		String cpass=request.getParameter("cpass");
		if(answer.equals(ans)) {
			if(npass.equals(cpass)) { // this validation should be done in javascript
				UserService uservice=new UserServiceImpl();
				boolean status=uservice.changepassword(uname,npass);
				
				out.println("<h3>Registered new password pls login!");
			}else{
				out.println("<h3>you are not autherized to change the password pls login!");
			}
				
				
		}else {
				out.println("<h3>you are not autherized to change the password pls login!");
			}
			RequestDispatcher rd=request.getRequestDispatcher("Login.html");
			rd.include(request,response);
			
		
	}

}
