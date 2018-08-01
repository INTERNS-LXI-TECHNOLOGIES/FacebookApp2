package com.lxisoft.treasurer.model;
/**
*A plain java class that represents the model of a question,holding a question string and an answer which is the reference of the option
*@author Athulya Somakumaran
*@version 1.1
*/
public class Question
{
	
	
	
/**
*The string holds the actual question which is one of the many questions
*/

private String question;
/**
*The declaration option object represents the actual answer of the question which is one of the options
*/
private Option answer;

/**
*This sets the value for question
*@param question sets the value for question
*/
public void setQuestion(String question)
{
this.question=question;
}
/**
*Functions as an accessor method for the question
*@return question returns the value for question
*/
public String getQuestion()
{
	return question;
}
/**
*Sets the value for answer
*@param answer sets the value for answer
*/
public void setAnswer(Option answer)
{
this.answer=answer;
}
/**
*Functions as an accessor method for answers
*@return answer returns the value for answer
*/
public Option getAnswer()
{
	return answer;
}


private int questionId;

public int getQuestionId()
{
	return this.questionId;
}
public void setQuestionId(int questionId)
{
this.questionId=questionId;
}








}

