package com.jithendra;

interface interf
{
	//public void m1();
	//public void add(int a,int b);
	public int squareIt(int a);
}

//Normal way of implementing interface

class Demo implements interf
{
	/*public void m1()
	{
		System.out.println("providing implementation for interface method");
	}
	
	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
	*/
	
	public int squareIt(int a)
	{
		return a*a;
	}
	
		

}


public class LambdaWithFunctionalInterface {
	
	public static void main(String[] args)
	{
		/*Normal way of implementing interface
	      Demo d=new Demo();
		  d.m1();
		  interf i=new Demo();
		  i.add(10, 20);
		
		interf i=new Demo();
		System.out.println(i.squareIt(2));
		//using lamda expression
		//interf i= ()->System.out.println("providing implemetion using lamda expresiion");
		//interf i=(a,b)->System.out.println("Sum is "+ (a+b));
		//i.m1();
		//i.add(10,20);
		*/
		
		interf i=new Demo();
		System.out.println(i.squareIt(2));
		//interf i=a->a*a;
		//System.out.println(i.squareIt(4));
		
	}

}
