package encapsulation;

public class Student {

	private int a;
	private String name;
	
	public void setmethod1(int a)
	{
		this.a = a;
		
	}
	public void setmethod2(String name)
	{
		
		this.name = name;
		
	}
	
	public int getmethod1()
	{
		return a ;
	}
	
	public String getmethod2()
	{
		return name;
	}
}
