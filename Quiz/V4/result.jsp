<html>
	<head>
		<title>Result</title>
	<head>
	<body>
		<%@ page import="javax.servlet.http.HttpSession,com.lxisoft.culturalevaluation.user.UserModel"%>
		<h1 align="center">Thank You <%out.print(((UserModel)session.getAttribute("user")).getUsername());%></h1>
		<h3 align="center">Your Score is <%out.print((int)session.getAttribute("score"));%> out of 160</h3>
	</body>
</html>