package com.lxisoft.culturalevaluation.user;
import java.sql.*;
import java.util.ArrayList;

public class UserController
{
	UserModel currentUser;
	ArrayList<UserModel> users;
	UserView view=new UserView();
	public ArrayList<UserModel> loadUsers()
	{
		users=new ArrayList<UserModel>();
		Connection con=null;
		Statement stmt=null;
		ResultSet result=null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz","root","Anzii123");
			String query="select * from users";
			stmt=con.createStatement();
			result=stmt.executeQuery(query);
			while(result.next())
			{
				String userName=result.getString("username");
				String password=result.getString("password");
				UserModel usr=new UserModel();
				usr.setUsername(userName);
				usr.setPassword(password);
				users.add(usr);
			}
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
		catch(Exception e)
		{
			view.printError("Error");
		}
		finally
		{
			try
			{
				if(result!=null)
					result.close();
				if(stmt!=null)
					stmt.close();
				if(con!=null)
					con.close();
			}
			catch(SQLException se)
			{
				se.printStackTrace();
			}
		}
		return users;
	}
	public UserModel getCurrentUser()
	{
		currentUser=new UserModel();
		do
		{
			String userName=view.askUsername();
			if(isExistingUser(userName))
			{
				currentUser.setUsername(userName);
				String password=view.askPassword();
				currentUser.setPassword(password);
			}
			else
			{
				view.printError("Invalid username...");
				continue;
			}
		}while(!validateUser());
		view.loginSuccess(currentUser.getUsername());
		return currentUser;
	}
	public boolean isExistingUser(String userName)
	{
		for(UserModel u:users)
		{
			if(userName.equals(u.getUsername()))
				return true;
		}
		return false;
	}
	public boolean validateUser()
	{
		for(UserModel user:users)
		{
			if(user.getUsername().equals(currentUser.getUsername()))
			{
				if(user.getPassword().equals(currentUser.getPassword()))
				{
					return true;
				}
				else
				{
					view.printError("Password Incorrect...");
					break;
				}
			}
		}
		return false;
	}
}