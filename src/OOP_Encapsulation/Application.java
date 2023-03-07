package OOP_Encapsulation;

public class Application {

	String name;
	

	public void m1() {
		
		//call static method from non static method:
		//no need to create the object:
		t2();
		
		System.out.println("m1 method");
		name = "Naveen";
		System.out.println(name);
		m2();
	}

	public void m2() {
		System.out.println("m2 method");
		name = "Ravi";
		m3();
	}

	public void m3() {
		System.out.println("m3 method");
	}

	public static void t1() {
		
		//non static method from static method:
		Application a1 = new Application();
		a1.m1();
		a1.name = "Tom";
		
		System.out.println("t1 method");
		t2();
	}

	public static void t2() {
		System.out.println("t2 method");
		t3();
	}

	public static void t3() {
		System.out.println("t3 method");
	}

	public static void main(String[] args) {

		Application app = new Application();
		app.m1();
		System.out.println(app.name);
		
		Application.t1();
		
		

	}

}
