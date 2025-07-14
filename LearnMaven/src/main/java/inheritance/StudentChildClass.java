package inheritance;

public class StudentChildClass extends StudentDetails{ // single inheritance
	
	public void classdetail()
	{
		System.out.println("Study in Grade2 ");
	}

	public static void main(String[] args) {
		
		StudentChildClass obj = new StudentChildClass(); // always create object for child class
		
		obj.display();
		obj.classdetail();

	}

}
