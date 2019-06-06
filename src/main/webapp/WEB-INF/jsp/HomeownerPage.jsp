<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="style.html"%>
<meta charset="ISO-8859-1">
<title>Homeowner</title>
</head>
<body>
	<%@include file="header.html"%>
	<div>
		<h2>Homeowner Info</h2>
	</div>
	<div>
		<section>
			<article>
				<p></p>
			</article>

			<article>
				<form action="AddHomeowner" method="post">
					<div>
						<label>First Name</label><input type="text" name="firstName"
							required />
					</div>
					<div>
						<label>Last Name</label><input type="text" name="lastName" required/>
					</div>
					<div>
						<label>DOB</label><input type="date" name="DOB" required/>
					</div>
					<div>
						<label>SSN</label><input type="text" name="SSN" required/>
					</div>
					<div>
						<label>Email</label><input type="email" name="email" required/>
					</div>
					<div>
						<label>Retired Status</label>
							<input type="radio" name="retStatus" value="1"/>Yes
							<input type="radio" name="retStatus" value="0" checked/>No
					</div>
					<div>
						<input type="submit" value="Submit"/>
					</div>
				</form>

			</article>
		</section>

	</div>

</body>
</html>