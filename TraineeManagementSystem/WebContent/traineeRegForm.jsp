<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c" %>
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

a:hover {
    font-size: 1.1em;
}
</style>
</head>
<body>
	<form:form action = "reg.obj" modelAttribute="trainee">
			<table align = "center">
			
			<tr><td colspan = "2"><h1 align = "center">Registration Form</h1></td></tr>
				<tr>
				<td>Trainee Id:</td>
				<td>
					<form:input path = "traineeId"/>
					<form:errors path = "traineeId"/>
				</td>
			</tr>
			
			<c:if test="${id!=null}">
				<tr>
					<td></td>
					<td>
						<b><i><font color = "red" size = "2px"><c:out value = "${id}"></c:out></font></i></b>
					</td>
				</tr>
			</c:if>
			
			
			<tr>
				<td>Trainee Name:</td>
				<td>
					<form:input path = "traineeName"/>
					<b><i><font color = "red"><form:errors path = "traineeName"/></font></i></b>
				</td>
			</tr>
			
			<tr>
				<td>Trainee City:</td>
				<td>
					<form:radiobutton path="traineeCity" value="Chennai"/>Chennai
					<form:radiobutton path="traineeCity" value="Mumbai"/>Mumbai
					<form:radiobutton path="traineeCity" value="Delhi"/>Delhi
					<form:radiobutton path="traineeCity" value="Kolkata"/>Kolkata
				</td>
			</tr>
			
			<tr>
				<td>Trainee Domain:</td>
				<td>
					<form:select path = "traineeDomain">
					
						<option value = "null"></option>
						<option value = "Java">Java</option>
						<option value = "C#">C#</option>
						<option value = "Python">Python</option>
						<option value = "Perl">Perl</option>
						<option value = "Ruby">Ruby</option>
						<option value = "Scala">Scala</option>
						<option value = "Kotlin">Kotlin</option>
						<option value = "Swift">Swift</option>
	
					</form:select>
					<form:errors path = "traineeDomain"/>
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
</body>
</html>