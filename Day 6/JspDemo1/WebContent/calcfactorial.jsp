<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="myheader.html" %>
<%!
      public int factorial(int n){
			int f=1;
			for(int i=1;i<=n;i++){
				f=f*i;
			}
			return f;
	}
%>
   <% int n1=Integer.parseInt(request.getParameter("num1"));
      int ans=factorial(n1);
   %>
   
   Answer: <%=ans %>
   <%@include file="myfooter.html" %>
</body>
</html>