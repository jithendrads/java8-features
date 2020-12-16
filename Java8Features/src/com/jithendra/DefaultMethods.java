package com.jithendra;

interface I
{
	default void m1()
	{
		System.out.println("Default implementation");
	}
	
	//default method cannot override a method from Object class
	//default int hashCode(){}
}

public class DefaultMethods implements I {
//overriding default method
	
	public void m1()
	{
		System.out.println("Overriding default method");
	}
	
	public static void main(String[] args) {
		DefaultMethods d=new DefaultMethods();
		d.m1();

	}

}

