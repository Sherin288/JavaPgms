package assignment4;

public class Discount {
	
	public static float amount(int p1, int p2 , int p3 )
	{
		int total= p1+p2+p3;
		
		if (total >5000)
		{
			float x = total - (total * (20.0f/100)); // here 20.0f should be used otherwise divison will not happen properly
			return(x);
			
		}
		
		else
		{
			return (total);
			
			
		}
	}

	public static void main(String[] args) {
	
		float amount = amount(500,2500,3500);
		
		System.out.println("Total amount is: "+ amount);

	}

}
