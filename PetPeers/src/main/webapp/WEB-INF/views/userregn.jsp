<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Registration Page</title>

<link href="../resources/css/userregn.css" rel="stylesheet" type="text/css">
</head>
<body>
	<form:form action="./add" method="post" modelAttribute="user">
		<a href="logout">Home</a>
		<a href="logout">Login</a>
		<a class="registration">User Registration</a>
		<br>
		<br>
		<h1>Pet Peers</h1>
		<div>
			<label>User Name : </label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<form:input path="username"/>
			<form:errors path="username" cssClass="error"></form:errors>
	  	</div>
	  	<br>
		<div> 
			<label>Password : </label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<form:input path="userPassword" type="password"/>
			<form:errors path="userPassword" cssClass="error"></form:errors>
		</div>
		<br>
	    <div>
			<label>Confirm Password : </label>
			<form:input path="confirmPassword" type="password" />
			<form:errors path="confirmPassword" cssClass="error"></form:errors>
		</div>
		<br>
		<input type="submit" value="Submit">
		<input type="reset" value="Reset">
	</form:form>
</body>
</html>
