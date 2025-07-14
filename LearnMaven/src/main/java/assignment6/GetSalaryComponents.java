package assignment6;

public class GetSalaryComponents extends GetSalaryValue{
	
	double hra; // declared as instance vvariable os that other classes can access it
	double pf;// declared as instammce variable so that other classes can access it
	public void calculatecomponents()
	{
		 hra = basicpay * (0.05);
		 pf = basicpay * (0.20);
	}

}
