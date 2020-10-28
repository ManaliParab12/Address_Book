package addressBook;

public class Person {
	String firstName;
	String lastName;
	String city;
	String state;
	long phoneNumber;
	int zip;
		
	public Person(String firstName, String lastName, String city, String state, long phoneNumber, int zip) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.state = state;
		this.phoneNumber = phoneNumber;
		this.zip = zip;
	}
}