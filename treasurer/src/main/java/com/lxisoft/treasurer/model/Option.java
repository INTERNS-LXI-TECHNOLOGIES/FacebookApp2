package com.lxisoft.treasurer.model;
/**
*A plain java class that represents the model of an option,holding an option id and the corresponding imagePath
*@author Athulya Somakumaran
*@version 1.1
*/
public class Option
{
/**
*The string holds the unique value that identifies the respective option
*/
private String option;
/**
*The string holds the actual imagePath for the option selected
*/
private String imagePath;

/**
*Sets the value of option for question
*@param option sets the value for option
*/
public void setOption(String option)
{
this.option=option;
}

/**
*Functions as an accessor method for the option
*@return option returns the value for option
*/

public String getOption()
{
	return option;
}
/**
*Sets the value for imagePath
*@param imagePath sets  the value for imagePath
*/

public void setImagePath(String imagePath)
{
this.imagePath=imagePath;
}
/**
*Functions as an accessor method for imagePath
*@return imagePath returns the value for imagePath
*/
public String getImagePath()
{
	return imagePath;
}

}
