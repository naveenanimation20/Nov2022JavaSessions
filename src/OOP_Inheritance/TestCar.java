package OOP_Inheritance;

public class TestCar {

	public static void main(String[] args) {
		

		BMW b = new BMW();
		b.start();// overridden
		b.stop();// inherited
		b.refuel();// inherited
		b.autoParking();// individual

		BMW.billing();
		Car.billing();
		
		BMW.display();
		b.running();
		
		b.payment("naveen@okicici");
		b.engine();

		System.out.println("-------audi----");
		Audi au = new Audi();
		au.theftSafety();
		au.start();
		au.engine();
			
		

		System.out.println("-----");

		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.payment("naveen@hdfc");
		c.engine();

		System.out.println("-----");
		// child class object can be referred by parent class ref variable
		// Top/Up Casting
		Car c1 = new BMW();
		c1.start();
		c1.stop();
		c1.refuel();
		c1.pertrolEngine();
		
		System.out.println("-----");
		
		// child class object can be referred by grand parent class ref variable
		// Top/Up Casting
		Vehicle v = new BMW();
		v.pertrolEngine();
		v.engine();

		// down casting:
		// parent class object can be referred by child class ref variable
		//BMW b1 = (BMW) new Car();// ClassCastException at runtime
		
		BMW b2 = (BMW)new Vehicle();
				
	}

}
