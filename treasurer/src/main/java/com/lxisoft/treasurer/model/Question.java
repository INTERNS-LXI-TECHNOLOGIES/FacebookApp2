package com.lxisoft.treasurer.model;
/**
*A plain java class that represents the model of a question,holding a question string and an answer which is the reference of the option
*@author Athulya Somakumaran
*/
public class Question
{
	
/**
*The string holds the actual question which is one of the many for the app
*/

private String question;
/**
*The declaration option object represents the actual answer of the question which is one of the options
*/
private Option answer;

/**
*Functions as a way to set the value of question
*/
public void setQuestion(String question)
{
this.question=question;
}
/**
*Functions as an accessor method for the question
*@return returns the question
*/
public String getQuestion()
{
	return question;
}
/**
*Functions as a way to set the value for answer
*/
public void setAnswer(Option answer)
{
this.answer=answer;
}
/**
*Functions as an accessor method for answers
*@return returns the answer
*/
public Option getAnswer()
{
	return answer;
}

}

