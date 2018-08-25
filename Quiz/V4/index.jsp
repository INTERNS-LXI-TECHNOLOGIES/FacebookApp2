<html>
	<head>
		<title> Home</title>
	</head>
	<body>
		<%session.setAttribute("success",-1);%>
		<form action="Login.jsp">
			<br/><br/><p align="center"><button type="submit">Login</button></p>
		</form>
		<form action="signup.jsp">
			<br/><p align="center"><button type="submit">SignUp</button></p>
		</form>
	</body>
</html>