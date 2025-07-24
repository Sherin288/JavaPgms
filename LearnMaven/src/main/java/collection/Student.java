	package collection;
	
	import java.util.ArrayList;
	import java.util.List;
	
	public class Student {
	
		public static void main(String[] args) {
			
			List <String> l = new ArrayList<String>();
			
			l.add("red");
			l.add("Green");
			l.add("Yellow");
			l.add("Black");
			System.out.println(l);
			
			System.out.println(l.get(2));
		
			l.set(3, "Orange");
			System.out.println(l);
			
			System.out.println(l.size());
			
			System.out.println(l.isEmpty());
			
			l.remove(1); // removed Green
			
			System.out.println(l);
			
			System.out.println(l.contains("Pink"));
			System.out.println(l.contains("red"));
			
			l.add("Yellow");
			l.add("Yellow");//duplicate yellow added twice
			System.out.println(l);
			System.out.println(l.indexOf("Yellow")); //prints index of yellow
			
			System.out.println(l.lastIndexOf("Yellow"));//prints the index last duplicate value
	
		}
	
	}
	
