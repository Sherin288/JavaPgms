package superkeyword;

public class StudentDetailsChild extends StudentParent{
	
	int age =50;
	
	public void display()
	{
		System.out.println("Age= "+ age);
		System.out.println("Age= " + super.age);//super keyword access the variable from parent class
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentDetailsChild s = new StudentDetailsChild();
		s.display();

	}

}
