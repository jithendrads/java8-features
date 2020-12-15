package com.jithendra;

/*class MyRunnable implements Runnable
{

	@Override
	public void run() {
		for(int i=0;i<10;i++)
		{
			System.out.println("Child Thread");
		}
		
		
		
		
	}
	
}
*/


public class LambdaWithMultithreading {

	public static void main(String[] args) {
		//at this point only one thread present ie Main thread
		//MyRunnable r=new MyRunnable();
		Runnable r=()-> {
			for(int i=0;i<10;i++)
			{
				System.out.println("Child Thread-1");
			}
		};
		Thread t=new Thread(r);
		t.start();
		// at this point we have 2 threads one is main and other is child
		
		for(int i=0;i<10;i++)
		{
			System.out.println("Main thread-1");
		}
		

	}

}
