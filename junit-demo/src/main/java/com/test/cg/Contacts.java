package com.test.cg;

public class Contacts {
	private String firstName;
	private String lastName;
	private String phone;
	public Contacts(String firstName2, String lastName2, String phone2) {
		// TODO Auto-generated constructor stub
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
   public void validateFirstName() {
	   if(this.firstName == null)
		   throw new RuntimeException("First name cant be empty");
   }

public void validateLastName() {
	   if(this.lastName == null)
		   throw new RuntimeException("Last name cant be empty");
}

public void validatePhone() {
	   if(this.phone.length()!= 10) {
		   throw new RuntimeException("Phone number should be of 10 digits");
	   }
	   
	   if(this.phone.startsWith("0")) {
		   throw new RuntimeException("Phone number should not be of 0 digits");
	   }
}
}
