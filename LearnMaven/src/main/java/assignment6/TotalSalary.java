package assignment6;

public class TotalSalary extends GetSalaryComponents {
	double salary;
	public void totsal()
	{
		 salary = basicpay + hra - pf - deduction+bonus;
	}
	
	public void display()
	{
		
		System.out.println("=========Salary Slip ===========");
		System.out.println("Basic Pay : " + basicpay);
		System.out.println("Deduction : " + deduction);
		System.out.println("HRA (5%) : " + hra);
		System.out.println("PF (20%) : " + pf);
		System.out.println("Bonus : " + bonus);
		System.out.println("--------------------------------------");
		System.out.println("Total Salary by hand " + salary);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TotalSalary ts = new TotalSalary();
		ts.salaryinput();
		ts.calculatecomponents();
		ts.totsal();
		ts.display();
		
	}

}
