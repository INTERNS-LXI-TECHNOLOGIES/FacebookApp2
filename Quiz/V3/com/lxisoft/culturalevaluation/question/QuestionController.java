package com.lxisoft.culturalevaluation.question;
import java.util.ArrayList;
import com.lxisoft.culturalevaluation.options.OptionListModel;
import com.lxisoft.culturalevaluation.options.OptionListController;
import java.sql.*;

public class QuestionController
{
	QuestionView view=new QuestionView();
	public ArrayList<QuestionModel> loadQuestionFile()
	{
		ArrayList<QuestionModel> questions=new ArrayList<QuestionModel>();
		Connection con=null;
		Statement stmt=null;
		ResultSet result=null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz","root","Anzii123");
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
			view.printError("Error");
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
	public int askQuestions(ArrayList<QuestionModel> questions)
	{
		int score=0;
		for(QuestionModel question:questions)
		{
			char choice=view.ask(question);
			score+=updateScore(choice,question);
		}
		return score;
	}
	public int updateScore(char choice,QuestionModel question)
	{
		char ch=Character.toLowerCase(choice);
		OptionListModel optionList=question.getOptionList();
		switch(ch)
		{
			case 'a':return optionList.getOptionA_Score();
			case 'b':return optionList.getOptionB_Score();
			case 'c':return optionList.getOptionC_Score();
			case 'd':return optionList.getOptionD_Score();
			default: view.printError("Wrong Option"); return 0;
		}
	}
}