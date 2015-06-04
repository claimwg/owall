<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Board Page</title>
</head>
<body>
${message}
<table>
	<tr>
	<th>이름</th>
	<th>나이</th>
	</tr>
	<c:forEach var="listVar" items="${userList}">
	<tr>
	<td>${listVar.name}</td>
	<td>${listVar.age}</td>
	</tr>
	</c:forEach>
</table>
</body>
</html>