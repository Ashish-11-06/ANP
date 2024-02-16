package fnl;

import java.util.*;

class One
{
	void aOne() 
	{
		System.out.println("AOne-base");
	}
	final void bOne()
	{
		System.out.println("BOne-base");
	}
}
public class FinalEx extends One
	{
      void aOne()
      {
    	  System.out.println("AOne-derived");
      }
      //final method overridden not possible --compile time error
//		      void bOne()
//		      {
//		    	  System.out.println("BOne-derived");
//		      }
      public static void main(String[] args) 
      {
    	  
	  FinalEx f = new FinalEx();
	  f.aOne();
	  f.bOne();//final method calling possible
			//final variable
			final int AGE;
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter age");
	        AGE=sc.nextInt();
	        int a=AGE;
	        a++;
	        System.out.println(a);
			
			sc.close();
        }

	}