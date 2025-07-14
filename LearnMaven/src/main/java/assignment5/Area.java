package assignment5;

public class Area {

	Area(double r)
	{
		double a = 3.14*r*r;
		System.out.println("Area of Circle= "+ a);
		
	}
	Area(double l, double b)
	{
		double a = l*b;
		System.out.println("Area of rectangle= "+ a);
		
	}
	
	Area(int a1)
	{
		double a = a1*a1;
		System.out.println("Area of square= "+ a);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Area a1= new Area(5.2);
		Area a2 = new Area(10.5,15.5);
		Area a3 = new Area(5);
		
	}

}
