package com.lxisoft.treasurer.model;



/**This class is for setting and getting of variables in class Signup.
*@author Varsha.
*@version 1.1.
*/
public class Signup

{
	
/**Declaration of variable name of type String which holds the name of the user.
*/
	private String name;
/**Declaration of variable email of type String which holds the email of the user. 
*/	
	private String email;
/**Declaration of variable uname of type String which holds the username.
*/
	private String uname;
/**Declaration of variable password of type String which holds the password.
*/
	private String password;
/**Declaration of variable conpassword of type String which compares the password.
*/
	private String conpassword;

	
/**Setting Name.
*@param name (passing parameter name).
*/
	public void setName(String name)
	{
		this.name=name;
	}
	
/**Getting Name.
*@return name (returning the value name).
*/
	public String getName()
	{
		return name;
	}
	
	
/**Setting Email.
*@param email (passing parameter email).
*/
	public void setEmail(String email)
	{
		this.email=email;
	}
	
/**Getting  Email.
*@return email (returning the value email).
*/
	public String getEmail()
	{
		return email;
	}
	
	
/**Setting Uname.
*@param uname (passing parameter uname).
*/
	public void setUname(String uname)
	{
		this.uname=uname;
	}
	
/**Getting Uname.
*@return uname (returning the value uname).
*/
	public String getUname()
	{
		return uname;
	}
	
	
/**Setting Password.
*@param password (passing parameter password).
*/
	public void setPassword(String password)
	{
		this.password=password;
	}
	
/**Getting Password.
*@return password (returning the value of password).
*/
	public String getPassword()
	{
		return password;
	}
	
	

/**Setting Conpassword.
*@param conpassword(passing parameter conpassword).
*/
	public void setConpassword(String conpassword)
	{
		this.conpassword=conpassword;
	}
	
/**Getting Conpassword.
*@return conpassword(returning the value of conpassword).
*/
	public String getConpassword()
	{
		return conpassword;
	}
	
	
	
}