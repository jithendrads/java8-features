package com.jithendra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*class MyComparator implements Comparator<Integer>
{

	public int compare(Integer i1,Integer i2)
	{
		return (i1<i2)?-1:(i1>i2)?1:0;
		/*if(i1<i2)
			return -1;
		else if(i1>i2)
			return 1;
		else
			return 0;
			
	}
	
	
}
*/

public class LambdaWithCollection {

	public static void main(String[] args) {
		ArrayList<Integer> l=new ArrayList<Integer>();
		l.add(20);
		l.add(5);
		l.add(30);
		l.add(55);
		l.add(40);
		System.out.println(l);
		//Collections.sort(l);
		Comparator<Integer> c=(i1,i2)->(i1<i2)?-1:(i1>i2)?1:0;
		Collections.sort(l,c);
		System.out.println(l);
		l.stream().forEach(System.out::println);
		List<Integer> l2=l.stream().filter(a->a%2==0).collect(Collectors.toList());
		System.out.println(l2);

	}

}
