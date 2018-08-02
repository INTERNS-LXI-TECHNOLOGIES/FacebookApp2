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
			HttpSession session=request.getSession();
				
        String check = "true";
		String status=request.getParameter("status");
		
		int count = (Integer)session.getAttribute("count");
		
			/**
			*if the player is win the game or loose the game 
			*redirect win page or loose page
			**/
		
			if(status.equals(check))
				{
				    response.sendRedirect("treasure.jsp");
				}
		    else 
				{
				  response.sendRedirect("gameover.jsp");
								
				}
	
		
		
	}
}