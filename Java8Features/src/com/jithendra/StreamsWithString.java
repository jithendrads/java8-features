package com.jithendra;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsWithString {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Cheteshwar Pujara");
		al.add("Mayank Agarwal");
		al.add("Virat Kohli");
		al.add("Kohli virat");
		al.add("Ajinkya Rahane");
		al.add("Ashwin Ramachandra");
		
		List<String> ascendingSortedList=al.stream().sorted().collect(Collectors.toList());
		System.out.println(ascendingSortedList);
		
		List<String> descendingSortedList=al.stream().sorted((s1,s2)->s2.compareTo(s1)).collect(Collectors.toList());
		System.out.println(descendingSortedList);
		
		List<String> increasinglengthSortedList=al.stream().sorted((s1,s2)->(s1.length()<s2.length())?-1:(s1.length()>s2.length())?1:s1.compareTo(s2)).collect(Collectors.toList());
		System.out.println(increasinglengthSortedList);
		

	}

}
