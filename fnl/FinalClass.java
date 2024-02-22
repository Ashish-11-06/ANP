package fnl;


class Onee{
	
}

final class Two{
	
}
//final class cannot be inherited

//			public class FinalClass extends Two
//			{
//			     
//				public static void main(String[] args) {
//					        
//			  @SuppressWarnings("unused")
//			One o1= new One();//can create object in another class
//				}

public class FinalClass extends Onee//One
{
     
	public static void main(String[] args) {
		        
  @SuppressWarnings("unused")
Onee o1= new Onee();//can create object in another class
	}

}