<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" type="text/css" href="main.css">
</head>
	<body>
		<form:form action = "registration.obj" modelAttribute="customer">
			<table align = "center">
			
			<tr><td colspan = "2"><h1 align = "center">Customer Complaint Request Form</h1></td></tr>
				<tr><td colspan = "2"><hr></td></tr>
				<tr>
				<td>Account Id:*</td>
				<td>
					<form:input path = "accountId"/>
					<form:errors path = "accountId"/>
				</td>
			</tr>
			
			<tr>
				<td>Branch Code:*</td>
				<td>
					<form:input path = "branchCode"/>
					<form:errors path = "branchCode"/>
				</td>
			</tr>
			
			<tr>
				<td>Email Id:*</td>
				<td>
					<form:input path = "email"/>
					<form:errors path = "email"/>
				</td>
			</tr>
			
			<tr>
				<td>Complaint Category:*</td>
				<td>
					<form:select path = "category">
					<option value = "null"></option>
					<option value = "Internet Banking">Internet Banking</option>
					<option value = "General Banking">General Banking</option>
					<option value = "Others">Others</option>
					</form:select>
				</td>
			</tr>
			
			<tr>
				<td>Description:*</td>
				<td>
					<form:textarea rows = "5" cols = "25" path="description"/>
				</td>
			</tr>
			
			<tr>
				<td></td>
				<td>
					<input type = "submit" value = "submit"/>
				</td>
			</tr>
			
			</table>
		</form:form>
		
		<h2 align = "center"><u><a href = "status.obj">Check Status</a></u></h2>
	</body>
</html>