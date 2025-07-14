package assignment5;

public class Average {

	Average(int x, int y,int z)
	{
		System.out.println("Average of interger numbers ="+((x+y+z)/3));
		
	}
	Average(double x, double y,double z)
	{
		System.out.println("Average of float numbers =" + ((x+y+z)/3));
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Average a1 = new Average(50,40,60);
		Average a2 = new Average(55.0,75.5,25.6);

	}

}
