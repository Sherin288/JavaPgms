package exceptionhandling;

public class ThrowsExample {

	public static void main(String[] args) throws VotingException{ // for declaring throws is used
		int age = 12;
		
		if (age > 12)
		{
			System.out.println("Eligible for voting");
		}
		else
		{
			throw new VotingException("Not Eligible for voting");//throw is used to display the exception
		}

	}

}
