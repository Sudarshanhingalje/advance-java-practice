<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
	<%@taglib prefix="mytag" uri="/mycustomtags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
  //int num1=Integer.parseInt(request.getParameter("num1"));
 // int num2=Integer.parseInt(request.getParameter("num1"));
  int num1=10;
  int num2=20;
%>
<h1>Welcome to custom tags</h1>
<mytag:calculatetag num1="<%=num1%>" num2="<%=num2%>"></mytag:calculatetag>
<br>
<br>
<mytag:hello fname="Rajan" lname="Khadilkar"></mytag:hello>

</body>
</html>