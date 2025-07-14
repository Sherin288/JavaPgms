package multilevelinheritance;

public class BabyDog extends Dog { // child class
	 
	void displaybabydog(String s)
	{
		System.out.println("I am inside babydog called " + s);
	}

	public static void main(String[] args) {
		
		BabyDog obj = new BabyDog();
		obj.displayanimal();
		obj.displaydog();
		obj.displaybabydog("Puppy");
		

	}

}
