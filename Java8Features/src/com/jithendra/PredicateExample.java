package com.jithendra;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class EmployeeExample
{
	public String name;
	public int salary;
	
	EmployeeExample(String name,int salary)
	{
		this.name=name;
		this.salary=salary;
	}
}

public class PredicateExample {

	public static void main(String[] args) {
		/*Predicate<Integer> p1=i->i%2==0;
		System.out.println(p1.test(10));
		System.out.println(p1.test(15));
		Predicate<String> p2=s->s.length()%2==0;
		System.out.println(p2.test("jithendra"));
		System.out.println("---------------------------------------------");
		String[] s= {"Shewag","Dravid","Dhoni","anil kumble","Irfan patan"};
		for(String temp : s)
		{
			if(p2.test(temp))
				System.out.println(temp);
		}
			*/
		
		ArrayList<EmployeeExample> l=new ArrayList<EmployeeExample>();
		l.add(new EmployeeExample("Shewag",1234));
		l.add(new EmployeeExample("Dravid",9876));
		l.add(new EmployeeExample("Dhoni",2345));
		l.add(new EmployeeExample("anil kumble",8765));
		l.add(new EmployeeExample("Irfan patan",3456));
		Predicate<EmployeeExample> p1=e->e.salary>3000);
		Predicate<EmployeeExample> p2=e->e.name.startsWith("D");
		Predicate<EmployeeExample> p3=p1.and(p2);
//		for(EmployeeExample e:l)
//		{
//			if(p1.test(e))
//				System.out.println(e.name+" "+e.salary);
//		}
		
	l.stream().filter(p3).forEach(e->System.out.println(e.name+" "+e.salary));
		
		

	}

}
