package com.lxisoft.treasurer.model;
/**
*@author Arthadh B.
*@version 1.1
*This class is for setting and getting of variables in class SignIn.
*/
public class SignIn
{
	/**
	*Declaration of variable username of type String which holds the username of the user.
	*/
	private String username;
	/**
	*Declaration of variable password of type String which hold the Password of the user.
	*/
	private String password;
		
	/**Setting UserName.
	*@param username (passing parameter username).
	*/
	public void setUserName(String username)
	{
		this.username=username;
	}
	/**Getting UserName.
	*@return username (returning the value username).
	*/
	public String getUserName()
	{
		return username;
	}
	/**Setting password.
	*@param password (passing parameter password).
	*/
	public void setPassword(String password)
	{
		this.password=password;
	}
	/**Getting password.
	*@return password (returning the value password).
	*/
	public String getPassword()
	{
		return password;
	}
}