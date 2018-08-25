<html>
	<head>
		<title>Quiz</title>
	<head>
	<body>
		<%@ page import="java.util.ArrayList,com.lxisoft.culturalevaluation.question.QuestionModel"%>
		<%
			
			QuestionModel question=(QuestionModel)session.getAttribute("question");
			int qstnNo=question.getQuestionNumber();
			String qstn= question.getQuestion();
			String optionA=question.getOptionList().getOptionA();
			String optionB=question.getOptionList().getOptionB();
			String optionC=question.getOptionList().getOptionC();
			String optionD=question.getOptionList().getOptionD();
		%>
			<p><%out.println(qstnNo+"."+qstn);%></p>
		<form action="assessment">
			<input type=submit name="selection" value="<%=optionA%>"><br/>
			<input type=submit name="selection" value="<%=optionB%>"><br/>
			<input type=submit name="selection" value="<%=optionC%>"><br/>
			<input type=submit name="selection" value="<%=optionD%>"><br/>
		</form>
	</body>
</html>