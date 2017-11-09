<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
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
<h1>Delete Successful</h1>
<u style='font-family:"Courier New", Courier, monospace; font-size:120%'>Trainee with traineeID = <c:out value = "${traineeId}"></c:out> is deleted.</u>
<h2><u><a href = "choice.obj">Go Back to Home</a></u></h2>
</body>
</html>