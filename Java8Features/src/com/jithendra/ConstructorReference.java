package com.jithendra;

class Sample
{
	Sample()
	{
		System.out.println("Sample class Constructor without arguments");
	}
	
	Sample(String s)
	{
		System.out.println("Sample class Constructor with arguments");
	}
}
interface I1
{
	public Sample get(String s);
	//public Sample get();
}


public class ConstructorReference {

	public static void main(String[] args) {

		I1 i1=Sample::new;
		Sample s1=i1.get("jithendra");
		//Sample s2=i1.get();

	}

}
