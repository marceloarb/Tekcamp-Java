package cell_phone;

import java.util.ArrayList;

class CellPhone {
	//Attributes
	private String myNumber = "617-369-2334";
	private ArrayList<Contact> myContacts;
	
	// Constructor
	
	public CellPhone(String myNumber) {
		this.myNumber = myNumber;
		this.myContacts = new ArrayList<Contact>();
	}
	
	public boolean addNewContact(Contact contact) {
		if(findContact(contact.getName()) >=0) {
			System.out.println("Contact is already on file");
			return false;
		}
		myContacts.add(contact);
		return true;
	}
	public  boolean UpdateContact(Contact oldContact, Contact newContact) {
		int foundPosition = findContact(oldContact);
		if(foundPosition < 0) {
			System.out.println(oldContact.getName() + ", was not found");
			return false;
		}
		else if(findContact(newContact.getName()) != -1) {
			System.out.println("Contact with name " + newContact.getName() + " already exists. Update was no secessfull");
			return false;
		}
		
		this.myContacts.set(foundPosition, newContact);
		System.out.println(oldContact.getName()+ ", was replaced with" + newContact.getName());
		return true;
	}
	
	private int findContact(Contact contact) {
		return this.myContacts.indexOf(contact);
	}
	
	private int findContact(String contactName) {
		for(int i=0; i<this.myContacts.size(); i++) {
			Contact contact = this.myContacts.get(i);
			if(contact.getName().equals(contactName)) {
				return i;
			}
		}
		return -1;
	}
	
	
	
	public String queryContact(Contact contact) {
		if(findContact(contact)>=0) {
			return contact.getName();
		}
		return null;
	}
	
	public Contact queryContact(String name) {
		int position = findContact(name);
		if(position >=0) {
			return this.myContacts.get(position);
			
		}
		return null;
				
	}
	public boolean removeContact(Contact contact) {
		int foundPosition = findContact(contact);
		if(foundPosition < 0) {
			System.out.println(contact.getName() + ", was not found");
			return false;
		}
		
		this.myContacts.remove(foundPosition);
		System.out.println(contact.getName()+ ", was replaced with" + contact.getName());
		return true;
	}
	
	public void printContacts() {
		System.out.println("Contact List");
		for(int i=0; i<this.myContacts.size(); i++) {
			System.out.println("Name: " + this.myContacts.get(i).getName() + " Number: " + this.myContacts.get(i).getNumber());
		}
	}

	
}
