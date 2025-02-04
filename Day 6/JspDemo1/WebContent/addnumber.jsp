<%@page import="java.time.LocalDate"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="myheader.html" %>
   <% 
      LocalDate ld=LocalDate.now();
      int a=Integer.parseInt(request.getParameter("num1"));
      int b=Integer.parseInt(request.getParameter("num2"));
      int addition=a+b;
      out.println("<h3>Addition : "+addition+"</h3>");
   %>
   <h3>Addition : <%=addition %></h3>
</body>
</html>