package assignment4;

public class VotingEligible {
	
	public static boolean check(int a )
	{
		if (a>= 18)
		return (true); //boolean variable can accept true or false only value
		else
			return(false);
			
		
	}

	public static void main(String[] args) {
		
	boolean r =	check(25);
	
	if (r==true)
		System.out.println("Eligible for voting");
	else
		System.out.println("Ineligible for voting");

	}

}
