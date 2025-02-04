<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.demo.beans.Product"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%Product p=(Product)request.getAttribute("product"); %>
 <form action="updateProduct" method="post">
 ProductId: <input type="text" name="pid" id="pid" value="<%=p.getPid()%>" readonly><br>
 ProductName:<input type="text" name="pname" id="pname" value="<%=p.getPname()%>"><br>
 Qty:<input type="text" name="qty" id="qty" value="<%=p.getQty()%>"><br>
 Price:<input type="text" name="price" id="price" value="<%=p.getPrice()%>"><br>
 <button type="submit" name="btn" id="btn">Update Product</button>
</form>
</body>
</html>