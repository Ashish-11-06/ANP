package abstractEx;

public abstract class Employee {
   
	abstract void attendance();
	abstract void salaryType();
	void pf()
	{
		System.out.println("Only for full timers");
	}
}
