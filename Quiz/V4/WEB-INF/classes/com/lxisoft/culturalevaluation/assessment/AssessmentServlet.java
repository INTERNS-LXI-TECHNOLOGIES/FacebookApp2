package com.lxisoft.culturalevaluation.assessment;

import java.util.ArrayList;
import java.util.List;
import com.lxisoft.culturalevaluation.question.QuestionModel;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class AssessmentServlet extends HttpServlet 
{
	private AssessmentModel model;
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
	{
		
		HttpSession session= request.getSession();
		model=new AssessmentModel();
		if(session.getAttribute("questionList")==null)
		{
			session.setAttribute("qNo",0);
			response.sendRedirect("question");	
		}
		else
		{
			List<QuestionModel> questionList=null;
			questionList=(List<QuestionModel>)session.getAttribute("questionList");
			model.setQuestionList((ArrayList<QuestionModel>)questionList);
			int qNo=(int)session.getAttribute("qNo");
			session.setAttribute("question",model.getQuestionList().get(qNo));
			session.setAttribute("qNo",++qNo);
			response.sendRedirect("quiz.jsp");
		}
	}
}