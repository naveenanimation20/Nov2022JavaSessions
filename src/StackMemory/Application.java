package StackMemory;

public class Application {

	public void m1() {
		System.out.println("m1 method");
		m2();
		
	}

	public void m2() {
		System.out.println("m2 method");
		m3();
		
	}

	public void m3() {
		System.out.println("m3 method");
		m1();
	}
	
	//static
//	t1
//	t2 
//	t3
	
	

	public static void main(String[] args) {
		
		Application obj = new Application();
		obj.m1();
		
		//t1();

	}

}
