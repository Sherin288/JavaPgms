package collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Fruits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set <String> s1 = new HashSet<String>(); // we can use hashset class or treeset class
		Set <String> s2 = new TreeSet<String>();
		s1.add("Apple");
		s1.add("Orange");
		s1.add("Pineapple");
		s1.add("Mango");
		s2.add("Dates");
		s2.add("Fig");
		s2.add("Apricot");
		System.out.println(s1);
		System.out.println(s2);
		s2.addAll(s1); // s1 is added to s2 in unordered manner
		System.out.println(s2);
		
		System.out.println(s1.size());//find size of s1
		System.out.println(s2.isEmpty());//find if there is any element in s2
		
		System.out.println(s2.contains("Fig"));//finds if the element fig is present in s2
		System.out.println(s1.containsAll(s2));//finds if element in s2 is present in s1
		System.out.println(s2.containsAll(s1));//finds if elements in s1 is present in s2
		
		s1.remove("Pineapple");//remove element pineapple from s1
		System.out.println(s1);
		System.out.println(s2);
		s2.removeAll(s1);//remove elements of s1 from s2
		System.out.println(s2);
		
		s1.clear();//clears all the values in s1
		System.out.println(s1);

	}

}
