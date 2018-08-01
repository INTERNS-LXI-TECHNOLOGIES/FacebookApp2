package com.lxisoft.treasurer.util;

import java.sql.Connection;
import java.sql.DriverManager;

import com.lxisoft.treasurer.controller.SignUpServlet;

public class DBConnection {
	final static org.slf4j.Logger sfl4jlogger = org.slf4j.LoggerFactory.getLogger(SignUpServlet.class);

	public static Connection createConnection() {
		Connection con = null;
		String url = "jdbc:mysql://localhost:3306/security"; 
		String username = "root"; // MySQL username
		String password = "root"; // MySQL password

		sfl4jlogger.trace("database connection ready to use");
		try {
			try {
				Class.forName("com.mysql.jdbc.Driver"); // loading MySQLdrivers. 
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

			con = DriverManager.getConnection(url, username, password); // attempting to connect to MySQL database
			System.out.println("Printing connection object " + con);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return con;
	}
}
