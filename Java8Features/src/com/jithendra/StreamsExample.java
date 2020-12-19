package com.jithendra;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExample {

	public static void main(String[] args) {
		ArrayList<Integer> marks=new ArrayList<Integer>();
		marks.add(50);
		marks.add(35);
		marks.add(70);
		marks.add(25);
		marks.add(30);
		System.out.println("List of all marks");
		System.out.println(marks);
		System.out.println();
		
		System.out.println("To print even marks");
		List<Integer> newList=marks.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(newList);
		System.out.println();
		
		System.out.println("Adding 5 grace marks to every students");
		List<Integer> updatedMarks=marks.stream().map(i->i+5).collect(Collectors.toList());
		System.out.println(updatedMarks);
		System.out.println();
		
		System.out.println("Adding 5 grace marks to failed students");
		List<Integer> graceMarks=marks.stream().filter(i->i<=35).map(i->i+5).collect(Collectors.toList());
		System.out.println(graceMarks);
		System.out.println();
		
		System.out.println("Count the number of failed students");
		int noOfFailedStudents=(int)marks.stream().filter(i->i<=35).count();
		System.out.println(noOfFailedStudents);
		System.out.println();
		
		System.out.println("Sorted Marks in ascending order");
		List<Integer> sortedMarksInAscending=marks.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedMarksInAscending);
		System.out.println();
		
		System.out.println("Sorted Marks in descending order");
		List<Integer> sortedMarksInDescending=marks.stream().sorted((i1,i2)->(i1<i2)?1:(i1>i2)?-1:0).collect(Collectors.toList());
		System.out.println(sortedMarksInDescending);
		System.out.println();
		
		System.out.println("Sorted Marks in ascending order using compareTo() method");
		List<Integer> naturalSortingusingCompareTo=marks.stream().sorted((i1,i2)->i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println(naturalSortingusingCompareTo);
		System.out.println();
		
		System.out.println("Sorted Marks in descending order using compareTo() method");
		List<Integer> descendingSortingusingCompareTo=marks.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
		System.out.println(descendingSortingusingCompareTo);
		System.out.println();
		
		System.out.println("Sorted Marks in descending order using compareTo() method (another technique)");
		List<Integer> descendingSortingusingCompareTo1=marks.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println(descendingSortingusingCompareTo1);
		System.out.println();
	

	

	}

}
