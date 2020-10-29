package addressBook;

import java.util.Comparator;

public class NameComparator implements Comparator<Person>{

	@Override
	public int compare(Person arg0, Person arg1) {
	
		return arg0.firstName.compareTo(arg1.firstName);
	}

}
