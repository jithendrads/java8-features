package com.jithendra;

import java.util.ArrayList;
import java.util.function.BiFunction;

class Employee2
{
	int empno;
	String name;
	
	Employee2(int empno,String name)
	{
		this.empno=empno;
		this.name=name;
	}
}


public class BiFunctionExample {

	public static void main(String[] args) {
		ArrayList<Employee2> elist=new ArrayList<Employee2>();
		BiFunction<Integer,String,Employee2> bf=(empno,name)->new Employee2(empno,name);
		elist.add(bf.apply(1, "jithendra1"));
		elist.add(bf.apply(2, "jithendra2"));
		elist.add(bf.apply(3, "jithendra3"));
		elist.add(bf.apply(4, "jithendra4"));
		elist.add(bf.apply(5, "jithendra5"));
		
		for(Employee2 e: elist)
		{
			System.out.println(e.empno);
			System.out.println(e.name);
			
		}
		

	}

}
