package polymorphism;

public class RuntimepolyChild extends RuntimepolyParent{

	public void display(String name , int age)
	{
		System.out.println("I am inside child class");
		System.out.println("Name =" + name);
		System.out.println("Age = " + age);
		super.display("Hello", 105);
		
	}
	
	public static void main(String[] args) {
		
		RuntimepolyChild c1 = new RuntimepolyChild();
		c1.display("Sherin", 25);
		RuntimepolyParent c2 = new RuntimepolyChild();
		c2.display("Anu", 20);
		
		
		
	}
}
