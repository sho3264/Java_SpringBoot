<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register User</title>
</head>
<body>
	<div>
		<h2>Register User</h2>
	</div>

	<div>
		<form action="AddUser" method="post">
			<div>
				<label>Username</label>
				<input type="text" name="username" required/>
			</div>
			<div>
				<label>Password</label>
				<input type="password" name="Password" required/>
			</div>
			<div>
				<label>Confirm Password</label>
				<input type="password" name="ConfirmPassword" required/>
			</div>
			<div>
				<input type="submit" value="Submit"/>
				<input type="reset" value="Reset"/>
			</div>
		</form>
	</div>
</body>
</html>