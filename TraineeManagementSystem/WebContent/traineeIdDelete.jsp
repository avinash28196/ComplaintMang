<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<style>
table{
	border: 1px solid black;
	width: 80%;
	height: 80%;
	padding: 25px;
	font-family:"Courier New", Courier, monospace; 
	font-size:120%'
}

input[type=text],select{
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    box-sizing: border-box;
}

input[type=submit]{
	background-color:  rgb(51,153,255);
    border: none;
    color: white;
    padding: 15px 32px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    margin: 4px 2px;
    cursor: pointer;
}

input[type=submit]:hover{	
	background-color:rgb(80,128,255);
}
</style>
</head>
<body>
<form action = "delete.obj">
<table align = "center">
	<tr>
		<td>Enter Id to be deleted:</td>
		<td>

			<select id="traineeId"  name = "traineeId" style="width: 200px;">
			<option><c:out value=""></c:out></option>
			<c:forEach items = "${idList}" var = "list">
				<option><c:out value="${list}"></c:out></option>
			</c:forEach>
					
			</select>
		</td>
		<td><input type = "submit" value = "submit"/></td>
	</tr>

</table>
</form>
</body>
</html>