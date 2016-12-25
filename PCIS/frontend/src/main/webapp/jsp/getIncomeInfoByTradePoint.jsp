<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
	<tr>
	<th>id</th>
	<th>description</th>
	<th>address</th>
	<th>max income</th>
	<th>min income</th>
	<th>sum income</th>
	<th>avg income</th>
	</tr>
		<c:forEach var="listItem" items="${List}">
			<tr>
			<td>${listItem[0].id}</td>
			<td>${listItem[0].description}</td>
			<td>${listItem[0].address}</td>
			<td>${listItem[1]}</td>
			<td>${listItem[2]}</td>
			<td>${listItem[3]}</td>
			<td>${listItem[4]}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>