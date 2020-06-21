package cell_phone;

import java.util.Scanner;

public class CellPhoneTest {
	private static Scanner scanner = new Scanner(System.in);
	private static CellPhone cellPhone = new CellPhone("999-000-9898");
	public static void main(String[] args) {
		Contact person1 = new Contact("Marcelo", "617-369-2334");
		
		
		boolean quit = false;
		startPhone();
		printActions();
		while(!quit) {
			System.out.println("\n Enter action: (6 to show available actions)");
			int action = scanner.nextInt();
			scanner.nextLine();
			
			switch(action) {
			case 0:
				System.out.println("\nShutting down..");
				quit = true;
				break;
				
			case 1:
				cellPhone.printContacts();
				break;
				
			case 2: 
				addNewContact();
				break;
			case 3:
				updateContact();
				break;
			case 4:
				removeContact();
				break;
			case 5:
				queryContact();
				break;
			
			}
			
			
		}
	}
	
	

	private static void updateContact() {
		System.out.println("Enter existing contact name: ");
		String name = scanner.nextLine();
		Contact existingContact = cellPhone.queryContact(name);
		if(existingContact == null) {
			System.out.println("Contact not found.");
			return;
		}
		
		System.out.print(" Enter new contact name: ");
		String newName = scanner.nextLine();
		System.out.print("Enter new contact Number: ");
		String newNumber = scanner.nextLine();
		Contact newContact = Contact.createContact(newName, newNumber);
		if(cellPhone.UpdateContact(existingContact, newContact)) {
			System.out.println("Successfully updated record");
		}
		else {
			System.out.println("Error updating record");
		}
		
	}

	private static void removeContact() {
		System.out.println("Enter existing contact name: ");
		String name = scanner.nextLine();
		Contact existingContact = cellPhone.queryContact(name);
		if(existingContact == null) {
			System.out.println("Contact not found.");
			return;
		}
		if(cellPhone.removeContact(existingContact)) {
			System.out.println("Sucessfully deleted");
		}
		else {
			System.out.println("Error deleting");
		}
		
	}
	private static void queryContact() {
		System.out.println("Enter existing contact name: ");
		String name = scanner.nextLine();
		Contact existingContact = cellPhone.queryContact(name);
		if(existingContact == null) {
			System.out.println("Contact not found.");
			return;
		}
		System.out.println("Name: " + existingContact.getName() + " Number is " + existingContact.getNumber());
		
	}
	private static void addNewContact() {
		System.out.println("Enter new contact name: ");
		String name = scanner.nextLine();
		System.out.println("Enter new contact Number: ");
		String number = scanner.nextLine();
		Contact newContact = Contact.createContact(name, number);
		if(cellPhone.addNewContact(newContact)) {
			System.out.println("New contact added: "+ name + " Number: " + number);
		}
		else {
			System.out.println("Cannot add, "+ name + "already on file");
		}
		
		
	}



	private static void printActions() {
		System.out.println("\nAvailable action: \npress");
		System.out.println(
				"0 -  toshutdown\n"+
				"1 - to print contacts\n"+
				"2 - to add a new contact\n"+
				"3 - to update an existent contact\n"+
				"4 - to remove an existent contact\n"+
				"5 - query contact\n"+
				"6 - print list of available actions\n"
				);
		System.out.println("Choose your action: ");
		
	}

	private static void startPhone() {
		System.out.println("Starting phone ...");
		
	}
	
}
