<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
	<table align = "center">
			<tr><td colspan = "2"><h1>Trainee Information.</h1></td></tr>
			
			<tr><td>Trainee Id:</td><td>${k.traineeId}</td></tr>
			<tr><td>Trainee Name:</td><td>${k.traineeName}</td></tr>
			<tr><td>Trainee City:</td><td>${k.traineeCity}</td></tr>
			<tr><td>Trainee Domain:</td><td>${k.traineeDomain}</td></tr>
			
	</table>
	
	<h2 align = "center">
	<u><a href = "goFindAll.obj">Show Table</a></u>
	&nbsp;&nbsp;&nbsp;&nbsp;
	<u><a href = "choice.obj">Go Back to Home</a></u>
	</h2>
</body>
</html>