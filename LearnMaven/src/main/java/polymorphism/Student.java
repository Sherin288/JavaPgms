package polymorphism;

public class Student {  //Complile time polymorphism
	
	public void display(int a , int b)
	{
		System.out.println("I am inside first method");
		System.out.println("a= " + a + " B= "+ b);
	}
	
	public void display(String name)
	{
		System.out.println("I am inside second method");
		System.out.println("Name =" + name);
	}
	
	public void display()
	{
		System.out.println("I am inside third method");
	}

	public static void main(String[] args) {
		
		Student s = new Student();
		s.display(10,20);
		s.display();
		s.display("Sherin");

	}

}
