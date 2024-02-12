package inheritance;

public class Main {
	
	public static void main(String []args)
	
	{
		
		Fiat f1 = new Fiat();
		f1.seats();
		f1.start();
		f1.stop();
		
		Audi a1 = new Audi();
		a1.start();
		a1.stop();
		a1.seats();
		
		BMW ob1 = new BMW();
		ob1.ac();
		ob1.start();//use this bye bmw
		ob1.stop();
		ob1.seats();// we can use this by parent i.e Fiat
		
		BMW_adv bd1 = new BMW_adv();
		bd1.ac();
		bd1.start();
		bd1.stop();
		bd1.seats();
		bd1.roof_Top_Open();
		
		
	}
	
	
		
}
