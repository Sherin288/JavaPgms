package assignment4;

public class Factorial {
	
	public static void result(int f)
	{
		int k= 1;
		for(int i=1 ; i<=f ; i++)
		{
		 k = k * i;
			
		}
		
		System.out.println("Factorial of " + f + " is " + k);
	}

	public static void main(String[] args) {
		
		result(10);
		
		

	}

}
