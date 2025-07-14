package accessmodifier;

import protectedaccessmodifier.ProtectedClass;

public class ChildClassProtected extends ProtectedClass { // here protected variable is used outside
 //another package using inhertance , inherit the class and create object of child class and access the protected variable                                               
	public static void main(String[] args) {
	
		 ChildClassProtected c = new  ChildClassProtected();
		 c.display();

	}

}
