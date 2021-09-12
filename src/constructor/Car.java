package constructor;

public class Car {
	
	String carName;
	String carYear;
	int carPrice;
	String carColor;
	String carModel;
	

	// default constructor

	public Car() {

		System.out.println("this is default constructor");

	}

	// Single Parameterized constructor
	public Car(String carName) {
		this.carName= carName;
		System.out.println("car name is "+this.carName);

	}

	// multi_parameterized constructor
	public Car(String carName, String carYear) {
		this.carName=carName;
		this.carYear=carYear;
		System.out.println(" car name is "+this.carName);
		System.out.println(" car Year is "+this.carYear);

	}

	// multi_parameterized constructor
	public Car(String carName, String carYear, int carPrice) {
		this.carName=carName;
		this.carYear=carYear;
		this.carPrice=carPrice;
		System.out.println(" car name is "+this.carName+ " car Year "+this.carYear+ " Car Price "+this.carPrice);
		
	

		
	}

	// multi_parameterized constructor
	public Car(String carName, String carYear, int carPrice, String carColor) {
		this.carName= carName;
		this.carYear=carYear;
		this.carPrice=carPrice;
		this.carColor=carColor;
		System.out.println(" car name is "+this.carName);
		System.out.println("car Year is "+this.carYear);
		System.out.println(" car Price is "+this.carPrice);
		System.out.println("car Color is "+this.carColor);
		
		
		

	}

	// multi_parameterized constructor
	public Car(String carName, String carYear, int carPrice, String carColor, String carModel) {
		this.carName= carName;
		this.carYear=carYear;
		this.carPrice=carPrice;
		this.carColor=carColor;
		this.carModel=carModel;
		
		System.out.println(" car name is "+this.carName);
		System.out.println("car Year is "+this.carYear);
		System.out.println(" car Price is "+this.carPrice);
		System.out.println(" car Color is "+this.carColor);
		System.out.println("car Model is "+this.carModel);
		
		
		

		
	}

	public static void main(String[] args) {

		Car car = new Car(); // default constructor
		Car myCarName = new Car("MBW");
		Car hisCarYear = new Car("Audi", "2020");
		Car herCarPrice = new Car("Mercedes", "2021", 80000);
		Car wifeCarColor = new Car("Ford", "2019", 12000, "Blue");
		Car myCarModel = new Car("huyndai", "2016", 22000, "Silver", "sonata Sport");
	 
	}

}
