package com;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author rekha
 * Person is a class of public type
 * Add method to take an input from user to add a contact details to address book
 * created an object of  Person class has Person1
 *implementing from IAddressBook interface
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
	
	 /**
	  * creating the method to edit the contact details already given to address book
	  * User wants to give there name and can start editing
	  *
	  */ 
	 
	 public void edit(String firstName) 
	 {
             for (int i = 0; i < personList.size(); i++) 
             {
            	Person person = personList.get(i);
            	Scanner scanner = new Scanner(System.in);

            	System.out.println("Hi " + person.getFirstName() + " please enter your  new Address");
                String address = scanner.nextLine();
                person.setAddress(address);

                System.out.println("Hi " + person.getFirstName() + " please enter your  new city");
                String city = scanner.nextLine();
                person.setCity(city);

                System.out.println("Hi " + person.getFirstName() + " please enter your  new state");
                String state = scanner.nextLine();
                person.setState(state);

                System.out.println("Hi " + person.getFirstName() + " please enter your  new Zip Code");
                int zip = scanner.nextInt();
                person.setPincode(zip);

                System.out.println("Hi " + person.getFirstName() + " please enter your  new Phone No");
                int PhoneNo = scanner.nextInt();
                person.setMobileNo(PhoneNo);

                System.out.println("Hi " + person.getFirstName() + " you have sucessfully updated");
          }
            
        }
	 
	 /**
	  * 
	  *Creating delet method , so that user can delete the contact details which is not required for user
	  *by entering first name user can delet the contact
	  */
	 
	 public void delete(String name)
	 {
         for (int i = 0; i < personList.size(); i++) 
         {
         	if(personList.get(i).getFirstName().equals(name))
         	{
         		Person person = personList.get(i);
         		personList.remove(person);
         	}
         }
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
	 
	public static void main(String[] args) 
	{
		System.out.println("Welcome to Address Book Program");
		 
		AddressBookProgram AddressBookProgram1 =new AddressBookProgram();
	        boolean condition = true;
	     
	        while (condition == true) 
	        {
	    	     Scanner scanner= new Scanner(System.in);
	    	     Scanner option = new Scanner(System.in);
	             System.out.println("What you want to perform ?"+"\n"+"1.Add Person"+"\n"+"2.Display"+"\n"+"3.Edit person"+"\n"+"4."+"Delete Person");
	         
                    switch(option.nextInt()) 
                    {
	                 case 1:AddressBookProgram1.add();
	                       break;
	             	 case 2:AddressBookProgram1.display(); 
                              break;
	                 case 3:System.out.println("Enter the firstName:");
	                       String firstName = scanner.nextLine();
	                       AddressBookProgram1.edit(firstName);
	            	       break;
			 case 4:System.out.println("Enter the Name of the person do you wants to delete");
	                       String name = scanner.nextLine();
	                       AddressBookProgram1.delete(name);
	            	       break;
			default:System.out.println("Thank You");
			}
		}
	}
}