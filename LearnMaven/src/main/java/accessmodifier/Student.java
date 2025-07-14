package accessmodifier;

public class Student {

	private void display()
	{
		System.out.println("I am inside private method");
	}
	public static void main(String[] args) {
		
		Student s = new Student();
		s.display();

	}

}
