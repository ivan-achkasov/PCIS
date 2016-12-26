<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>All info</title>
<style>
td {
	padding: 5px; /* Поля в ячейках */
	vertical-align: top; /* Выравнивание по верхнему краю ячеек */
}
</style>
</head>
<body>
	<table border="1">
		<tr>
			<th>id</th>
			<th>description</th>
			<th>address</th>
			<th>year</th>
			<th>month</th>
			<th>value</th>
		</tr>
		<c:forEach var="listItem" items="${List}">
			<tr bgcolor="#A9A9A9">
				<td>${listItem.id}</td>
				<td>${listItem.description}</td>
				<td>${listItem.address}</td>
				<td/><td/><td/>
			</tr>
			<c:forEach var="income" items="${listItem.incomes}">
				<tr>
				<td/><td/><td/>
					<td>${income.year}</td>
					<td>${income.month}</td>
					<td>${income.value}</td>
				</tr>
			</c:forEach>
		</c:forEach>
	</table>
</body>
</html>