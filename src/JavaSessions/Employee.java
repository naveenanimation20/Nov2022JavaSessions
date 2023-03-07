package JavaSessions;

public class Employee {

	// class : category of Objects, blueprint/template of objects
	// object: is the physical entity

	// class vars:
	String name;
	int age;
	String city;
	double salary;

	public static void main(String[] args) {

		// create the object of the class:
		// using new keyword
		Employee e1 = new Employee();
		e1.name = "Tom";
		e1.age = 25;
		e1.city = "LA";
		e1.salary = 12.33;

		System.out.println(e1.name + " " + e1.age + " " + e1.city + " " + e1.salary);

		//
		Employee e2 = new Employee();

		System.out.println(e2.name);
		System.out.println(e2.age);
		System.out.println(e2.salary);

		//
		Employee e3 = new Employee();
		e3 = null;// Null reference object

		// e3.name = "naveen";//NPE

		e3 = new Employee();

		// object without references - No ref object
		new Employee().name = "Naveen";
		new Employee().age = 25;
		new Employee().salary = 12.33;
		new Employee().city = "Pune";

		System.gc();

		// naveen tom naveen ravi naveen
		// c = 0
		// e.equals(naveen)--> c++
		// print - c
		

	}

}
