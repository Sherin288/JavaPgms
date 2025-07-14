package assignment6;

public class AddChild extends AddParent{

	public   void divbyten()
	{
		int num = addition(10,20);
		if ((num%10)==0)
		{
			System.out.println(num + " is divisible by 10");
		}
		else
			System.out.println(num + " is not divisible by 10");
	}
	public static void main(String[] args) {
		
		AddChild ac = new AddChild();
		ac.divbyten();

	}

}
