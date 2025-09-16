package test;

public class Aggrec2 {
	
	int age;
	String name;
	Aggrec1 a1;
	
	Aggrec2(int age , String name , Aggrec1 a1)
	{
		this.age = age;
		this.name = name;
		this.a1=a1;
	}
	
	
	public void display()
	{
		System.out.println(age);
		System.out.println(name);
		a1.display1();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aggrec1 x = new Aggrec1("Hello","World");
		Aggrec2 y = new Aggrec2(25,"Anu",x);
		y.display();
		

	}

}
