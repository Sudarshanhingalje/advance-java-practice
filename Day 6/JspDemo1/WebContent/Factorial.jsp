<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="myheader.html" %>
<form action="calcfactorial.jsp">
   Number 1: <input type="text" name="num1" id="n1">
   <button type="submit" name="fact" id="fact">Factorial</button>
</form>
<%@include file="myfooter.html" %>
</body>
</html>