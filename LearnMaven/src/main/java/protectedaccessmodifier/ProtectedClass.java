package protectedaccessmodifier;

public class ProtectedClass {

	protected void display()
	{
		System.out.println("I am inside protected method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProtectedClass p = new ProtectedClass();
		p.display();
		
	}

}
