package com.rohit.contactmanger.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;

import com.rohit.contactmanger.db.DBConnection;
import com.rohit.contactmanger.model.Contact;

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

	public void updateNumber(int id, String newNum) {
		Connection connection = DBConnection.getConnection();
		try {
			String query = "UPDATE contacts SET phone=? WHERE id=?";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, newNum);
			preparedStatement.setInt(2, id);

			int i = preparedStatement.executeUpdate();
			
			if (i > 0)
				System.out.println("Phone Updated Successfully!");
			else
				System.out.println("No Contact Found with ID: " + id);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
