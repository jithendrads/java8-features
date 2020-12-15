package com.jithendra;

public class AnonymousToLambdaConversion {

	public static void main(String[] args) {
		//By Anonymous inner class
		/*Runnable r=new Runnable()
				{
					public void run()
					{
						for(int i=0;i<10;i++)
						{
							System.out.println("Child thread");
						}
					}
				};
				*/
		//By Lambda Expression
		Runnable r=()->{
			for(int i=0;i<10;i++)
				System.out.println("child class");
		};
				
		Thread t=new Thread(r);
		t.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("Main thread");
		}

	}

}
