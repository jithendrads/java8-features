package com.jithendra;

public class MethodReference {

	/*public static void m1()
	{
		for(int i=0;i<10;i++)
			System.out.println("child thread-1");
	}*/
	
	public  void m1()
	{
		for(int i=0;i<10;i++)
			System.out.println("child thread-1");
	}
	public static void main(String[] args) {
		
		//Using Lamda Expression
		/*Runnable r=()->{
			for(int i=0;i<10;i++)
				System.out.println("Child thread");
		};
		*/
		//Referencing static method using classname
		//Runnable r=MethodReference::m1;
		
		//Referencing instance method using object refernce
		MethodReference m=new MethodReference();
		Runnable r=m::m1;
		Thread t=new Thread(r);
		t.start();
		
		for(int i=0;i<10;i++)
			System.out.println("main thread-1");

	}

}
