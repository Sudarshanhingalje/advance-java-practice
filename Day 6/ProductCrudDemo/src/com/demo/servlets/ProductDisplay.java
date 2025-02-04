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
import com.demo.service.ProductService;
import com.demo.service.ProductServiceImpl;


@WebServlet("/displayproduct")
public class ProductDisplay extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProductService pservice=new ProductServiceImpl();
		List<Product> pList=pservice.getAllProducts();
		request.setAttribute("plist", pList);
		System.out.println(pList);
		RequestDispatcher rd=request.getRequestDispatcher("displayproduct.jsp");
		rd.forward(request, response);
	}

}
