package exception;

public class Ex2 {
	
	// A method that might throw an ArithmeticException
    public static int divide(int dividend, int divisor) 
    {
        return dividend / divisor;
    }


    @SuppressWarnings("null")
	public static void main(String[] args) 
    {
//------------------------------------------------------------------------------
    
        
                try 
                	{
                    // Scenario 1: Arithmetic Exception
                    int result = divide(10, 0); // Division by zero will throw ArithmeticException
                    System.out.println("Result: " + result); // This line won't be executed if an exception occurs
                	} 
                	catch (ArithmeticException e) 
                	{
                    // Handling ArithmeticException
                    System.out.println("Arithmetic Exception: " + e.getMessage());
                	}

                try 
                	{
                    // Scenario 2: ArrayIndexOutOfBoundsException
                    int[] arr = {1, 2, 3};
                    System.out.println(arr[3]); // Accessing index out of bounds will throw ArrayIndexOutOfBoundsException
                	} 
                	catch (ArrayIndexOutOfBoundsException e) {
                    // Handling ArrayIndexOutOfBoundsException
                    System.out.println("Array Index Out Of Bounds: " + e.getMessage());
                	}

                try 
                	{
                    // Scenario 3: NullPointerException
                    String str = null;
                    System.out.println(str.length()); // Calling a method on a null object will throw NullPointerException
                	} catch (NullPointerException e) {
                    // Handling NullPointerException
                    System.out.println("Null Pointer Exception: " + e.getMessage());
                	}

                try 
                	{
                    // Scenario 4: Custom Exception
                    int age = -1;
                    if (age < 0) {
                        throw new IllegalArgumentException("Age cannot be negative"); // Throwing a custom exception
                    }
                	} catch (IllegalArgumentException e) {
                    // Handling custom exception
                    System.out.println("Illegal Argument: " + e.getMessage());
                	}
                
                finally {
                    // Optional finally block for cleanup
                    System.out.println("Finally block always gets executed, regardless of exceptions.");
                }
//---------------------------------------------------------------------------------------------------------------------------------------------            
System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");
                

//exception handles by a single catch

				try 
                  {
                    //  Arithmetic Exception
                    int result = divide(10, 0); // Division by zero will throw ArithmeticException
                    System.out.println("Result: " + result); // This line won't be executed if an exception occurs

                    //  ArrayIndexOutOfBoundsException
                    int[] arr = {1, 2, 3};
                    System.out.println(arr[3]); // Accessing index out of bounds will throw ArrayIndexOutOfBoundsException

                    //  NullPointerException
                    String str = null;
                    System.out.println(str.length()); // Calling a method on a null object will throw NullPointerException

                    //  Custom Exception
                    int age = -1;
                    if (age < 0) 
                    {
                        throw new IllegalArgumentException("Age cannot be negative"); // Throwing a custom exception
                    }
                 }
                	catch (ArithmeticException e) 
                		{
                		// Handling ArithmeticException
                		System.out.println("Arithmetic Exception: " + e.getMessage());
                		}
                	catch (ArrayIndexOutOfBoundsException e) 
                		{
                		// Handling ArrayIndexOutOfBoundsException
                		System.out.println("Array Index Out Of Bounds: " + e.getMessage());
                		} 		
                	catch (NullPointerException e) 
                		{
                		// Handling NullPointerException
                		System.out.println("Null Pointer Exception: " + e.getMessage());
                		} 
                	catch (IllegalArgumentException e) 
                		{
                    // Handling custom exception
                    System.out.println("Illegal Argument: " + e.getMessage());
                		} 
                    
        

    }

}
