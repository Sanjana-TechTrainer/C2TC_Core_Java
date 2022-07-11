/*
 * 1st July
 * User defined Exception Handling example
 *
 */
package tnsif.c2tc.b18.UserException;
import java.util.Scanner;

import tnsif.c2tc.b18.UserException.entities.InvalidAgeException;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int age=scanner.nextInt();
		try
		{
			validate(age);
			System.out.println("Welcome to Vote");
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
	}
	private static void validate(int age) throws InvalidAgeException{
		/*if (age<18)
		{
			System.out.println("The age is not valid");
		}
		else
		{
			System.out.println("Age is valid");
		}*/
		if(age<18)
		{
			//throw new InvalidAgeException("invalid age");
			throw new InvalidAgeException();
		}
		
	}

}
