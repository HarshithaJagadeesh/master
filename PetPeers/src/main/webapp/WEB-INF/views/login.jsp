<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
<link href="../resources/css/login.css" rel="stylesheet"
	type="text/css">
</head>

<body>

	<form:form action="authenticate" method="post"
		modelAttribute="loginUser">
		<a href="logout">Home</a>
		<a class="login">Login</a>
		<h3>Pet Peers</h3>

		<table>
			<tr>
				<td bgcolor="#D3D3D3">Sign in</td>
			</tr>

			<tr>
				<td rowspan="3"><br>
					<div>
						<label>User Name : </label>
						<form:input path="username" />
						<form:errors path="username" cssClass="error"></form:errors>
					</div> <br>

					<div>
						<label>Password : </label>&nbsp;&nbsp;
						<form:input path="userPassword" type="password" />
						<form:errors path="userPassword" cssClass="error"></form:errors>
					</div> <br> <input type="submit" value="Submit"> <input type="reset" value="Reset"> <br></td>
			</tr>

</table>

		<br><a href="registration" class="regClick">If not a member yet?,register here</a>

	</form:form>

</body>
</html>
