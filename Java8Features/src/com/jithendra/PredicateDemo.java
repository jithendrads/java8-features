package com.jithendra;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args)
	{
		Predicate<String> p=s->s.length()>5;
		System.out.println(p.test("jithendra"));
	}
}
