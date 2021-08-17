package com.streamactivity;

public class Employee {
	
	
		 private int id;
		 private int deptId;
		 private String name;
		 private int salary;

		 public Employee(int id, int deptId, String name, int salary) {
		  super();
		  this.id = id;
		  this.deptId = deptId;
		  this.name = name;
		  this.salary = salary;
		 }

		public int getId() {
			return id;
		}

		

		public int getDeptId() {
			return deptId;
		}

		

		public String getName() {
			return name;
		}

		

		public int getSalary() {
			return salary;
		}

		

		@Override
		public String toString() {
			return "Employee [id=" + id + ", deptId=" + deptId + ", name=" + name + ", salary=" + salary + "]";
		}
		
		
}


