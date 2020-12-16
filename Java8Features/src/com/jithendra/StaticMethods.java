package com.jithendra;

interface Istatic
{
	public static void m1()
	{
		System.out.println("Static method in Interface");
	}
}

class StaticMethods implements Istatic {

	public static void main(String[] args) {
		//different ways of calling static method of interface
		Istatic.m1();
		//m1();
		//StaticMethods.m1();
		//StaticMethods s=new StaticMethods();
		//s.m1();
	

	}

}
