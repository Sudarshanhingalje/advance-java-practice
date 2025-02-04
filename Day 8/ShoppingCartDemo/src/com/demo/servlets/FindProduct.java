package com.demo.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.beans.Product;
import com.demo.service.ProdcatService;
import com.demo.service.ProdcatServiceImpl;


@WebServlet("/findproduct")
public class FindProduct extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProdcatService pservice=new ProdcatServiceImpl();
		int c=Integer.parseInt(request.getParameter("c"));
		List<Product> pList=pservice.findAllProduct(c);
		request.setAttribute("plist", pList);
		RequestDispatcher rd=request.getRequestDispatcher("findproduct.jsp");
		rd.forward(request, response);
	}

	


}
