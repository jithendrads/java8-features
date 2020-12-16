package com.jithendra;

//Mulitiple Inheritance using default method in interface

interface Left
{
	void abstractmethod1();
	default void m1()
	{
		System.out.println("m1 method in interface one");
		
	}
}

interface Right
{
	void abstractmethod1();
	default void m1()
	{
		System.out.println("m1 method in interface two");
	}
}


public class MultipleInheritanceusingDefaultMethods implements Left,Right{
	
	public void m1()
	{
		//if you want to override default method
		System.out.println("Overriding default method");
		//But if you want Left's m1() method implementation then
		Left.super.m1();
		
		//But if you want Right's m1() method implementation then
		Right.super.m1();
	}
	
	public static void main(String[] args)
	{
		MultipleInheritanceusingDefaultMethods d =new MultipleInheritanceusingDefaultMethods();
		d.m1();
		d.abstractmethod1();
	}

	@Override
	public void abstractmethod1() {
		System.out.println("overriding abstract method");
		
	}

}
