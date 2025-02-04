<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.demo.beans.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		List<Product> plist=(List<Product>)request.getAttribute("plist");
		
	%>
	Welcome <%=((MyUser)session.getAttribute("user")).getUname() %>
	<table border="2" >
		<tr>
			<th>ProductID</th>
			<th>ProductName</th>
			<th>Quantity</th>
			<th>Price</th>
			<th>Action</th>
		</tr>
		<% for(Product p:plist)
			{%>
				<tr>
					<td><%=p.getPid()%></td>
					<td><%=p.getPname()%></td>
					<td><%=p.getQty()%></td>
					<td><%=p.getPrice()%></td>
					<td>
						<a href="#">Delete</a>/
						<a href="editproduct?pid=<%=p.getPid()%>">Edit</a>
					</td>
				</tr>
			<% }%>
			
	</table>
	<a href="addproduct.jsp">Add New Product</a>
</body>
</html>