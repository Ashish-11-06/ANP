package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Arithmatic 
{
	public static void main(String []args) 
	{
		try{
			int a, b, c;
			Scanner sc = new Scanner(System.in);
			a = sc.nextInt();
			b = sc.nextInt();
			c = a/b;
			
			sc.close();
			
			System.out.println("a/b=" +c);
			}
		catch(ArithmeticException e)  
			{
			System.out.println("enter valid int");
			}
		catch(InputMismatchException f)  
			{
			System.out.println("enter valid input");
			}
		catch(Exception e) 
			{
			 System.out.println("error");
			}
	}
}
