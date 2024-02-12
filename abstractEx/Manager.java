package abstractEx;

public  class Manager extends Employee {

	@Override//annotation
	void attendance() {
		System.out.println("8 hrs daily*5 days weeky");
	}

	@Override
	void salaryType() {
		System.out.println("Montly basis");
	}
   
	void leaveType()
	{
		System.out.println("CL,SL applicable");
	}
	
}
