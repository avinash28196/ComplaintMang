<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix = "c" %>
      
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" type="text/css" href="main.css"/>
</head>
<body>
<form action = "checkLogin.obj">
	<table align = "center">
	<tr><td colspan = "2"><h1 align = "center">LogIn Details</h1></td></tr>

		<tr>
			<td>User-name</td>
			<td><input type = "text" name = "username"/></td>
		</tr>
		
		<c:if test="${user!=null}">
			
			<tr>
				<td></td>
				
				<td>
					<font color="red" size = "2px">
						<b><i><c:out value="${user}"></c:out></i></b>
					</font>
				</td>
			</tr>
		</c:if>
		<tr>
			<td>Password</td>
			<td><input type = "password" name = "password" /></td>
		</tr>
		
		<c:if test="${pass!=null}">
			<tr>
				<td></td>
				
				<td>
					<font color="red" size = "2px">
						<b><i><c:out value="${pass}"></c:out></i></b>
					</font>
				</td>
			</tr>
		</c:if>
		
		<tr>
			<td></td>
			<td><input type = "submit" value = "LogIn"/></td>
		</tr>
		
		<tr>
			<td colspan = "2" align = "center">
				<font color = "red"><b><c:out value="${message}"></c:out></b></font>
			</td>
		</tr>
	</table>
	
	
	<!-- <a href = "trainee/choice.obj">Go Forward</a> -->
</form>
</body>
</html>