package assignment8;

public class Contractor extends Employee{

	int hr = 12 ;
	int valperhr = 200;
	
	
	public void calculatesalary() {
		
		if(hr>=8)
		{
			System.out.println("Salary of full time employee is " + (hr*valperhr));
		}
		else
		{
			System.out.println("Salary of part time employee is " + (hr*valperhr));

		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Contractor c = new Contractor();
		c.calculatesalary();

	}

}
