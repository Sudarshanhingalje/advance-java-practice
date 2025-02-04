package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.demo.beans.Product;

/**
 * Servlet implementation class AddToCart
 */
@WebServlet("/addtocart")
public class AddToCart extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   		HttpSession session=request.getSession();
   		PrintWriter out=response.getWriter();
   		List<Product> cart=(List<Product>) session.getAttribute("cart");
   		if(cart==null && session.isNew()) {
   			 cart=new ArrayList<>();
   		}
   		String[] products=request.getParameterValues("prod");
   		String[] qty=new String[products.length];
   		for(int i=1;i<=products.length;i++) {
   			qty[i-1]=request.getParameter("p"+i);
   		}
   		Stream.of(products).forEach(System.out::println);
   		Stream.of(qty).forEach(System.out::println);
   		
   		out.println("test");
   		
   		
   		
		
	}

}
