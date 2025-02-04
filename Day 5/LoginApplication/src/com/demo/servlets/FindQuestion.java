package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.beans.RegisterUser;
import com.demo.service.UserService;
import com.demo.service.UserServiceImpl;

public class FindQuestion extends HttpServlet 
{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String name=request.getParameter("uname");
		UserService uservice=new UserServiceImpl();
		RegisterUser r=uservice.findQuestion(name);
		out.println("<form action='checkanswer' method='post'>");
		out.println("Question : <input type='text' name='q' id='q' value='"+r.getQuestion()+"'>");
		out.println("<input type='hidden' name='uname' id='uname' value='"+r.getUsername()+"'>");
		out.println("<input type='hidden' name='ans1' id='ans1' value='"+r.getAnswer()+"'>");
		out.println("Answer : <input type='text' name='ans' id='ans'>");
		out.println("New password : <input type='password' name='npass' id='npass'>");
		out.println("Confirm Password : <input type='password' name='cpass' id='cpass'>");
		out.println("<button type='submit' name='btn' id='btn' >Change Password</button>");
		
		out.println("</form>");
	}
}
