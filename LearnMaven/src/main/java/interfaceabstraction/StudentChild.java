package interfaceabstraction;

public class StudentChild implements StudentParent{ //implemets is used for interface
	
	public void display()
	{
		System.out.println("I am inside overrided method in interface child");
	}

	public static void main(String[] args) {
		
		
		StudentChild sc = new StudentChild();
		sc.display();

	}

}
