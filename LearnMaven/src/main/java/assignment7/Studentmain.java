package assignment7;

public class Studentmain {

	public static void main(String[] args) {
		
		GetStudentDetails gs1 = new GetStudentDetails();
		gs1.getstudentdetails();
		
		GetAddressDetails ga = new GetAddressDetails();
		ga.getaddress();
		ga.display(gs1);
		
		

	}

}
