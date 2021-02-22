package com.jithendra;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ForEachInStream {

	public static void main(String[] args) {
		ArrayList<Integer>al=new ArrayList<Integer>();
		al.add(10);
		al.add(0);
		al.add(15);
		al.add(5);
		al.add(20);
		System.out.println(al);
		Consumer<Integer> c=i->System.out.println("The square of "+i+" is"+(i*i));
		al.stream().forEach(System.out::println);
		al.stream().forEach(c);;

	}

}
