package com.lxisoft.treasurer.controller;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import javax.servlet.ServletException;

/**
@author:silpa
@version:1.1
@copywrite
**/

public class LogoutServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException
	{
		    HttpSession session = request.getSession(false);
           if(session != null)
          session.invalidate();
          request.getRequestDispatcher("/index.jsp").forward(request,response);
	}
}