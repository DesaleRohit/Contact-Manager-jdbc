package com.rohit.contactmanger;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ContactDAO dao = new ContactDAO();

		while (true) {
			System.out.println("\n======== CONTACT MANAGER ========");
			System.out.println("1. Add Contact");

			System.out.print("Enter your choice: ");

			int ch = scanner.nextInt();
			scanner.nextLine();

			switch (ch) {

				case 1:
					System.out.print("Enter ID: ");
					int id = scanner.nextInt();
					scanner.nextLine();
	
					System.out.print("Enter Name: ");
					String name = scanner.nextLine();
	
					System.out.print("Enter Phone: ");
					String number = scanner.nextLine();
	
					System.out.print("Enter Email: ");
					String email = scanner.nextLine();
	
					Contact contact = new Contact(id, name, number, email);
					dao.addContact(contact);
					break;

			}

		}
	}

}
