package superEX;


		class Animal 
		{
		    void eat() 
		    {
		        System.out.println("Animal is eating");
		    }
		}
	
		class Dog extends Animal 
		{
		    void eat() 
		    {
		    	super.eat();
	//	        System.out.println("Dog is eating");
		    }
		}
	
		class Labrador extends Dog 
		{
		    void eat() 
		    {
		    	super.eat();
	//	        System.out.println("Labrador is eating");
		    }
		}

//	super keywords goes to the base class 
public class Sup 
	{
		public static void main(String []args) 
		{
			
		  Labrador l = new Labrador();
		  l.eat();
		  
		}
	

	}
