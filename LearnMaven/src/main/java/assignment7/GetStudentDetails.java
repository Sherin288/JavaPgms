package assignment7;

import java.util.Scanner;

public class GetStudentDetails {
	
	String name;
	int rollno;
	
	public void getstudentdetails()
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name:");
		name = sc.nextLine();
		System.out.println("Enter the Roll no ");
		rollno = sc.nextInt();
	
		
	}

}
