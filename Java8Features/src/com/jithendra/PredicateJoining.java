package com.jithendra;

import java.util.function.Predicate;

public class PredicateJoining {

	public static void main(String[] args) {

		int a[]= {0,5,10,15,20,25,30,35,40,45,50};
		Predicate<Integer> p1=i->i%2==0;
		Predicate<Integer> p2=j->j>10;
		//and(),or(),negate()
		System.out.println("The numbers which are both even and >10 are");
		for(int i:a)
		{
			if(p1.and(p2).test(i))
			{
				System.out.println(i);
			}
		}
		
		System.out.println("The numbers which are both even or >10 are");
		for(int i:a)
		{
			if(p1.or(p2).test(i))
			{
				System.out.println(i);
			}
		}

		
		System.out.println("The numbers which are  even  are");
		for(int i:a)
		{
			if(p1.test(i))
			{
				System.out.println(i);
			}
		}
		
		System.out.println("The numbers which are not even  are");
		for(int i:a)
		{
			if(p1.negate().test(i))
			{
				System.out.println(i);
			}
		}
	}

}
