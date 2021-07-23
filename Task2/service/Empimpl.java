package service;

import declaration.Employee;

public class Empimpl implements Empinterface {
	
	public String getEmployeeInfo(String str)
	{
	
		String name=str.substring(0,str.indexOf("@"));
	    
		String ssn=str.substring(str.indexOf("@")+1, str.indexOf("-"));
	
		String dept=str.substring(str.indexOf("-")+1,str.indexOf("#"));
		
		String salary=str.substring(str.indexOf("#")+1, str.length());
		
	    Employee employee=new Employee(name,ssn,dept,Integer.parseInt(salary));
	    String s=employee.toString();
		return s;

	}

	public String getEmployeeLevel(Employee e)
	{
		int ssn=Integer.parseInt(e.getSsn());
		String level="";
		if(ssn>=1 && ssn<=10)
			level="L1";
		else if(ssn>=61 && ssn<=120)
			level="L2";
		else if(ssn>=121 && ssn<=180)
			level="L3";
		else 
			level="L4";
		return level;
	}
	
}
