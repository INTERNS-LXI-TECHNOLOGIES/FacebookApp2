package com.lxisoft.treasurer.model;
/**
* @author Amal
* @version 1.1
* @since   2018-07-2018 
*this class is to input username,password,age,and gender
*can access the variables using get and set method 
*encapsulation is implemented 
*
*/
public class User //user class delclaration
{
	/** declaration of instance string variable of name  username which can hold username */
private String username;
/**declaration of instance string variable name  password which can hold password*/
private String password;
/** declaration of instance integer variable name age  which can hold age*/
private int age;
/** delcaratio of instance string variable name  gender which can hold gender*/
private String gender;

/**Setting username.
*@param username(passsing parameter username).
*/

	public void setUsername(String username) 
	{
		this.username=username;
	}


	
	/**Setting passwor.
*@param password(passsing parameter password).
*/
	public void setPassword(String password)// method to set values to variable password
	{

		this.password=password;

	}
	
	/**Setting age.
*@param age(passsing parameter age).
*/
	public void setAge(int age)// method to set values to the variable age  
	{

		this.age=age;

	}
	
	/**Setting gender.
*@param gender(passsing parameter gender).
*/

	public void setGender(String gender)// method to set values to variable gender
	{

		this.gender=gender;
	
	}
	/** Getting username.
	*@return username(returning the value username).
	*/
	public String getUsername()// method  to get values from variable username
	{
	
		return username;

	}
	/** Getting password.
	*@return password(returning the value username).
	*/
	public String getPassword()// method to get values from variable password
	{
	
		return password;
	
	}
	/** Getting age.
	*@return age(returning the value age).
	*/
	public int getAge()// method to get values from  variable age 
	{

		return age;
	
	}
	
	/** Getting gender.
	*@return gender(returning the value gender).
	*/
	public String getGender()// method to get values from variable gender
	{

		return gender;
	
	}
}

