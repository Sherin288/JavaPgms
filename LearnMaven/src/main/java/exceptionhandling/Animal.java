package exceptionhandling;

public class Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			int a[] = new int[4];
			System.out.println(a[6]);
			a[6]= 10/0;          // the first catch block where exception first occurs will be executed if there are multiple catch block
			System.out.println(a[6]);
			System.out.println("Testing...."); //this statement will not get executed since already an exception occurred
			
		}
		
		catch(ArrayIndexOutOfBoundsException b)
		{
			System.out.println("This is inside second catch block");
			System.out.println(b);
		}
		
		catch(Exception a)
		{
			System.out.println("This is inside first catch block");
			System.out.println(a);
		}
		
		

	}

}
