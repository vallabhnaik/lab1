<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="style.css" type="text/css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>ToDo list</title>
</head>
<body>
<br><br>
<table border="1">
<c:forEach items="${entries}" var="entry">
  <tr>
  <c:choose>
  <c:when test="${entry.operation.equals('yes')}">
    <td>${entry.name}</td>
    <td>${entry.date}</td>
    <c:choose>
    <c:when test="${entry.operation.equals('yes')}">
    <td><center><a href='tododelete?id=${entry.getId()}'><span class="glyphicon glyphicon-minus-sign" style="color:red"></span></a></center></td>
    </c:when>
    <c:otherwise>
    <td></td>
    </c:otherwise>
    </c:choose>
 
  </c:when>
  <c:otherwise>
     <td style="text-decoration: line-through;">${entry.name}</td>
    <td style="text-decoration: line-through;">${entry.date}</td>
    <c:choose>
    <c:when test="${entry.operation.equals('yes')}">
    <td style="text-decoration: line-through;"><center><a href='tododelete?id=${entry.getId()}'><span class="glyphicon glyphicon-minus-sign" style="color:red"></span></a></center></td>
    </c:when>
    <c:otherwise>
    <td></td>
    </c:otherwise>
    </c:choose>
 
  </c:otherwise>
  </c:choose>
    
  </tr>
</c:forEach>
<tr>
<td><form action="todoadd" method="get"><input type="text" name="listname">
<input type="submit" value="Add"></form></td></tr>
</table>
</body>
</html>