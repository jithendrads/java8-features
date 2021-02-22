package com.jithendra;
import java.util.function.Predicate;

import com.jithendra.PredicateDemo;

interface Istatic
{
	public static void m1()
	{
		System.out.println("Static method in Interface");
	}
}

class StaticMethods implements Istatic {

	public static void main(String[] args) {
		Predicate<String> p1;
		//different ways of calling static method of interface
		Istatic.m1();
		//m1();
		//StaticMethods.m1();
		//StaticMethods s=new StaticMethods();
		//s.m1();
		System.out.println(p1.test("jithu"));
	

	}

}
