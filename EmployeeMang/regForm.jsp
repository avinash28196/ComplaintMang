<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="register.cus" modelAttribute="beanObj" commandName="beanObj" method="post">
<table border=5 bgcolor="yellow" align="center">
<tr><td>Name</td>
<td><form:input path="name"/>
<form:errors path="name" cssClass="error"></form:errors>
</td></tr>
<tr><td>Age</td><td><form:input path="age"/>
<form:errors path="age"></form:errors>
</td></tr>
<tr><td>Employee DOB</td><td><form:input path="dateOfBirth"/>
<form:errors path="dateOfBirth" cssClass="error"></form:errors>
</td></tr>
<tr><td>Desgination</td><td>
<form:radiobutton path="desgination" value="1"/>Occupation	
<form:radiobutton path="desgination" value="2"/>Working	
<form:radiobutton path="desgination" value="3"/>Student

</td></tr>



<tr><td>Course</td><td><form:select path="course">
   
   
  					<option value = "null"></option>
					<option value = "Java">Java</option>
					<option value = "Dot Net">Dot Net </option>
					<option value = "C#">C#</option>
</form:select></td></tr>

<tr><td><input type="submit" value="submit"></td></tr>
</table>
</form:form>
</body>
</html>
