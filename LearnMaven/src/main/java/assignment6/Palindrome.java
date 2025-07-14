package assignment6;

public class Palindrome {
	
	public void reverse(String v1) {
		
		String rev = "";
		
		for (int i = v1.length()-1 ; i>=0 ;i--)
		{
			rev = rev + v1.charAt(i);
		}
		
		if (v1.equals(rev))
		{
			System.out.println(v1 +" is Paliandrome.");
		}
		else
			System.out.println(v1 + " is not paliandrome");
	}

	public static void main(String[] args) {
		
		Palindrome p = new Palindrome();
		p.reverse("java");
		p.reverse("malayalam");

	}

}
