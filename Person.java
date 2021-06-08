package com;

/**
 * @author rekha
 *Person is a class of public class
 */
public class Person 
{
	 
		public static void main(String[] args)
		{
			System.out.println("Welcome To AddressBook Problem");
		}
		public String firstName;
		public String lastName;
		public String address;
		public String city;
		public String state;
		public long mobileNo;
		public int zip;
		
		/**
		 * Created a parameterize constructor of firstName, lastName, address, city,state,  mobileNo, zip
		 *  Getting and setting contact details  and returning same 
		 *  using this to differenciate between class attributes and parameters with the same name         
		 */

		public Person(String firstName, String lastName, String address,String city,
			      String state, long mobileNo,int zip)
		{
			this.firstName = firstName;
		        this.lastName = lastName;
		        this.address = address;
		        this.city = city;
		        this.state = state;
		        this.mobileNo = mobileNo;
		        this.zip = zip;
		    }

		    public String getFirstName() 
		    {
		        return firstName;
		    }
		    
		    public void setFirstName(String firstName) 
		    {
		        this.firstName = firstName;
		    }
		    public String getLastName() 
		    {
		        return lastName;
		    }
		    
		    public void setLastName(String lastName) 
		    {
		        this.lastName = lastName;
		    }
		    public String getAddress() 
		    {
		        return address;
		    }
		    
		    public void setAddress(String address) 
		    {
		        this.address = address;
		    }
		    public String getCity() 
		    {
		        return city;
		    }
		    
		    public void setCity(String city) 
		    {
		        this.city = city;
		    }
		    public String getState() 
		    {
		        return state;
		    }
		    
		    public void setState(String state)
		    {
		        this.state = state;
		    }
		    
		    public int getPincode() 
		    {
		        return zip;
		    }
		    
		    public void setPincode(int pincode) 
		    {
		        this.zip = zip;
		    }
		    
		    public long getMobileNo() 
		    {
		        return mobileNo;
		    }
		    
		    public void setMobileNo(long mobileNo) 
		    {
		        this.mobileNo = mobileNo;
		    }
		    
		   @Override
		   
		    public String toString() 
		    {
		        return "Person [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city=" + city
		                + ", state=" + state + ", pincode=" + zip + ", mobileNo=" + mobileNo +"]"+"\n";
		    }
		    
}
