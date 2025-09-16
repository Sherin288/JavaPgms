package test;

public class Heirachichalchild2 extends Heirachichalparent{
	
	public void printchild2()
	{
		System.out.println("I am inside child class 2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Heirachichalchild2 h2 =  new Heirachichalchild2();
		h2.print();
		h2.printchild2();
		
		Heirarchicalchild1 h1 = new Heirarchicalchild1();
		h1.print();
		h1.printchild1();
	}

}
