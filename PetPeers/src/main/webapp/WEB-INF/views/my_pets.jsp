 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>My Pets</title>
<style type="text/css">
a {
	margin: 15px 5px 0px 10px;
	float: right;
}

h3 {
	margin: 25px 0px 15px 15px;
}

.myPets{
	color : white;
	background-color : black;
	padding : 5px 5px 5px 5px;
}
</style>
</head>
<body>
	<form action="/pets/petDetail">
		<a href="../user/logout">LogOut</a>
		<a class="myPets">MyPets</a>
		<a href="../pets/petDetail">AddPet</a>
		<a href="../pets">Home</a><br>
		<h3>Pet Peers</h3>
		<table>
			<tr>
				<th>#</th>
				<th>Pet Name</th>
				<th>Place</th>
				<th>Age</th>
			</tr>
		</table>
	</form>
</body>
