package java8programs;

import java.util.Comparator;

public class AgeComparator implements Comparator<Employee1> {

	@Override
	public int compare(Employee1 o1, Employee1 o2) {
		return o1.getAge()-o2.getAge();
	}

}
