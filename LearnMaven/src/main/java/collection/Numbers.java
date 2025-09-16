package collection;

import java.util.ArrayList;
import java.util.List;

public class Numbers {

	public static void main(String[] args) {
		
		List <Integer> l = new ArrayList<Integer>();
		List <String> s = new ArrayList<String>();
		
		s.add("one");
		s.add("two");
		s.add("three");
		
		System.out.println(s.get(2));
		
		s.set(2, "Five");
		
		System.out.println(s.isEmpty());
		
		System.out.println(s);
		
		l.add(10);
		l.add(25);
		l.add(35);
		
		System.out.println(l);
		
		for (Integer x : l)
		{
			System.out.println(x);
		}
		

	}

}
