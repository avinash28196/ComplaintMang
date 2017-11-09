<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" type="text/css" href="main.css">
</head>
<body>

<form action = "getStatus.obj">
	<table align = "center">
		<tr>
			<td>Complaint Id:</td>
		
			<td>
				<input type = "text" name = "complaintId"></input>
			</td>
		</tr>
		<tr>
			<td></td>	
			<td>
				<input type = "submit" value = "check status"/>
			</td>
		</tr>
		
		
		<tr>
		<th>COMPLAINT ID</th>
		<th>DESCRIPTION</th>
		<th>STATUS</th>
		</tr>
			<tr align = "center">
				<td>${customer.complaintId}</td>
				<td>${customer.description}</td>
				<td>${customer.status}</td>
			</tr>
	</table>
</form>

	<h2 align = "center"><a href = "index.obj">Raise Complaint</a></h2>
</body>
</html>