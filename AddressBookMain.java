package com.bridgeLabz;

import java.util.*;
public class AddressBookMain {

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");
		AddressBook addressBook=new AddressBook();
		addressBook.addContacts();   //add contact only for 1 person contact
		//addressBook.displayContact();
		
		/* Scanner scan=new Scanner(System.in);
		 System.out.println("Enter the number of contact you want to add: ");
		 int numberOfContacts=scan.nextInt();
	   	for(int i=0; i<numberOfContacts; i++) {
				addressBook.addContacts();      //add contact more than 1 person contact
		}*/
	   	addressBook.editContact();
		addressBook.displayContact();

	}

}
