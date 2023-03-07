package JavaSessions;

public class Car {

	String name;
	int price;
	String color;
	static final int wheels = 4;
	static int steering;
	
	static int i = 10;
	
	public void start() {
		System.out.println("Car -- start");
	}
	
	public static void speedTest() {
		System.out.println("Car -- speed test");
	}
	

	public static void main(String[] args) {
		
		final int i=10;
		System.out.println(i);
		
		final int days = 7;
		System.out.println(days * 100);
		
		
		Car c1 = new Car();
		c1.name = "BMW";
		c1.price = 90;
		c1.color = "Red";

		Car c2 = new Car();
		c2.name = "Audi";
		c2.price = 80;
		c2.color = "White";

		Car c3 = new Car();
		c3.name = "Honda";
		c3.price = 20;
		c3.color = "Black";
		
		
		//how to access/assign static variables:
		//no need to use the object
		//1. direct calling:
		System.out.println(wheels);
		System.out.println(c1.name + " " + c1.price + " "+ c1.color + " " + wheels);
		
		//2. by using class name:
		System.out.println(c1.name + " " + c1.price + " "+ c1.color + " " + Car.wheels);
		
		//how to call static methods:
		//no need to use the object
		//1. direct calling:
		speedTest();
		c1.start();
		
		//2. by using class name:
		Car.speedTest();
		
		//static stuff can be accessed by obj ref name with warning:
		c1.speedTest();
		System.out.println(c1.wheels);
		
		Car.steering = 1;
		System.out.println(Car.steering);
		
		System.out.println(Application.i);
		System.out.println(Car.i);
		
		
	}

}
