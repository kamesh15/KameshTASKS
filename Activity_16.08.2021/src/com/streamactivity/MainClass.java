package com.streamactivity;

import java.util.Arrays;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		
		int total =0;
		
		List <Employee> employees = Arrays.asList(new Employee(1, 1000,"Chandra Shekhar", 6000),
			   new Employee(1, 1000, "Rajesh", 8000), 
			   new Employee(1, 1004,"Rahul", 9000), 
			   new Employee(1, 1001, "Suresh", 12000),
			   new Employee(1, 1004, "Satosh", 8500));
			   
			  
			  for(Employee e: employees )
			  {
				  total=total+e.getSalary();
			  }
			  System.out.println("Using for each normal method.......");
			  System.out.println(total+"\n");
			  
			
			  total=employees.stream().mapToInt(Employee -> Employee.getSalary()).sum();
			  
			  System.out.println("Using With Stream API and Lambda Expression .......");
			  System.out.println(total);

	}

}
