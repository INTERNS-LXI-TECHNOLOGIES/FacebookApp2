package com.lxisoft.treasurer.controller;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
@author:silpa
@version:1.1
@copywrite
**/

public class Logout extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)
	{
		    HttpSession session = request.getSession(false);
           if(session != null)
          session.invalidate();
          request.getRequestDispatcher("/signin.jsp").forward(request,response);
	}
}