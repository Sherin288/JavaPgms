package heirarchicalinheritance;

public class Dog extends Animal{
	
	public void text()
	{
		System.out.println("I am inside dog child class");
	}
	
	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.text();      //Animal parent class is inherited by Cat and Dog child class
		d.display();  //But Cat and Dog child class does not have any relation . hence cannot use object from dog to call functions of cat class and viceversa
		Cat c = new Cat();
		c.print();
		c.display();
	}

}
