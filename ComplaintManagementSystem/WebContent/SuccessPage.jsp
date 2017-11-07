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
<hr>
	<h1>Record Found</h1>
		<h2>Complaint Id for this request is</h2>
		
			<c:out value="${complaint.complaintId}"></c:out>
		<h2>Thanks for raising a complaint</h2>
			<a href="index.cj">Go Home</a>
</center>
</body>
</html>