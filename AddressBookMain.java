package com.bridgeLabz;

import java.util.*;
public class AddressBookMain {

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");
		//System.out.println("1.AddContact\n");
		AddressBook addressBook=new AddressBook();
		addressBook.addContacts();
		addressBook.displayContact();

	}

}
