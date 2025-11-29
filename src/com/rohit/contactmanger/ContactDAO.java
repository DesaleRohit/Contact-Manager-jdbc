package com.rohit.contactmanger;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ContactDAO {

	public void addContact(Contact contact) {
		Connection connection = DBConnection.getConnection();
		try {
			String query = "INSERT INTO contacts VALUES(?, ?, ?, ?)";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, contact.getId());
			preparedStatement.setString(2, contact.getName());
			preparedStatement.setString(3, contact.getNumber());
			preparedStatement.setString(4, contact.getEmail());

			int i = preparedStatement.executeUpdate();

			if (i > 0)
				System.out.println("Contact Added Successfully!");
			else
				System.out.println("Failed to Add Contact!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
