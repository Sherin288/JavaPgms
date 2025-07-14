package assignment4;

public class Paliandrome {

	public static int reverse(int n)
	{
		int r = 0;
		int v = 0;
		while(n> 0)
		{
			r = n%10; // get last digit
			v = v *10 + r; // Build reverse number
			n= n/10; // remove last number
		}
		
		System.out.println("Reverse Number= " + v);
		
		return v;
	}
	
	public static void paliandrome(int n)
	{
		int reverse = reverse(n);
		if (n==reverse )
		{
			System.out.println("Number is paliandrome");
		}
		else
		{
			System.out.println("Number is not paliandrome");
		}
	}
	public static void main(String[] args) {
		
		
		paliandrome(5022);
		paliandrome(5005);

	}

}
