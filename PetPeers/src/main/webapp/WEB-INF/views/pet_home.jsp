<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pets Home Page</title>

<style type="text/css">
h2 {
	font-size: 20px;
	color: gray;
}

table, tr, td {
	border: 1px solid #D3D3D3;
	border-collapse: collapse;
	width: 600px;
	height: 30px;
}

a {
	margin: 15px 5px 0px 10px;
	float: right;
}

h1 {
	font-size: 15px;
	margin: 25px 0px 15px 15px;
}

.home{
	color : white;
	background-color : black;
	padding : 5px 5px 5px 5px;
}
</style>
</head>

<body>
	<form action="/user/logout">
		<a href="user/logout">LogOut</a>
		<a href="pets/myPets">MyPets</a>
		<a href="pets/petDetail">AddPet</a>
		<a class="home">Home</a><br>
		<h2>Pet Peers</h2>
		<table>
			<tr>
				<th>#</th>
				<th>Pet Name</th>
				<th>Place</th>
				<th>Age</th>
				<th>Action</th>
			</tr>
		</table>
	</form>
</body>
</html>
    