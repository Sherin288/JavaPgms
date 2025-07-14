package finalkeyword;

public class Animals {

	// String name = "Dog";
	
	final String name = "Dog";
	
	//name = "Squirrel";
	public void display()
	{
		//name = "Cat";// final variable cannot be reinitialized
		
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		
		Animals obj = new Animals();
		obj.display();
	}
}

