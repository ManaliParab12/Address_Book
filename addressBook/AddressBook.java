package addressBook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook implements AddressBookInterface  {
	
	Scanner sc = new Scanner(System.in);
	public static ArrayList<Person> personInfo = new ArrayList<>();
	
	public void addPerson() {
		
		System.out.println("Enter First Name");
        String firstName = sc.next();
        
        System.out.println("Enter Last Name");
        String lastName = sc.next();
        
        System.out.println("Enter City");
        String city = sc.next();
        
        System.out.println("Enter State");
        String state = sc.next();
        
        System.out.println("Enter phone Number");
        long phoneNumber = sc.nextLong();
        
        System.out.println("Enter Zip");
        int zip = sc.nextInt();
        
        Person person = new Person(firstName, lastName, city, state, phoneNumber, zip );
        personInfo.add(person);			
	}

	
	public void editPerson() {
		
		System.out.println("Enter First Name to update its record");
        String firstName = sc.next();
        
        for ( int i=0; i< personInfo.size(); i++) {
        	Person person = (Person)personInfo.get(i);
        	
			if(firstName.equals(person.firstName)) {
				
				System.out.println("Select any option to edit ");				
				System.out.println("1.Phone NUmber" + "\n2.Address" + "\n3.Quit");
				int choice = sc.nextInt();
				
				switch (choice) {
			    case 1 :
			    	System.out.println("Enter new Phone Number");
			    	long phoneNumber = sc.nextLong();
			    	
			    	person.setPhoneNumber(phoneNumber);
                    break;                            
			    case 2 :
			    	System.out.println("Enter new City");
			    	String city = sc.next();
			    	
			    	System.out.println("Enter new State");
			    	String state = sc.next();
			    	
			    	System.out.println("Enter new Zip");
			    	int zip = sc.nextInt();
			    	
			    	person.setCity(city);	
			    	person.setState(state);	
			    	person.setZip(zip);	
			    	break;			  
			    case 3 :
			    	System.exit(0);
			    	break;			      
			    default :
			    	System.out.println("Incorrect Choice");				
				}			      
			}
        }			
	}


	public void deletePerson() {
		
		
	}

	
	public void sortByName() {
	
		
	}

	public void sortByZip() {
		
		
	}


	public void searchPerson() {
		
		
	}


	public void display() {
		System.out.println("Person Information");
		for(int i=0; i<personInfo.size(); i++) {
			System.out.println(personInfo.get(i));
		}
	}
}
