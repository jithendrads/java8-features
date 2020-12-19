package com.jithendra;

import java.util.ArrayList;

public class MinAndMaxInStream {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(0);
		al.add(15);
		al.add(5);
		al.add(20);
		System.out.println(al);
		//min() and max() in ascending order
		Integer min=al.stream().min((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(min);
		Integer max=al.stream().max((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(max);
		
		//min and max in descending order
		Integer min1=al.stream().min((i1,i2)->i2.compareTo(i1)).get();
		System.out.println(min1);
		Integer max1=al.stream().max((i1,i2)->i2.compareTo(i1)).get();
		System.out.println(max1);
		

	}

}
