package test;

public class AnimalChild implements Animal , AnimalDog{
	
	public void display()
	{
		System.out.println("I am inside overided method from interface1");
	}
	
	public void print()
	{
		System.out.println("I am inside overided method from interface2");
	}
	
	public void show()
	{
		System.out.println("I am inside instance method of child class");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnimalChild Animal = new AnimalChild();
		Animal.display();
		Animal.print();
		Animal.show();
	}

}
