package com.lxisoft.culturalevaluation.user;

import java.sql.*;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class UserServlet extends HttpServlet
{
	private ArrayList<UserModel> users;
	
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
	{
		users=loadUsers();
		HttpSession session=request.getSession();
		session.setAttribute("success",-1);
		UserModel currentUser=new UserModel();
		currentUser.setUsername(request.getParameter("username"));
		currentUser.setPassword(request.getParameter("password"));
		if(request.getParameter("button").equals("Login"))
		{
			session.setAttribute("qNo",0);
			session.setAttribute("user",currentUser);
			if(validateUser(currentUser))
			{
				session.setAttribute("success",1);
				response.sendRedirect("assessment");
			}
			else
			{
				session.setAttribute("success",0);
				response.sendRedirect("Login.jsp");
			}
		}
		else
		{
			for(UserModel usr:users)
			{
				if(usr.getUsername().equals(currentUser.getUsername()))
				{
					session.setAttribute("success",0);
				}
			}
			if((int)session.getAttribute("success")==0)
			{
				response.sendRedirect("signup.jsp");
			}
			else
			{
				session.setAttribute("success",1);
				addUser(currentUser);
				response.sendRedirect("Login.jsp");
			}
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
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz","root","root");
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
	public void addUser(UserModel user)
	{
		Connection con=null;
		PreparedStatement stmt=null;
		ResultSet result=null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz","root","root");
			String query="INSERT INTO users(username,password) values(?,?)";
			stmt=con.prepareStatement(query);
			stmt.setString(1,user.getUsername());
			stmt.setString(2,user.getPassword());
			System.out.println(user.getPassword());
			int i=stmt.executeUpdate();
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
	}
}