<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
.error {
	color: red;
}
</style>
</head>
<body>

<form:form action="./add" method="get" modelAttribute="user">

	Enter Username   &nbsp;&nbsp;&nbsp;&nbsp;<form:input path="userName"/>
				     <form:errors path="userName" cssClass="error"></form:errors><br><br>
	Enter Password   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<form:password path="userPassword"/>
					 <form:errors path="userPassword" cssClass="error"></form:errors><br><br>
	Confirm Password <form:password path="confirmPassword"/>
					 <form:errors path="confirmPassword" cssClass="error"></form:errors><br><br>
					 
					<input type="submit" style="width: 150px; height:50px;" value="register">

</form:form>
</body>
</html>

<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
    <%@ taglib prefix="form"  uri="http://www.springframework.org/tags/form" %>
   
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Registration Page</title>
<style type="text/css">
a{
    margin: 15px 5px 0px 10px;
    float: right;
}
h1 {
    color: red;
    font-size: 15px;
    margin: 25px 0px 15px 15px;
}
a:active{
    color : red;
    background-color : yellow;
}
label{
    margin     : 50px;
}
    .error{
        color : red
    }
</style>
</head>
<body>
    <form:form action="./add" method="post" modelAttribute="user">
        <a href="logout">Home</a> <a href="logout">Login</a><a href="firstPage">User Registration</a>
        <br>
        <br>
        <h1>Pet Peers</h1>
        <div>
            <label>User Name : </label>
            <form:input path="userName"/>
            <form:errors path="userName" cssClass="error"></form:errors>
        </div>
        <div>
            <label>Password : </label>
            <form:input path="userPassword" type="password" />
            <form:errors path="userPassword" cssClass="error"></form:errors>
        </div>
        <div>
            <label>Confirm Password : </label>
            <form:input path="confirmPassword" type="password"/>
            <form:errors path="confirmPassword" cssClass="error"></form:errors>
        </div>
        <input type="submit" value="Submit">
        <input type="reset" value="Reset">
    </form:form>
</body> --%>