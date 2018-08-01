package com.lxisoft.treasurer.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lxisoft.treasurer.Dao.RegisterDao;
import com.lxisoft.treasurer.model.*;
/**
*This is a servlet class for signUp to play game
*in orderto receive and process user request through Http protocol this class should
*extend HttpServlet and override doGet and/or doPost methods
@author Prasad.v.g
@version 1.0.1
*/
public class SignUpServlet extends HttpServlet
{
	
	private static final long serialVersionUID = -7411975908906080224L;
	final static org.slf4j.Logger sfl4jlogger = org.slf4j.LoggerFactory.getLogger(SignUpServlet.class);
/**
*doPost method is a override method from HttpServlet class
*this method is designed to send data along with the request to web resource
@param request is used to handle client request
@param response is used to respond client requests
@throws ServletException and IOException
*/
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		/**
		 * Copying all the input parameters in to local variables
		 */
		sfl4jlogger.trace("Entered RegisterServlet dopost method");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String uname = request.getParameter("username");
		String password = request.getParameter("pass");
		String  confirmPassword = request.getParameter("repeat-pass");
		sfl4jlogger.trace("username:{}", uname);

		Signup signup = new Signup();

		/**
		 * Using Java Beans - An easiest way to play with group of related data
		 */
		signup.setName(name);
		signup.setEmail(email);
		signup.setUname(uname);
		signup.setPassword(password);
		signup.setRole("user");

		RegisterDao registerDao = new RegisterDao();

		/**
		 * The core Logic of the Registration application is present here. We are going to insert user data in to the database.
		 *
		 */
		String userRegistered = registerDao.registerUser(signup);
		/**
		 *  On success, you can display a message to user on UserLogin page
		 */
		if (userRegistered.equals("SUCCESS")) {
			request.getRequestDispatcher("signin.jsp").forward(request, response);
		} else // On Failure, display a meaningful message to the User.
		{
			request.setAttribute("errMessage", userRegistered);
			request.getRequestDispatcher("signup.jsp").forward(request, response);
		}
	}
}