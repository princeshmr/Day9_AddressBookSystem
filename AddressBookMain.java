package com.bridgeLabz;

import java.util.*;
public class AddressBookMain {

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");
		AddressBook addressBook=new AddressBook();
		addressBook.addContacts();   //add contact only for 1 person contact
		addressBook.displayContact();
		
		

	}

}
