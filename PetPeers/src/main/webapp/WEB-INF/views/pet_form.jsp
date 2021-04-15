  <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pet Form</title>
<style type="text/css">
a {
	margin: 15px 5px 0px 10px;
	float: right;
}

h1{
	margin: 25px 0px 15px 15px;
}

.addPet{
	color : white;
	background-color : black;
	padding : 5px 5px 5px 5px;
}

.error {
	color: red
}
</style>
</head>
<body>
	<!-- <form action="../pets" method="post">
	<form action="../pets/validatePet" method="get">
		<a href="../user/logout">Logout</a> 
		<a class="addPet">Add Pet</a> 
		<a href="../pets">Home</a>
		<br>
		<br>
		<h3>Pet Peers</h3>
		<div>
			<label>Name : </label>
			<input type="text" name="name">
		</div>
		<div>
			<label>Age : </label>
			<input type="number" name="age">
		</div>
		<div>
			<label>Place : </label>
			<input type="text" name="place">
		</div>
		<input type="submit" value="Save">
		<input type="reset" value="Cancel">
	</form> -->
	
	<form:form action="../pets/addpet" method="post" modelAttribute="pet">
		<a href="../user/logout">Logout</a> 
		<a class="addPet">Add Pet</a> 
		<a href="../pets">Home</a>
		<br>
		<br>
		<h3>Pet Peers</h3>
		<div>
			<label>User Name : </label>&nbsp;
			<form:input path="name"/>
			<form:errors path="name" cssClass="error"></form:errors>
	  	</div>
	  	<br>
		<div> 
			<label>Age : </label>&nbsp;
			<form:input type="number" path="age"/>
			<form:errors path="age" cssClass="error"></form:errors>
		</div>
		<br>
	    <div>
			<label>Place : </label>
			<form:input path="place"/>
			<form:errors path="place" cssClass="error"></form:errors>
		</div>
		<br>
		<input type="submit" value="Save">
		<input type="reset" value="Cancel">
	</form:form>
	
</body>
</html>