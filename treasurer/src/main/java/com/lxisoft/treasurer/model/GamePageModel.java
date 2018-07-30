package com.lxisoft.treasurer.model;
import java.util.ArrayList;

/* This is a class for setting and getting variables in class GamePageModel */

/**
 *@author joel
 *@version 1.1
 *@since 30-07-18
**/
public class GamePageModel{
	
	/**instance variable for the user to select the choice*/
	String choice;

	/**instance variable to select the option from a list of option */
	ArrayList<Option> options;

	/**instance variable to hold the question*/
	Question questions;

	/** Setting choice
	@param choice (passing parameter choice)
	*/
	public void setChoice(String choice)
	{
		this.choice=choice;

	}
	/**getting choice
	@return choice (returning the value of choice)
	*/
	public String getChoice()
	{
		return choice;
	}

	/**	Setting the question
	@param questions (passing parameter question)
	*/
	public void setQuestions(Question questions)
	{
		this.questions=questions;
	}

	/**Getting questions
	@return questions (returning the value of questions)
	*/
	public Question getQuestion()
	{
		return questions;
	}

	/**setting the option
	@param options (passing list of options)
	*/
	public void setOptions(ArrayList<Option> options)
	{
		this.options=options;
	}

	/** Getting options
	@return options (returning the value of options)
	*/
	public ArrayList<Option> setOptions()
	{
		return options;
	}

}
