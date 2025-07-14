package assignment6;

import java.util.Scanner;

public class GetSalaryValue {
	
	double basicpay , deduction, bonus;
	public void salaryinput()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the basic pay , desuction and bonus ");
		basicpay = sc.nextDouble();
		deduction = sc.nextDouble();
		bonus = sc.nextDouble();
	}

}
