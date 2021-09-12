package basic;

public class LearnNestedClass {

	// Nested class= child class

	// parent class: we can create main method
	
	int number=23;
	static String name="iddir";

	public static void main(String[] args) {

		System.out.println("this is from parent class");
		
		MyCar mc= new MyCar();
		System.out.println(mc.employeeId);
		System.out.println(MyCar.employeeName);

	}

	// create another class inside the parent class
	public static class MyCar {

		int employeeId = 102; // non static variable
		static String employeeName = "james"; // static variable

		public static void main(String[] args) {

			System.out.println("this is from child class");
			
			// call a non static variable: Create object and call by object name
			
			MyCar car = new MyCar();
			System.out.println(car.employeeId);
			System.out.println(MyCar.employeeName);
			
			// create object of parent class inside child class
			LearnNestedClass learn = new LearnNestedClass();
			System.out.println(learn.number);
		    System.out.println(	LearnNestedClass.name);
			
			
			
			
		}

	}

}
