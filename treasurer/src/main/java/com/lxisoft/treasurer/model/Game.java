package com.lxisoft.treasurer.model;
import java.util.ArrayList;
import com.lxisoft.treasurer.Question;
import com.lxisoft.treasurer.Option;
/**
*The class is just the plain java model class which holds some related variables required for the game page
*@author Ansal Khan K A
*/
public class Game
{
/**
*The declaration is an arraylist that holds all the question objects, literally have all the questions
*/
	private ArrayList<Question> questions;
/**
*The declaration is for an arraylist that holds all the options objects, literally having all the options
*/
	private ArrayList<Option> options;
/**
*The declaration is for an option class object referance that holds the choise or selection done by the user for a particular question
*/
	private Option selection;
/**
*Functions as an accessor method for the arraylist questions
*@return returns the arraylist questions
*/
	public ArrayList<Question> getQuestions()
	{
		return questions;
	}
/**
*Functions as an accessor method for the arraylist options
*@return returns the arrraylist options
*/
	public ArrayList<Option> getOptions()
	{
		return options;
	}
/**
*Functions as an accessor method for the variable selection
*@return returns the variable selection
*/
	public Option getSelection()
	{
		return selection;
	}
/**
*Functions as a way to edit or update the arraylist of questions
*@param argument is an arraylist of question passed from the invocator, the method sets the value in argument to the corresponding instance variable
*/
	public void setQuestions(ArrayList<Question> questions)
	{
		this.questions=questions;;
	}
/**
*Functions as a way to edit or update the arraylist of options
*@param argument is an arraylist of option passed from the invocator, the method sets the value in argument to the corresponding instance variable
*/
	public void setOptions(ArrayList<Option> options)
	{
		this.options=options;
	}
/**
*Functions as a way to edit or update the variable object of option, named selection
*@param argument is an object of option passed from the invocator, the method sets the value in argument to the corresponding instance variable
*/
	public void setSelection(Option selection)
	{
		this.selection=selection;
	}
}