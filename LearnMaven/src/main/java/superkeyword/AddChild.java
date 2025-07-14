package superkeyword;

public class AddChild extends AddParent {
	
	
	AddChild()
	{
		super(10,20); // this super keyword calls the constructor of parent class
		System.out.println("I am inside child class");
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AddChild obj = new AddChild();

	}

}
