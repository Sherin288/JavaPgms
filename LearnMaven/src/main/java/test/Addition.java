package test;

public class Addition {
	
	int a , b;
	
	public Addition(int a , int b)
	{
		
		this.a = a;// value of local variable is assigned to instance variable.
		this.b = b;

		
	}
	
	public int addition()
	
	{
		return a+b ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Addition add = new Addition(10,20);
		int c = add.addition();
		System.out.println(c);

	}

}
