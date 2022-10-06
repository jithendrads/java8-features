package java8programs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Java8EmpDemo {
	
	public static void main(String[] args)
	{
		List<Employee> empList=new ArrayList<Employee>();
		empList.add(new Employee(1, 500));
		empList.add(new Employee(2, 100));
		empList.add(new Employee(3, 600));
		empList.add(new Employee(4, 400));
		empList.add(new Employee(5, 200));
		empList.add(new Employee(6, 900));
		empList.add(new Employee(7, 300));
		
		//Given an Employee List, sort employees based on salaries in desc order
		System.out.println(empList.stream().sorted((o1,o2)->(int)(o2.getSalary()-o1.getSalary())).collect(Collectors.toList()));
		
		//Fetch 3 top salaried employees
		System.out.println(empList.stream().sorted((o1,o2)->(int)(o2.getSalary()-o1.getSalary())).limit(3).collect(Collectors.toList()));
		
		//Fetch all employees having salary less than 3rd highest salary
		System.out.println(empList.stream().sorted((o1,o2)->(int)(o2.getSalary()-o1.getSalary())).skip(3).collect(Collectors.toList()));
		
}
}
