package com;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author rekha
 * Creating array Person object for Person class
 * Add method to take an input from user to add a contact in address book
 *
 */
public class AddressBookProgram implements IAddressBook
{
	
	Scanner scanner = new Scanner(System.in);
	List<Person> personList = new ArrayList<Person>();
	
	public void add() 
	{
	    System.out.println("Enter your first name");
	    String firstName = scanner.nextLine();
	    System.out.println("Enter your last name");
	    String lastName = scanner.nextLine();
	    System.out.println("Enter your address");
	    String address = scanner.nextLine();
	    System.out.println("Enter your city");
	    String city = scanner.nextLine();
	    System.out.println("Enter your state");
	    String state = scanner.nextLine();
	    System.out.println("Enter your phone");
	    long mobileNo = scanner.nextLong();
	    System.out.println("Enter your zip code");
	    int zip = scanner.nextInt();
	        
	    Person person1 = new Person(firstName, lastName, address, city, state, mobileNo, zip);
	    personList.add(person1);
	    System.out.println("Contact added successfully");
         }
	
	/**
	 * Creating display method to display the contact details 
	 */
	
	 public void display() 
	 {
	      for(int i = 0; i< personList.size(); i++) 
	      {
	           Person person = personList.get(i);
	    	   System.out.println("FirstName:"+person.getFirstName()+"\n"+"LastName:"+person.getLastName()+"\n"+"Adress:"+person.getAddress()+"\n"
				      +"City:"+person.getCity()+"\n"+"State:"+person.getCity()+"Phone-Number:"+person.getMobileNo()+"\n"+"Pin-code:"+person.getPincode());
	    	}
	 }
	public static void main(String[] args) 
	{
		System.out.println("Welcome to Address Book Program");
		AddressBookProgram ab = new AddressBookProgram();
		ab.add();
		ab.display();
	}
}
