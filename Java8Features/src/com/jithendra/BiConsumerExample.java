package com.jithendra;

import java.util.ArrayList;
import java.util.function.BiConsumer;

class Employee3
{
	String name;
	double salary;
	
	Employee3(String name,double salary)
	{
		this.name=name;
		this.salary=salary;
	}
}

public class BiConsumerExample {

	public static void main(String[] args)
	{
		ArrayList<Employee3> al=new ArrayList<Employee3>();
		populate(al);
		BiConsumer<Employee3,Double> bc=(e,d)->e.salary=e.salary+d;
		for(Employee3 e:al)
		{
			bc.accept(e, 500.0);
			System.out.println(e.salary);
		}
		
	}



public static void populate(ArrayList<Employee3> al)
{
	al.add(new Employee3("Sachin",1000));
	al.add(new Employee3("Dhoni",2000));
	al.add(new Employee3("Dravid",3000));
	al.add(new Employee3("Kohli",4000));
	al.add(new Employee3("Rahane",5000));
}
}