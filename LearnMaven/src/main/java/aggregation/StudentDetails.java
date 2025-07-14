package aggregation;

public class StudentDetails {
	
	int age;
	String name;
	School s;
	
	StudentDetails(int age , String name , School s)
	{
		this.age= age;
		this.name= name;
		this.s= s;
	}
	
	public void newdisplay()
	{
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("Printing values from school classs");
		s.show();
	}

	public static void main(String[] args) {
		
		School c2 =  new School(50,"Hello");
	
		StudentDetails c1 = new StudentDetails(25, "Sherin",c2);
		
		c1.newdisplay();

	}

}
