package com.rohit.contactmanger.db;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	private static final String URL = "jdbc:mysql://localhost:3306/DBConnect";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "root";

	public static Connection getConnection() {
		Connection connection = null;

		try {
			// Step 1. Register MYSQL Driver..
			Driver driver = new com.mysql.cj.jdbc.Driver();
			DriverManager.registerDriver(driver);

			// Step 2. Create connection..
			connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

		} catch (SQLException e) {
			System.out.println("Database connection failed!");
			e.printStackTrace();
		}

		return connection;
	}
}
