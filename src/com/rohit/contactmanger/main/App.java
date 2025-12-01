package com.rohit.contactmanger.main;

import java.util.Scanner;


import com.rohit.contactmanger.dao.ContactDAO;
import com.rohit.contactmanger.model.Contact;

public class App {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ContactDAO dao = new ContactDAO();

		while (true) {
			System.out.println("\n======== CONTACT MANAGER ========");
			System.out.println("1. Add Contact");
			System.out.println("2. Update Phone");
			System.out.println("3. Delete Contact");
			System.out.println("4. Search Name");

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
			   
				case 2 :
					System.out.println("Enter ID : ");
					int uid = scanner.nextInt();
					
					scanner.nextLine();
					
					System.out.print("Enter New Phone: ");
                    String newNum = scanner.nextLine();
                    
                    dao.updateNumber(uid, newNum);
                    break;
					
				case 3 :
					System.out.println("Enter ID : ");
					int did = scanner.nextInt();
					
					dao.deleteContact(did);
					break;
					
				case 4 :
					System.out.println("Enter the Name : ");
					String sname = scanner.next();
					
					Contact result = dao.searchByName(sname);
					
                    if (result != null) {
                        System.out.println("Found: " + result);
                    }

                    break;
			}

		}
	}

}
