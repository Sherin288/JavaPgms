package superkeyword;

public class SchoolChild extends SchoolParent{
	
	public void print()
	{
		System.out.println("I am inside school child class");
	}
	
	public void output()
	{
		print();
		super.print();
	}

	public static void main(String[] args) {
		
		SchoolChild sc = new SchoolChild();
		sc.output();
		

	}

}
