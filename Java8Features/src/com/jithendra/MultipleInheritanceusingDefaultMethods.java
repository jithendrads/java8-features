package com.jithendra;

//Mulitiple Inheritance using default method in interface

interface Left
{
	default void m1()
	{
		System.out.println("m1 method in interface one");
		
	}
}

interface Right
{
	default void m1()
	{
		System.out.println("m1 method in interface two");
	}
}


public class MultipleInheritanceusingDefaultMethods implements Left,Right{
	
	public void m1()
	{
		//System.out.println("Overriding default method");
		//But if you want I1's m1() method implementation then
		Left.super.m1();
	}
	
	public static void main(String[] args)
	{
		MultipleInheritanceusingDefaultMethods d =new MultipleInheritanceusingDefaultMethods();
		d.m1();
	}

}
