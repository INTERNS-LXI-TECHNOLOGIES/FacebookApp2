<html>
	<head>
		<title>Login</title>
	</head>
	<body>
		<h1>Login</h1><br />
		<form action="user" method="post">
			<%if((int)session.getAttribute("success")==0)
			{
			%>
			<font size=2 color=red>*Wrong username or password*</font><br/>
			<%}%>
			Username :<br />
			<input type=text name="username" placeholder="Enter username"><br />
			Password :<br />
			<input type=password name="password" placeholder="Enter password"><br />
			<input type=submit name="button" value="Login">
		</form>
	</body>
</html>