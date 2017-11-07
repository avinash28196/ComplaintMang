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
<h1>Customer Complaint Request Form</h1>
<br>
<hr>
<form:form action="submit.cj" method="post" modelAttribute="complaint">
	<table>
		<tr>
			<td>Account Id:*</td>
			<td><form:input type="number" path="accountId"/>
				<form:errors path="accountId"/>
			</td>
	</tr>
	<tr>
			<td>Branch Code:*</td>
			<td><form:input path="branchCode"/>
				<form:errors path="branchCode"/>
			</td>
	</tr>
	<tr>
			<td>Email Id:*</td>
			<td><form:input type="text" path="emailId"/>
				<form:errors path="emailId"/>
			</td>
	</tr>
	<tr>
			<td>Complaint category:*</td>
			<td><form:select path="category">
					<option value="null">--SELECT--</option>
					<option value="Internet Banking">Internet Banking</option>
					<option value="General Banking">General Banking</option>
					<option value="Others">Others</option>
					
					
				</form:select>
				<%-- <form:errors path="category"/> --%>
			</td>
	</tr>
	<tr>
			<td>Description:*</td>
			<td><form:textarea path="description"/>
				<form:errors path="description"/>
			</td>
	</tr>
	<tr>
			<td  colspan="2"  align="center"><input type="submit" value="Submit" ></td>
	</tr>
	</table>
</form:form>
<a href="checkStatus.cj">Check Status</a>
</center>
</body>
</html>