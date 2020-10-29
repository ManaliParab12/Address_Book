package addressBook;

import java.util.Scanner;

public class AddressBookMain {
	
	static Scanner sc = new Scanner(System.in);			
	public static void main(String [] args) {
		
		AddressBookManager addressbookmanager = new AddressBookManager();
		AddressBook addressbook = new AddressBook();
		int answer=1;
		while (answer == 1) {			
			System.out.println("Select any option for Address Book Operation");
			System.out.println("1. Create New AddressBook"
							+ "\n2. open existing AddressBook"
							+ "\n3. save AddressBook"
							+ "\n4. Save As Address Book"
							+ "\n5. Close Address Book");			
			int choice =sc.nextInt();
			
			switch(choice) {
			case 1 :
				addressbookmanager.newAddressBook();
				break;
			case 2 :
				addressbookmanager.openAddressBook();
				
				int input=1;
				while (input == 1) {					
					System.out.println("Select any option From Menu ");
					System.out.println("1. Add Person"
									+ "\n2. Edit Person"
									+ "\n3. Delete Person"
									+ "\n4. Sort Person Records by First Name"
									+ "\n5. Sort Person by Zip Code"
									+ "\n6. Search Person"
									+ "\n7. Display"
									+ "\n8. Quit");
					int value = sc.nextInt();
					
					switch (value) {
					case 1 :
						addressbook.addPerson();
						break;
					case 2 :
						addressbook.editPerson();
						break;
					case 3 :
						addressbook.deletePerson();
						break;
					case 4 :
						addressbook.sortByName();
						break;
					case 5 :
						addressbook.sortByZip();
						break;
					case 6 :
						addressbook.searchPerson();
						break;
					case 7 :
						addressbook.display();
						break;
					case 8 :
						input = 0;
						break;
					default :
						System.out.println("Incorrect Choice" + "\nEnter a number between 1 and 8");			
				    }
				 }
				break;					
			case 3 :
				addressbookmanager.saveAddressBook();
				break;
			case 4 :
				addressbookmanager.saveAsAddressBook();
				break;
			case 5 :
				addressbookmanager.closeAddressBook();
				break;
			case 6 :
				answer = 0;
				break;
			default :
				System.out.println("Enter a number between 1 and 6");
				
			}
		}	   
	}
}
