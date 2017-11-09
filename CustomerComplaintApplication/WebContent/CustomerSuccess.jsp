<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
      <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h4 align = "center">
	<u style='font-family:"Courier New", Courier, monospace; font-size:120%'>
		Complaint Id for the request is <c:out value="${k.complaintId}"></c:out>
			<br/><br/>
		Thanks for raising a complaint.
	</u>
</h4>

<h2 align = "center">
	<a href = "status.obj">Check Status</a>
		&nbsp;&nbsp;&nbsp;&nbsp;
	<a href = "index.obj">Raise Complaint</a>	
</h2>
</body>
</html>