<html>
	<head>
		<title>Quiz</title>
	<head>
	<body>
		<%@ page import="javax.servlet.http.HttpSession ,java.util.ArrayList,com.lxisoft.culturalevaluation.question.QuestionModel,javax.servlet.RequestDispatcher"%>
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
			<button type="submit"><%=optionA%></button>
		</form>
		<form action="assessment">
			<button type="submit"><%=optionB%></button>
		</form>
		<form action="assessment">
			<button type="submit"><%=optionC%></button>
		</form>
		<form action="assessment">
			<button type="submit"><%=optionD%></button>
		</form>
	</body>
</html>