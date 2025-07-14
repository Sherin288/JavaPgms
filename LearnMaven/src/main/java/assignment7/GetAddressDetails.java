package assignment7;

import java.util.Scanner;

public class GetAddressDetails {
	
	String street;
	String city;
	String state;
	int pincode;
	
	public void getaddress()
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the Street :");
		street = sc1.nextLine();
		System.out.println("Enter the City :");
		city = sc1.nextLine();
		System.out.println("Enter the State :");
		state = sc1.nextLine();
		System.out.println("Enter the Pincode :");
		pincode = sc1.nextInt();
		
	}
	
	public void display(GetStudentDetails gs) // aggregation concept
	{
		System.out.println("Student Name = " + gs.name);
        System.out.println("Roll No   : " + gs.rollno);
        System.out.println("Address   : " + street + ", " + city + ", " + state + " - " + pincode);
	}

	
}
