package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebInitParam;
import static java.lang.Math.round;

@WebServlet(urlPatterns="/converter",
initParams= {@WebInitParam(name="dollar",value="85"),
			@WebInitParam(name="pound",value="90"),
			@WebInitParam(name="euro",value="80")}
)
public class ConverterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private float drate,prate,erate;
	
	public void init(ServletConfig config) {
		drate = Float.parseFloat(config.getInitParameter("dollar"));
		prate = Float.parseFloat(config.getInitParameter("pound"));
		erate = Float.parseFloat(config.getInitParameter("euro"));
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out= response.getWriter();
		response.setContentType("text/html");
		double amount = Double.parseDouble(request.getParameter("amount"));
		String currency = request.getParameter("cur");
		double amt = 0;
		float rate = 0;
		switch(currency) {
			case "dollar":
				amt = amount/drate;
				rate = drate;
				break;
			case "pound":
				amt = amount/prate;
				rate = prate;
				
				break;
			case "euro" :
				amt = amount/erate;
				rate = erate;
				break;
		}
		out.println("Amount in Rs: "+ amount + " Rs.");
		out.println(currency+ " Rate: "+ rate);
		out.println("Converted Amount: "+Math.round(amt));
		out.println("<a href='Currency.html'>Calculate More Click Here</a>");
	}

	
	
	
	
	
	
	
	
}
