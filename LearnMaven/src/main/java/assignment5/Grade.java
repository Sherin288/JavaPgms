package assignment5;

public class Grade {
	
	 Grade(int a , int b, int c)
	{
		 int total = a +b+c;
		 
		 if(total>=90)
		 {
			 System.out.println("A Grade");
		 }
		 else if(total>=80)
		 {
			 System.out.println("B Grade");
		 }
		 else if(total>=70)
		 {
			 System.out.println("C Grade");
		 }
		 else if(total>=50)
		 {
			 System.out.println("D Grade");
		 }
		 else if(total<35)
		 {
			 System.out.println("Fail");
		 }
		 
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Grade g1= new Grade(25,50,30);
		
		
	}

}
