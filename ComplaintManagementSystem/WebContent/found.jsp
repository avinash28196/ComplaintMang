<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="css/style.css" rel="stylesheet"/>
</head>
<body>

<center>
<br>
<h1>Complaint Status</h1>
<hr>
<table>
		<tr>
			<th>Complaint Id</th>
			<th>Description</th>
			<th>Status</th>
		</tr>
		<tr>
			<td><c:out value="${compl.complaintId}"></c:out></td>
			<td><c:out value="${compl.description}"></c:out></td>
			<td><c:out value="${compl.status}"></c:out></td>
		</tr>
</table>
</center>
</body>
</html>