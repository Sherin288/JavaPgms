package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> s = new ArrayList<String>();
		s.add("Mango");
		s.add("Apple");
		s.add("Dates");
		
		System.out.println(s);
		
		Iterator <String> i = s.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		i.remove(); // is used to remve last element
		System.out.println(s);
		
		

	}

}
