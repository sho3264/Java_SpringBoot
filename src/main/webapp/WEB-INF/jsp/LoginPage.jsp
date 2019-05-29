<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<h1>Home Insurance</h1>
	<h2>Login</h2>
	<div>
		<form action="LoginUser" method="post">
			<div>
				<label>Username</label> <input type="text" name="username" required />
			</div>
			<div>
				<label>Password</label> <input type="password" name="password" required />
			</div>
			<div>
				<input type="submit" value="Login" />
			</div>
		</form>
		<br />
		<div>
			<a href="AdminPage">Admin Login</a> New User? 
			<a href="RegisterPage">Register	User</a>
		</div>
		<div>
			<%@ include file="error.jsp"%>
		</div>
	</div>

</body>
</html>