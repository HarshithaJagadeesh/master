<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.error {
	color: red;
}
</style>
</head>
<body>
<form:form action="./authenticate" method="get" modelAttribute="loginUser">
	Enter Username	 <form:input path="userName"/>
				     <form:errors path="userName" cssClass="error"></form:errors>
	Enter Password 	 <form:password path="userPassword"/>
					 <form:errors path="userPassword" cssClass="error"></form:errors>
					 
					 <input type="submit" value="login">
	

</form:form>
</body>
</html>