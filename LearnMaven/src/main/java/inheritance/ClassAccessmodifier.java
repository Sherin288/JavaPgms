package inheritance;

import publicaccessmodifier.Animal;

public class ClassAccessmodifier {

	public void print()
	{
		System.out.println("I am inside method to learn access modifier outside package");
	}

	public static void main(String[] args) {
		
		Animal a = new Animal();
		a.display();
		ClassAccessmodifier c = new ClassAccessmodifier();
		c.print();
		

	}

}
