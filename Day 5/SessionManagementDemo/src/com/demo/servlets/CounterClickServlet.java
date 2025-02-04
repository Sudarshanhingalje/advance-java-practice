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

/**
 * Servlet implementation class CounterClickServlet
 */
@WebServlet("/countclicks")
public class CounterClickServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession();
		System.out.println("session id : "+session.getId());
		if(session.isNew()) {
			System.out.println("in new session");
			session.setAttribute("count ",1);
		}else {
		int count=(Integer) session.getAttribute("count");
		count++;
		session.setAttribute("count",count);
		
		}
		out.println("<h3>You clicked "+session.getAttribute("count")+"</h3>");
		RequestDispatcher rd=request.getRequestDispatcher("counter.html");
		rd.include(request,response);
		out.println("<a href='logout'>logout</a>");
	}

}
