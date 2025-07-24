package collection;

import java.util.ArrayList;
import java.util.List;

public class Numbers {

	public static void main(String[] args) {
		
		List <Integer> l = new ArrayList<Integer>();
		
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
