package com.jithendra;

import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {
		String[] str=new String[10];
		str[5]="JAVA OPTIONAL CLASS EXAMPLE";
		
		Optional<String> empty=Optional.empty();
		System.out.println(empty);
		
		Optional<String> value=Optional.of(str[5]);
		//Optional<String> value1=Optional.of(str[6]);
		System.out.println(value);
		//System.out.println(value1);
		
		System.out.println("Filtered value "+value.filter(s->s.equals("JITHENDRA")));
		System.out.println(("Filtered value "+value.filter(s->s.equals("JAVA OPTIONAL CLASS EXAMPLE"))));
		
		System.out.println("getting value "+value.get());
		
		System.out.println("Is value present "+value.isPresent());
		value.ifPresent(System.out::println);
		
		System.out.println("Nullable optional "+Optional.ofNullable(str[5]).get());
		//System.out.println("Nullable optional "+Optional.ofNullable(str[6]).get());
		
		System.out.println("orElse "+value.orElse("Value not present"));
		System.out.println("orElse "+empty.orElse("Value not present"));

	}

}
