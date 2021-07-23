package test;

import declaration.Employee;
import service.Empimpl;

public class Emptest {

	public static void main(String[] args) {
		Empimpl e=new Empimpl();
		System.out.println("THE EMPLOYEE DETAILS: "+e.getEmployeeInfo("abc@4356-uuuii#98"));
		System.out.println("THE EMPLOYEE LEVEL: "+e.getEmployeeLevel(new Employee("abc","4356","uuuii",9889)));
	}

}
