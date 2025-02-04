package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/cookiedemo")
public class CookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		String nm=request.getParameter("nm");
		String action=request.getParameter("btn");
		//transfer control to cookiedata.html and it comes back
		RequestDispatcher rd=request.getRequestDispatcher("cookiedata.html");
		switch(action) {
		case "add":
			String val=request.getParameter("val");
			Cookie c=new Cookie(nm,val);
			//to save the cookie on client machine
			response.addCookie(c);
			out.println("<h3>Cookie Added</h3>");
			
			rd.include(request,response);
			
			break;
		case "del":
			Cookie[] carr=request.getCookies();
			for(Cookie c1:carr) {
				if(c1.getName().equals(nm)) {
					//set the age to 0 for deletion
					c1.setMaxAge(0);
					response.addCookie(c1);
					break;
				}
			}
			out.println("<h3>Cookie deleted</h3>");
			rd.include(request,response);
			break;
		case "show":
			carr=request.getCookies();
			for(Cookie c1:carr) {
				out.println(c1.getName()+"-------"+c1.getValue()+"<br>");
			}
			rd.include(request,response);
			break;
		}
		
	}

}
