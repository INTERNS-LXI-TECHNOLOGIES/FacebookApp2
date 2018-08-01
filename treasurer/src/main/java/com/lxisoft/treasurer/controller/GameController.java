package com.lxisoft.treasurer.controller;
import java.util.ArrayList;
import com.lxisoft.treasurer.model.Game;
import com.lxisoft.treasurer.model.Question;
import com.lxisoft.treasurer.model.Option;

/**
*The class is controller that controls the operations and coordinated the get and set accesses for the model class Game
*@author Ansal Khan K A
*/
public class GameController
{
/**
*The declaration is of the model class Game, that holds some required declarations and the corresponding getters and setters
*/
	private Game model;
/**
*The declaration is of a Question class reference that holds the current question that the user is viewing
*/
	private Question currentQuestion;
/**
*The method accessess the next question in the arraylist of questions declared model Game class and returns it
*@return the next object in the arraylist of questions accessed from the model Game class
*/
	/* public String nextQuestion()
	{
		ArrayList<Question> questions=model.getQuestions();
		Question question=questions.get(currentQuestion++);
		return question.getQuestion();
	} */
/**
*The method returns all the options accessed from the Game class and allows the invocator of the controller to access the options wherever needed
*@return the option list is returned
*/
	public ArrayList<Option> getAllOptions()
	{
		return model.getOptions();
	}
/**
*The method gets an argument of option object named selection which is the current selection of the user from the provided optionlist
*Then compares the selection with the correct option or more particularly the answer from the current question object.
*@param the selected option object from the user
*@return return a boolean value notifying whether the selection is true or false
*/
	public boolean isCorrectSelection(Option selection)
	{
		model.setSelection(selection);
		if(model.getSelection().equals(currentQuestion.getAnswer()))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
/**
*The method sets the model as of what the invocator passed to.
*@param the parameter is a object of the Game model class
*/
	public void setModel(Game model)
	{
		this.model=model;
	}
	
	public void setCurrentQuestion(Question currentQuestion)
	{
		this.currentQuestion=currentQuestion;
	}
	
	
	
}