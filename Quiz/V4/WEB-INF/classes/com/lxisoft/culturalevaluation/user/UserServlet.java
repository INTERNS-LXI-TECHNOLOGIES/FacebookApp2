package com.lxisoft.culturalevaluation.user;

import java.sql.*;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.GenericServlet;
import java.io.Serializable;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class UserServlet extends HttpServlet
{
	ArrayList<UserModel> users;
	
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
	{
		users=loadUsers();
		UserModel currentUser=new UserModel();
		currentUser.setUsername(request.getParameter("username"));
		currentUser.setPassword(request.getParameter("password"));
		HttpSession session=request.getSession();
		session.setAttribute("qNo",0);
		session.setAttribute("user",currentUser);
		if(validateUser(currentUser))
		{
			System.out.println(currentUser.getUsername()+currentUser.getPassword());
			//RequestDispatcher dispatch=request.getRequestDispatcher("assessment");
			//dispatch.forward(request,response);
			response.sendRedirect("assessment");
		}
	}
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
	public boolean validateUser(UserModel currentUser)
	{
		for(UserModel user:users)
		{
			if(user.getUsername().equals(currentUser.getUsername()))
			{
				if(user.getPassword().equals(currentUser.getPassword()))
				{
					return true;
				}
			}
		}
		return false;
	}
}