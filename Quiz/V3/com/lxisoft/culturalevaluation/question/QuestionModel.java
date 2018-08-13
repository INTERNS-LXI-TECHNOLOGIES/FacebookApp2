package com.lxisoft.culturalevaluation.question;
import com.lxisoft.culturalevaluation.options.OptionListModel;

public class QuestionModel
{
	private int questionNumber;
	private String question;
	private OptionListModel optionList;
	
	public int getQuestionNumber()
	{
		return questionNumber;
	}
	public void setQuestionNumber(int questionNumber)
	{
		this.questionNumber=questionNumber;
	}
	public void setQuestion(String question)
	{
		this.question=question;
	}
	public String getQuestion()
	{
		return question;
	}
	public OptionListModel getOptionList()
	{
		return optionList;
	}
	public void setOptionList(OptionListModel optionList)
	{
		this.optionList=optionList;
	}
	public String toString()
	{
		return("\n"+questionNumber+"."+question+"\n"+optionList);
	}
}