<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="insertProduct" method="post">
 ProductId: <input type="text" name="pid" id="pid"><br>
 ProductName:<input type="text" name="pname" id="pname"><br>
 Qty:<input type="text" name="qty" id="qty"><br>
 Price:<input type="text" name="price" id="price"><br>
 <button type="submit" name="btn" id="btn">Add new Product</button>
</form>
</body>
</html>