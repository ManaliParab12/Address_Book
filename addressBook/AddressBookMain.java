package addressBook;

import java.util.Scanner;

public class AddressBookMain {
	
	static Scanner sc = new Scanner(System.in);			
	public static void main(String [] args) {
		
		AddressBookManager addressbookmanager = new AddressBookManager();
		
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
