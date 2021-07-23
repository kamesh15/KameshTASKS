package Service;

import exception.InvalidCodeException;
import exception.countryNotfoundException;

public class Repository {
	public String getCountryName(String countryCode) throws InvalidCodeException,countryNotfoundException{ 
		
		String con=null;
		int cc=Integer.parseInt(countryCode);
		String cc1=countryCode;
		if(cc>=70&&cc<=99)
			 con="India";
		else if(cc==908)
			 con="US";
		else {	
	          try {
		            if(cc1=="011")
			           {throw new countryNotfoundException("Dial somewhere outside of USA");}
		            else
			           {throw new InvalidCodeException("No country with given code found");}
		           }
		      catch(countryNotfoundException e)
	               {
			       throw e;
	                }
	          catch(InvalidCodeException e1)
	               {
		           throw e1;
		           }
	
	}
		return con;
	
}}
