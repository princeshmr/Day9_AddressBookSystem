package com.bridgeLabz;

public class Contact {
	String firstName;
	String lastName;
	String address;
	String city;
	String state;
	int zip;
	long phoneNumber;
	String email;

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void setEmail(String email) {
		this.email = email;
	}
    public String getFirstName() {
    	return firstName;
    }
   
	 public String toString() {
		return "Contact{"+
	                     "FirstName : "+firstName +'\''+
	                     " LastName : "+lastName +'\''+
	                     " Address : "+address +'\''+
	                     " City : "+city +'\''+
	                     " State : "+state +'\''+
	                     " zip : "+zip+
	                     " Mobile Number : "+phoneNumber+
	                     " Email :"+email+'\'' +
				"}";
		 
	 }

}
