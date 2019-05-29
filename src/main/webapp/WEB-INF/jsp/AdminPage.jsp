<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Login Page</title>
</head>
<body>
	<div>
		<h1>Admin Login</h1>
	</div>
	<div>
		<form action="AdminLogin" method="post">
			<div>
				<label>Username</label> <input type="text" name="username" required />
			</div>
			<div>
				<label>Password</label> <input type="password" name="password"
					required />
			</div>
			<div>
				<input type="submit" value="Submit" />
			</div>
		</form>
	</div>
</body>
</html>