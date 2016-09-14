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
    <td>${entry.name}</td>
    <td>${entry.date}</td>
    <td><center><a href='tododelete?id=${entry.getId()}'><span class="glyphicon glyphicon-minus-sign" style="color:red"></span></a></center></td>   
  </tr>
</c:forEach>
<tr>
<td><form action="todoadd" method="get"><input type="text" name="listname">
<input type="submit" value="Add"></form></td></tr>
</table>

<br><br>

<table border="1">
<c:forEach items="${deletedItems}" var="list">
  <tr>
    <td>${list.name}</td>
    <td>${list.date}</td>
    <td>${list.removeDate}</td>
  </tr>
</c:forEach>
</table>
</body>
</html>