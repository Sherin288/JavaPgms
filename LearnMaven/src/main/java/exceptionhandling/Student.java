package exceptionhandling;

public class Student {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
		int num = 10;
		float result = num/0;
		System.out.println("Result="+ result);
		
	     }
		catch(ArithmeticException e) // here any variable can be used instead of e
		{
			System.out.println(e);   //catch block will execute only if try catch is there both exist together
			                         //we can use multiple catch with single try block
		}
		
		finally {   // finally also executes only if try block is there , but to handle exception we need catch block
			
			System.out.println("This is an arithmetic exception");
		}
		

}}
