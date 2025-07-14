package defaultaccessmodifier;

public class Students {
	
	void print()
	{
		System.out.println("I am inside default method");
	}

	public static void main(String[] args) {
		
		Students s1 = new Students();
		s1.print();

	}

}
