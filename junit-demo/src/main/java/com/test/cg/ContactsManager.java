package com.test.cg;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ContactsManager {
Map<String,Contacts>contactList = new HashMap<String,Contacts>();
public void addContacts(String firstName,String lastName,String phone) {
Contacts contacts = new Contacts(firstName,lastName,phone);	
validateContacts(contacts);
contactList.put("first", contacts);
}
public Collection<Contacts>getAllContacts(){
	Map<String, Contacts> ContactsList = null;
	return ContactsList.values();
}
private void validateContacts(Contacts contacts) {
	// TODO Auto-generated method stub
	contacts.getFirstName();
	contacts.validatelastName();
	contacts.validatephone();
}
}
