package com.lxisoft.treasurer.controller;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
/**
	*author Prince
	*version 1.0
	*date 30/07/2018
**/
public class OutputServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException{
		//OutputController oc=new OutputController();
		//HttpSession session = request.getSession();
		//session.setAttribute("values",oc.name);
		
		/**
		*get the value from the parameter
		**/
		
		String name="false";
		String s=request.getParameter("status");
		
		/**
		*if the player is win the game or loose the game 
		*redirect win page or loose page
		**/
		
		if(s.equals(name)){
			response.sendRedirect("win.jsp");
		}
		else{
			response.sendRedirect("Loose.jsp");
		}
		//response.sendRedirect("LoginPage.jsp");
		
		
	}
}