package assignment7;

public class GetStudentDetails {
	
	String name;
	int rollno;
	
	GetStudentDetails(String name, int rollno)
	{
		this.name = name;
		this.rollno = rollno;
	}
	
	public void print()
	{
		System.out.println("Name = "+ name);
		System.out.println("Roll No = "+ rollno);
	}

}
