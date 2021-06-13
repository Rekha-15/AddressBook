package com;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.Person;

/**
 * @author rekha
 * Person is a class of public type
 * Add method to take an input from user to add a contact details to address book
 * created an object of  Person class has Person1
 *implementing from IAddressBook interface
 */

public class AddressBookProgram
{
	
	private static Scanner sc = new Scanner(System.in);
	 Map<String,Person>hashmap=new HashMap<>();
	
	 private void add() {
		 Person person = new Person();
		 System.out.println("First Name :");
		 person.setFirstName(sc.next());
		 System.out.println("Last name : ");
		 person.setLastName(sc.next());
		 System.out.println("Address :");
		 person.setAddress(sc.next());
		 System.out.println("City :");
		 person.setCity(sc.next());
		 System.out.println("State :");
		 person.setState(sc.next());
		 System.out.println("Zip :");
		 person.setZip(sc.next());
		 System.out.println("Phone :");
		 person.setPhone(sc.next());
		 System.out.println("Email :");
		 person.setEmail(sc.next());
		 
		 hashmap.put(person.getFirstName(), person);
		 System.out.println(hashmap);
	 }
	
	 
	 /**
	  * creating the method to edit the contact details already given to address book
	  * User wants to give there name and can start editing
	  *If contact person is not available or null it display invalid statement
	  */ 
	
	private void edit() {
		 Person person = new Person();
		String enteredName;
		System.out.println("Enter First name of contact to edit it ");
		enteredName=sc.next();
		Set<String>Keys=hashmap.keySet();
		for(String i:Keys)
		{
			if(i.equals(enteredName))
			{
				int check=0;
				System.out.println("Person found , what do you want to edit ?");
				System.out.println("Enter\n1.First Name\n2.Last Name\n3.Address\n4.city\n5.State\n6.Zip\n7.Phone\n8.Email");
				check=sc.nextInt();
				switch(check) {
				case 1:
					System.out.println("Enter new first name");
					person.setFirstName(sc.next());
					break;
				case 2:
					System.out.println("Enter new last name");
					person.setLastName(sc.next());
					break;
				case 3:
					System.out.println("Enter new Address");
					person.setAddress(sc.nextLine());
					break;
				case 4:
					System.out.println("Enter new city");
					person.setCity(sc.next());
					break;
				case 5:
					System.out.println("Enter new state");
					person.setState(sc.next());
					break;
				case 6:
					System.out.println("Enter new zip");
					person.setZip(sc.next());
					break;
				case 7:
					System.out.println("Enter new phone number");
					person.setPhone(sc.next());
					break;
				case 8:
					System.out.println("Enter new email");
					person.setEmail(sc.next());
					break;
				default :
					System.out.println("Invalid Entry");
						
				}
			}
			hashmap.put(enteredName, person);
		}
		
		
	}
	 
	 /**
	  * 
	  *Creating delete method , so that user can delete the contact details which is not required for user
	  *by entering first name user can delete the contact.
	  *If contact person is not available or null it display invalid statement
	  */
	
	private void delete() {
		System.out.println("Enter First name of contact to delete it ");
		String enteredName=sc.next();
		Set<String>Keys=hashmap.keySet();
		for(String i:Keys)
		{
			if(i.equals(enteredName))
			{
				hashmap.remove(i);
			    System.out.println("Person removed from Address book");
			}
			else
				System.out.println("Person not found");
		}
		
	}
	private void show() {
		System.out.println(hashmap);
		
	}
	 
	
	/**
	  * Printing the welcome message
	  * AddressBookProgram is an class 
	  * created an object of this AddressBookProgram class has AddressBookProgram1
	  * if condition is true
	  * By using switchCase asking user to what task user needs to perform 
	  * option will be given to user to select an number
	  * 1= adding contact details
	  * 2=displaying contact details
	  *3=editing contact details
	  *4=deleting details
	  */
	   
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Handling");
		AddressBookProgram book = new AddressBookProgram();
		boolean isExit = false;
		while (!isExit) {
			System.out.println("Enter options\n1.Add\n2.Edit\n3.Delete\n4.Show\n5.Exit");
			int userInput =sc.nextInt();
			switch (userInput) {
			case 1: 
				book.add();
				break;
			case 2:
				book.edit();
				break;
			case 3:
				book.delete();
				break;
			case 4:
				book.show();
				break;
			case 5 :
				isExit=true;
				break;
			default :
				System.out.println("Invalid input");
			}
		}
	}

}
