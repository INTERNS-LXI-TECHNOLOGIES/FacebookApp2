package com.lxisoft.culturalevaluation.assessment;
import com.lxisoft.culturalevaluation.user.UserModel;
import java.util.ArrayList;
import com.lxisoft.culturalevaluation.question.QuestionModel;

public class AssessmentModel
{
	//private UserModel currentUser;
	private ArrayList<QuestionModel> questionList;
	private int finalTestScore;
	
	/*public UserModel getCurrentUser()
	{
		return currentUser;
	}
	public void setCurrentUser(UserModel currentUser)
	{
		this.currentUser=currentUser;
	}*/
	public ArrayList<QuestionModel> getQuestionList()
	{
		return questionList;
	}
	public void setQuestionList(ArrayList<QuestionModel> questionList)
	{
		this.questionList=questionList;
	}
	public void setFinalTestScore(int finalTestScore)
	{
		this.finalTestScore=finalTestScore;
	}
	public int getFinalTestScore()
	{
		return finalTestScore;
	}
}