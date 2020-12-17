package com.jithendra;
import java.util.function.*;
class Student
{
	String name;
	int marks;
	
	Student(String name,int marks)
	{
		this.name=name;
		this.marks=marks;
	}
}


public class FunctionExample {

	public static void main(String[] args) {
		Function<Integer,Integer> f=i->i*i;
		System.out.println("Square of 4 is "+f.apply(4));
		
		Function<String,Integer> f1=s->s.length();
		System.out.println("Length of the string Jithendra is "+f1.apply("Jithendra"));
		
		Function<String,String> f2=s->s.toUpperCase();
		System.out.println("The uppercase string of Jithendra is "+f2.apply("Jithendra"));
		
		Function<Student,String> f3=s->{
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

		Student[] s= {new Student("Shewag",100),
					new Student("Dravid",10),
					new Student("Dhoni",90),
					new Student("anil kumble",20),
					new Student("Irfan patan",80)};
		
		Predicate<Student> p1=s1->s1.marks>=60;
		
		for(Student temp:s)
		{
			if(p1.test(temp))
			System.out.println(temp.name+" :"+temp.marks+ " : "+f3.apply(temp));
		}
	}

}
