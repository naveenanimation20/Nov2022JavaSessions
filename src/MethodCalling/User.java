package MethodCalling;

public class User {

	// 1. const
	// 2. methods - encapsulation -- setter/getter
	// 3. builder pattern
	// 4. const is calling another const..it should be the first statement
	// 5. can be used in method to call another method in the same class

	private String name;
	int age;
	String city;
	
	static double salary;

	public User(String name, int age, String city) {
		this(city);
		this.name = name;
		this.age = age;
		this.city = city;

	}

	public User(String city) {
		this.city = "Paris";
	}
	
	public User(String city, int age) {
		this.city = "Paris";
	}

	public void login(String un, String pwd, User us) {
		logout();
		name = "tom";
		User.salary = 12.33;
	}

	public void logout() {
		int x = 10;
	}
	
	

	public static void main(String[] args) {

		User u1 = new User("Gaurav", 30, "Bangalore");

		System.out.println(u1.name);
		System.out.println(u1.age);
		System.out.println(u1.city);
		
			String un = "admin";
			String pwd = "admin";
			u1.login(un, pwd, u1);

	}

}
