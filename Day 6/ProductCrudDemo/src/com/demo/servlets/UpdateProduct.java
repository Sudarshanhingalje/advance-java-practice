package com.demo.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.beans.Product;
import com.demo.service.ProductService;
import com.demo.service.ProductServiceImpl;


@WebServlet("/updateProduct")
public class UpdateProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int pid=Integer.parseInt(request.getParameter("pid"));
		int qty=Integer.parseInt(request.getParameter("qty"));
		float price=Float.parseFloat(request.getParameter("price"));
	    String pname=request.getParameter("pname");
	    Product p=new Product(pid,pname,qty,price);
	    ProductService pService=new ProductServiceImpl();
	    int n=pService.updateProduct(p);
	    
	    RequestDispatcher rd =request.getRequestDispatcher("displayproduct");
	    rd.forward(request, response);
	    
	}

}
