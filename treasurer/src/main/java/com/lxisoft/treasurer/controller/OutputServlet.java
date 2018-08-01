package com.lxisoft.treasurer.controller;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
/**
	*author Prince
	*version 1.0
	*date 30/07/2018
**/
public class OutputServlet extends HttpServlet

{
	public void doPost(HttpServletRequest request,HttpServletResponse response)
	   {
	   }
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException
	
		{
			/**
			*get the value from the parameter
			*/
		//static int chance =0;
		String status=request.getParameter("status");
		int count = Integer.parseInt(request.getParameter("count"));
		
			/**
			*if the player is win the game or loose the game 
			*redirect win page or loose page
			**/
		/*
			if(status == true)
				{
				    response.sendRedirect("win.jsp");
				}
		    else 
				{
				  response.sendRedirect("Loose.jsp");
								
				}
	
		*/
		
	}
}