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
	
		
	}

}
