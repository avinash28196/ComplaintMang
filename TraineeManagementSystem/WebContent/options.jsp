<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core"  prefix = "c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<style>
a:hover {
    font-size: 1.1em;
}
</style>
</head>
<body>

<c:if test="${sessionScope.loginDetails != null}">

<h4 align = "right"><a href="logout.obj">LogOut</a></h4>

<br/>

<h1>Trainee Management System</h1>
	<table border = "1">
		<tr><td><h4>Pick your operation</h4></td></tr>
		<tr><td><h4><a href = "add.obj">Add a Trainee</a></h4></td></tr>
		<tr><td><h4><a href = "goDelete.obj">Delete a Trainee</a></h4></td></tr>
		<!-- <tr><td><h4><a href = "goUpdate.obj">Modify a Trainee</a></h4></td></tr>
		<tr><td><h4><a href = "goFind.obj">Retrieve a Trainee Details</a></h4></td></tr>-->
		<tr><td><h4><a href = "goFindAll.obj">Retrieve all Trainee Details</a></h4></td></tr> 
	</table>


<%-- 
<c:out value="${sessionScope.valid}"></c:out>

<br/>

<c:out value="${sessionScope.loginDetails}"></c:out>
 --%>
 
</c:if>

	<c:if test="${sessionScope.loginDetails == null}">
		
		<c:out value="${sessionScope.valid}"></c:out>
	
		Session is Logged Out
	
	</c:if>	


</body>
</html>