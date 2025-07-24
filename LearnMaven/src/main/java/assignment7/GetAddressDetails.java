package assignment7;

public class GetAddressDetails {
	
	String street;
	String state;
	GetStudentDetails gs;
	
	GetAddressDetails(String street , String state ,GetStudentDetails gs)
	{
		this.street=street;
		this.state = state;
		this.gs= gs;
	}
	
	
	public void display()
	{
			
        gs.print();
        System.out.println("Address   : " + street);
        System.out.println("state :" + state);
       
	}
	
}
