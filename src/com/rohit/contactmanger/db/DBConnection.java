package com.rohit.contactmanger.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	private static final String URL = "jdbc:mysql://localhost:3306/DBConnect";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "root";

	private static Connection connection;

	public static Connection getConnection() {
		try {
			if (connection == null || connection.isClosed()) {

				Class.forName("com.mysql.cj.jdbc.Driver");

				connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

				System.out.println("Database connected successfully!");
			}

		} catch (SQLException e) {
			System.out.println("Database connection failed!");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("MySQL Driver not found!");
			e.printStackTrace();
		}

		return connection;
	}
}