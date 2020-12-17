package com.jithendra;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Student1
{
	String name;
	int marks;
	
	Student1(String name,int marks)
	{
		this.name=name;
		this.marks=marks;
	}
}

public class ConsumerExample {

	public static void main(String[] args) {
		
		Function<Student1,String> f3=s->{
			String grade="";
			if(s.marks>=80)
				grade="A";
			else if(s.marks>=60)
				grade="B";
			else if(s.marks>=50)
				grade="C";
			else if(s.marks>=35)
				grade="D";
			else grade="E";
			return grade;
		};
		
		Predicate<Student1> p1=s1->s1.marks>=60;
	
		Consumer<Student1> c=s->{
			System.out.println("Student name is :"+s.name);
			System.out.println("Student marks is :"+s.marks);
			System.out.println("Student grade is :"+f3.apply(s));
			System.out.println();
		};
		
		Student1[] s1= {new Student1("Shewag",100),
				new Student1("Dravid",10),
				new Student1("Dhoni",90),
				new Student1("anil kumble",20),
				new Student1("Irfan patan",80)};
		


		for(Student1 temp:s1)
		{
			if(p1.test(temp))
				c.accept(temp);
		}

	}

}
