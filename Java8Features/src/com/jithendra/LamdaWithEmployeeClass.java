package com.jithendra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee
{
	String name;
	int empNo;
	int salary;
	
	Employee(String name,int empNo,int salary)
	{
		this.name=name;
		this.empNo=empNo;
		this.salary=salary;
	}
	
	public String toString()
	{
		return this.name+" : "+this.empNo+" with Salary "+this.salary;
	}
}

/*class EnumSorting implements Comparator<Employee>
{
	@Override
	public int compare(Employee e1, Employee e2) {
		return (e1.empNo<e2.empNo)?-1:(e1.empNo>e2.empNo)?1:0;
	}

}*/
public class LamdaWithEmployeeClass {

	public static void main(String[] args) {
		//Employee e=new Employee("jithendra",1);
		//System.out.println(e);
		
		ArrayList<Employee> l=new ArrayList<Employee>();
		l.add(new Employee("Dhoni",23451,9876));
		l.add(new Employee("Sachin",12345,1234));
		l.add(new Employee("Kohli",45123,8765));
		l.add(new Employee("Dravid",34512,2345));
		l.add(new Employee("ABD",51234,8765));
		System.out.println(l);
		//Comparator<Employee> c=(e1,e2)->(e1.empNo<e2.empNo)?-1:(e1.empNo>e2.empNo)?1:0;
		//Collections.sort(l,new EnumSorting());
		//Collections.sort(l,c);
		
		//Sorting Employee based on  empolyee numbers in descending order
		Collections.sort(l,(e1,e2)->(e1.empNo>e2.empNo)?-1:(e1.empNo<e2.empNo)?1:0);
		System.out.println(l);
		
		//Sorting Employee based on empolyee numbers in ascending order
		Collections.sort(l,(e1,e2)->(e1.empNo<e2.empNo)?-1:(e1.empNo>e2.empNo)?1:0);
		System.out.println(l);
		
		//Sorting Employee based on name in ascending order
		Collections.sort(l,(e1,e2)->e1.name.compareTo(e2.name));
		System.out.println(l);
		
		//Sorting Employee based on name in descending order
		Collections.sort(l,(e1,e2)->e2.name.compareTo(e1.name));
		System.out.println(l);
		
		Collections.sort(l,(e1,e2)->(e1.salary>e2.salary)?-1:(e1.salary<e2.salary)?1:0);
		System.out.println(l);
		System.out.println(l.get(1));
		

	}

}

