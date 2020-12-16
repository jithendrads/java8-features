package com.jithendra;
/*
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

}*/

//Mulitiple Inheritance using default method in interface

interface I1
{
	default void m1()
	{
		System.out.println("m1 method in interface one");
		
	}
}

interface I2
{
	default void m1()
	{
		System.out.println("m1 method in interface two");
	}
}

class DefaultMethods implements I1,I2
{
	public void m1()
	{
		//System.out.println("Overriding default method");
		//But if you want I1's m1() method implementation then
		I1.super.m1();
	}
	
	public static void main(String[] args)
	{
		DefaultMethods d =new DefaultMethods();
		d.m1();
	}
}