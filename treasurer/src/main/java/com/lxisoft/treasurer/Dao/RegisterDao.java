package com.lxisoft.treasurer.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.lxisoft.treasurer.model.*;
import com.lxisoft.treasurer.controller.SignUpServlet;
import com.lxisoft.treasurer.util.DBConnection;

public class RegisterDao {

	final static org.slf4j.Logger sfl4jlogger = org.slf4j.LoggerFactory.getLogger(SignUpServlet.class);

	public String registerUser(Signup signup) {

		String fullName = signup.getName();
		String email = signup.getEmail();
		String userName = signup.getUname();
		String username = userName;
		String password = signup.getPassword();
		String userpass = password;
		String role = signup.getRole();
		String rolename = role;
		Connection con = null;
		PreparedStatement preparedStatement = null;

		try {

			sfl4jlogger.trace("data storage mechanism.");
			con = DBConnection.createConnection();

			/**
			 * Insert user details into the table 'newUsers'
			 */

			String query = "insert into newUsers( fullName,email,userName,password,role) values (?,?,?,?,?)";
            

			/**
			 * Making use of prepared statements here to insert bunch of data
			 * 
			 */

			preparedStatement = con.prepareStatement(query);
			preparedStatement.setString(1, fullName);
			preparedStatement.setString(2, email);
			preparedStatement.setString(3, userName);
			preparedStatement.setString(4, password);
			preparedStatement.setString(5, role);

			int i = preparedStatement.executeUpdate();

			      String query1 = "INSERT INTO users(username,userpass) values(?,?)";
			preparedStatement = con.prepareStatement(query1);
			preparedStatement.setString(1,username);
			preparedStatement.setString(2,userpass);
			preparedStatement.executeUpdate();


			String query2 = "INSERT INTO userroles(username,rolename) values(?,?)";
			preparedStatement = con.prepareStatement(query2);
			preparedStatement.setString(1,username);
			preparedStatement.setString(2,rolename);
			preparedStatement.executeUpdate();

			if (i != 0) // Just to ensure data has been inserted into the
						// database
				return "SUCCESS";
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	
		return "Oops.. Something went wrong there..!"; // On failure, send a
														// message from here.

	}

}
