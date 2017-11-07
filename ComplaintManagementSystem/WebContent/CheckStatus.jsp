<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
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
<h1>Check Status of Complaint</h1>
<form action="findById.cj" method="post">
<table>
		<tr><td>Complaint ID:*</td>
			<td>
				<input type="text" name="complaintId"/>
			</td>
		</tr>
		<tr>
			<td align="center" colspan="2"><input type="submit" value="Check Status"></td>
		</tr>
</table>			
</form>
</center>
</body>
</html>