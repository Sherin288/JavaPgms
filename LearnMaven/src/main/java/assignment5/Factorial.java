package assignment5;

public class Factorial {
	
	int fact(int num)
	{
		int f =1;
		for(int i = 1; i<=num ; i++)
		{
			f = f*i;
		}
		
		return f;
	}

	void print(int num)
	{
		int result = fact(num);
		System.out.println("Factorial of "+ num +"= "  +result);
	}
	
		
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial f = new Factorial();
		f.print(5);
	}

}
