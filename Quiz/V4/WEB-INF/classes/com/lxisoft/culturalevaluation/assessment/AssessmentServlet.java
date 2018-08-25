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
		int score;
		int qNo=(int)session.getAttribute("qNo");
		if(session.getAttribute("questionList")==null)
		{
			session.setAttribute("qNo",0);
			response.sendRedirect("question");	
			score=0;
			session.setAttribute("score",score);
		}
		else if(qNo<40)
		{
			model.setQuestionList((ArrayList<QuestionModel>)session.getAttribute("questionList"));
			String selection=request.getParameter("selection");
			score=(int)session.getAttribute("score");
			if(selection!=null)
			{
				if(selection.equals(model.getQuestionList().get(qNo).getOptionList().getOptionA()))
				{
					score+=model.getQuestionList().get(qNo).getOptionList().getOptionA_Score();
				}
				if(selection.equals(model.getQuestionList().get(qNo).getOptionList().getOptionB()))
				{
					score+=model.getQuestionList().get(qNo).getOptionList().getOptionB_Score();
				}
				if(selection.equals(model.getQuestionList().get(qNo).getOptionList().getOptionC()))
				{
					score+=model.getQuestionList().get(qNo).getOptionList().getOptionC_Score();
				}
				if(selection.equals(model.getQuestionList().get(qNo).getOptionList().getOptionD()))
				{
					score+=model.getQuestionList().get(qNo).getOptionList().getOptionD_Score();
				}
				session.setAttribute("score",score);
			}
			session.setAttribute("question",model.getQuestionList().get(qNo));
			session.setAttribute("qNo",++qNo);
			response.sendRedirect("quiz.jsp");
		}
		else
		{
			response.sendRedirect("result.jsp");
		}
	}
}