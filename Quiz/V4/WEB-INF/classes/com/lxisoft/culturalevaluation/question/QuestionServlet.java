package com.lxisoft.culturalevaluation.question;
import java.util.ArrayList;
import com.lxisoft.culturalevaluation.options.OptionListModel;
import java.sql.*;
import javax.servlet.http.HttpSession;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class QuestionServlet extends HttpServlet 
{
	PrintWriter out;
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
	{
		out=response.getWriter();
		ArrayList<QuestionModel> questionList=loadQuestionFile();
		HttpSession session=request.getSession();
		session.setAttribute("questionList",questionList);
		response.sendRedirect("assessment");
	}
	
	public ArrayList<QuestionModel> loadQuestionFile()
	{
		ArrayList<QuestionModel> questions=new ArrayList<QuestionModel>();
		Connection con=null;
		Statement stmt=null;
		ResultSet result=null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz","root","root");
			String query="select * from questions";
			stmt=con.createStatement();
			result=stmt.executeQuery(query);
			while(result.next())
			{
				int qNo=result.getInt("qNo");
				String qstn=result.getString("question");
				int scoreA=result.getInt("option_A_score");
				int scoreB=result.getInt("option_B_score");
				int scoreC=result.getInt("option_C_score");
				int scoreD=result.getInt("option_D_score");
				OptionListModel options=new OptionListModel();
				options.setOptionA_Score(scoreA);
				options.setOptionB_Score(scoreB);
				options.setOptionC_Score(scoreC);
				options.setOptionD_Score(scoreD);
				QuestionModel question=new QuestionModel();
				question.setQuestionNumber(qNo);
				question.setQuestion(qstn);
				question.setOptionList(options);
				questions.add(question);
			}
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
		catch(Exception e)
		{
			out.print("error");
		}
		finally
		{
			try
			{
				if(result!=null)
					result.close();
				if(stmt!=null)
					stmt.close();
				if(con!=null)
					con.close();
			}
			catch(SQLException se)
			{
				se.printStackTrace();
			}
		}
		return questions;
	}
}