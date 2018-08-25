<html>
	<head>
		<title>SignUp</title>
	</head>
	<body>
		<h1>SignUp</h1><br />
		<form action="user" method="post">
			<%if((int)session.getAttribute("success")==0)
				{
				%>
					<font size=2 color=red>*user already exist*</font><br/>
				<%}%>
			Username:<br />
			<input type=text name="username" placeholder="Enter username"><br />
			Password:<br />
			<input type=password name="password" placeholder="Enter password"><br />
			<input type=submit name="button" value="SignUp">
		</form>
	</body>
</html>