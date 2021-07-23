package Test;

import java.util.Scanner;

import Service.Repository;
import exception.InvalidCodeException;
import exception.countryNotfoundException;

public class RepositoryTest {

	public static void main(String[] args) throws InvalidCodeException,countryNotfoundException {
		Repository r=new Repository();
		System.out.println("enter the code......");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();		
		System.out.println(r.getCountryName(s));

	}

}
