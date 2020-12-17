package com.jithendra;
import java.util.function.Consumer;

class Movie
{
	String name;
	
	Movie(String name)
	{
		this.name=name;
	}
}
public class ConsumerChaining {

	public static void main(String[] args) {
		Consumer<Movie> c1= m->System.out.println(m.name+" ready to release");
		Consumer<Movie> c2= m->System.out.println(" on jan 1st");
		Consumer<Movie> c3=m->System.out.println("Tickets are available for booking");
		
		Movie m=new Movie("abc");
		c1.accept(m);
		c2.accept(m);
		c3.accept(m);
		
		System.out.println("using consumer chaining");
		c1.andThen(c2).andThen(c3).accept(m);

	}

}
