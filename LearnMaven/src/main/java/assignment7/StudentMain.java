package assignment7;

public class StudentMain {

	public static void main(String[] args) {
		
		GetStudentDetails gs1 = new GetStudentDetails("Sherin" , 25);
		
		
		GetAddressDetails ga = new GetAddressDetails("Ernakulam","Kerala",gs1);
		
		ga.display();
		
		

	}

}
