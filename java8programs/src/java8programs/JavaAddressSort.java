package java8programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JavaAddressSort {
	
	public static void main(String[] args)
	{
		Address a1=new Address("dbpur",123);
		Address a2=new Address("bbpur",323);
		Address a3=new Address("abpur",223);
		Address a4=new Address("cbpur",133);
		Address a5=new Address("fbpur",122);
		
		Employee1 e1=new Employee1(1,20,"ji",a1);
		Employee1 e2=new Employee1(1,10,"jf",a2);
		Employee1 e3=new Employee1(1,30,"hi",a3);
		Employee1 e4=new Employee1(1,15,"ei",a4);
		Employee1 e5=new Employee1(1,40,"li",a5);
		
		List<Employee1> empList=new ArrayList<Employee1>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
		System.out.println("Before sorting");
		System.out.println(empList);
		System.out.println("After sorting based on Age");
		Collections.sort(empList, new AgeComparator());
		System.out.println(empList);
		System.out.println("After sorting based on name");
		Collections.sort(empList, new NameComparator());
		System.out.println(empList);
		System.out.println("After sorting based on Address");
		Collections.sort(empList, new AddressComparator());
		System.out.println(empList);
	}

}