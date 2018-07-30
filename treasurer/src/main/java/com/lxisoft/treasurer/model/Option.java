package com.lxisoft.treasurer.model;
/**
*A plain java class that represents the model of an option,holding an option id and the corresponding imagePath
*@author Athulya Somakumaran
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
*Functions as a way to set the value of option
*/
public void setOption(String option)
{
this.option=option;
}

/**
*Functions as an accessor method for the option
*@return returns the option
*/

public String getOption()
{
	return option;
}
/**
*Functions as a way to set the value for imagePath
*/

public void setImagePath(String imagePath)
{
this.imagePath=imagePath;
}
/**
*Functions as an accessor method for imagePath
*@return returns the imagePath
*/
public String getImagePath()
{
	return imagePath;
}

}
