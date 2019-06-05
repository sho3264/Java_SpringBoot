<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="style.html"%>
<meta charset="ISO-8859-1">
<title>Get Started</title>
</head>
<body>
	<div>
		<%@include file="header.html"%>
		<h2>Get Started</h2>
		<h3>Welcome ${uname.username}</h3>
	</div>
	<div>
		<section>
			<article>
				<p></p>
			</article>
			<article>
				<div>
					<a href="showHomeownerPage">Get Quote</a>
				</div>
				<div>
					<a href="RetrieveQuote">Retrieve Quote</a>
				</div>
			</article>
		</section>
	</div>
</body>
</html>