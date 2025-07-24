package assignment8;

public class HDFC implements RBI{
	
	double amt = 10000;
	int dur = 5;
	
	public void input()
	{
		
		System.out.println("Amount = "+ amt );
		System.out.println("Duration =" + dur);
		
	}
	
	public void amount()
	{
		double rdamt = amt + (amt *dur*roi);
		System.out.println("RD Amount =" + rdamt);
		
	}

	public static void main(String[] args) {
		
		HDFC hd = new HDFC();
		hd.input();
		hd.amount();
		

	}

}
