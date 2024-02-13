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
			
			System.out.println("a/b = " +c);
			}
//		catch(ArithmeticException e)  
//		{
//		System.out.println("enter valid integer");
//		}
//		catch(InputMismatchException e)
//		{
//		System.out.println("enter valid input");
//		}
		catch(InputMismatchException | ArithmeticException e)  
		{
		System.out.println("enter valid input :" + e.getMessage());
		}

		catch(Exception e) 
			{
			 System.out.println("error");
			}
	}
}
