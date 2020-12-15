package com.jithendra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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
		l.add(10);
		l.add(30);
		l.add(50);
		l.add(40);
		System.out.println(l);
		//Collections.sort(l);
		Comparator<Integer> c=(i1,i2)->(i1<i2)?-1:(i1>i2)?1:0;
		Collections.sort(l,c);
		System.out.println(l);

	}

}
