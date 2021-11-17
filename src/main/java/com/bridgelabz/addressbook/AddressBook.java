package com.bridgelabz.addressbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Address book
 *
 */

public class AddressBook {
	
	private static List<Contact> listContacts = new ArrayList<Contact>();

	public static void main(String[] args) {
		AddressBook.createContact();
	}

	/**
	 * Create contacts in address Book
	 * 
	 **/

	public static void createContact() {
		 
		Scanner scanner = new Scanner(System.in);
		System.out.println(" create  Contact in Address book ");
		System.out.println("Enter the FirstName");
		String firstname = scanner.next();
		System.out.println("Enter the LastName");
		String lastname = scanner.next();
		System.out.println("Enter the City");
		String city = scanner.next();
		System.out.println("Enter the State");
		String state = scanner.next();
		System.out.println("Enter the ZipCode");
		int zipcode = scanner.nextInt();
		System.out.println("Enter the Phone Number");
		String phoneNumber = scanner.next();
		System.out.println("Enter the email");
		String email = scanner.next();
		Contact contact = new Contact(firstname, lastname, city, state, zipcode, phoneNumber, email);
		listContacts.add(contact);
		scanner.close();
	}
}
