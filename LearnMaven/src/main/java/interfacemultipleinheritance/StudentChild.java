package interfacemultipleinheritance;

public class StudentChild implements StudentdetailsParent, StudentParent{ //multiple inheritance 
	
	public void display() //method overriding
	{
		System.out.println("I am inside 1 st instance method");
	}
	 
	public void print()//method overriding
	{
		System.out.println("I am inside 2nd instance method");
	}
	
	public void student(String name)
	{
		System.out.println("Student name = " + name);
	}

	public static void main(String[] args) {
		
		StudentChild sc = new StudentChild();
		sc.display();
		sc.print();
		sc.student("Anu");
		

		
	}

}
