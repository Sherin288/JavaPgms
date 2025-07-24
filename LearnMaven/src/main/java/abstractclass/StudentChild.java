package abstractclass;

public class StudentChild extends StudentParent{
	
	public void print()//method overriding
	{
		System.out.println("I am inside child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentChild sc = new StudentChild();
		sc.display();
		sc.print();

	}

}
