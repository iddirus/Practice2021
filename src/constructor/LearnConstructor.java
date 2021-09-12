package constructor;

public class LearnConstructor {

	// constructor should be same as class name
	// constructor has no return type (use keyword void)
	// constructor is used to initialize objects
	// for parameterized constructor we have to follow the data type signature pattern or variable declaration pattern 

	// syntax : AccessModifier className/constructor(){}

	public LearnConstructor() { // start point
		// default constructor
		// Non parameterized constructor

		System.out.println("hello");
		int num1 = 20;
		int num2 = 45;
		int total = num1 + num2;
		System.out.println(total);

	} // end point

	public LearnConstructor(String stName) { // single parameterized constructor
		
		
		
		
		

	}

	public static void main(String[] args) {
		// create object of constructor
		// classNmae objectName = new ConstructorOfClass();

		LearnConstructor learnConstructor = new LearnConstructor();

	}

}
