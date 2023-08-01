package com.bridgeLabz;

import java.util.Scanner;
import java.util.ArrayList;

public class AddressBook {
	
	Scanner scan=new Scanner(System.in);
	
	ArrayList<Contact> contactArrayList=new ArrayList<>();
	
	public void addContacts() {
	    Contact contact=new Contact();
	    System.out.println("Enter the first name");
	    contact.setFirstName(scan.next());
	    System.out.println("Enter the last name");
	    contact.setLastName(scan.next());
	    System.out.println("Enter the Address");
	    contact.setAddress(scan.next());
	    System.out.println("Enter the city");
	    contact.setCity(scan.next());
	    System.out.println("Enter the State");
	    contact.setState(scan.next());
	    System.out.println("Enter the Zip");
	    contact.setZip(scan.nextInt());
	    System.out.println("Enter the phone number");
	    contact.setPhoneNumber(scan.nextLong());
	    System.out.println("Enter the Email");
	    contact.setEmail(scan.next());
	    
	    contactArrayList.add(contact);
	}
    
	public void displayContact() {
		for(int i=0; i<contactArrayList.size(); i++) {
			Contact contact=contactArrayList.get(i);
			System.out.println(contact.toString());
		}
	}
	

}
