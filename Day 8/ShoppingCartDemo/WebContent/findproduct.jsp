<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="addtocart" method="post">
<table>
<%int i=1; %>

 <c:forEach var="p" items="${plist}">
    <tr>
    <td>
      <input type="checkbox" name="prod" id="p" value="${p.pid}:${p.pname}:${p.price}">
    </td>
    <td>
       <label>${p.pname}</label>
    </td>
    <td>
       <input type="text" name='<%="p"+i%>' id='<%="p"+i%>'>
    </td>
    </tr>
    <%i++; %>
 </c:forEach>
 </table>
 <button type="submit" name="btn" id="add" value="add">Add to cart</button>
 <button type="submit" name="btn" id="sel" value="sel">select different catagory</button>
 </form>
 
</body>
</html>