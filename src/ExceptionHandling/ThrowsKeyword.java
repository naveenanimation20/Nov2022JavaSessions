package ExceptionHandling;

public class ThrowsKeyword {

	public void m1() {
		System.out.println("m1 method");
		m2();
	}

	public void m2() {
		System.out.println("m2 method");

		try {
			m3();
			System.out.println("NAVEEENNNNN");
		} catch (ArithmeticException e) {
			System.out.println("AE is coming....");
			e.printStackTrace();
		} finally {
			System.out.println("finally bye");
			try {
				int p = 9 / 0;
			} catch (ArithmeticException e) {
				System.out.println("bye 2022");
				e.printStackTrace();
			}

		}
	}

	public void m3() throws ArithmeticException {
		System.out.println("m3 method");
		int a = 10;
		int b = 0;
		int c = a / b;
		System.out.println("end of m3");
	}

	public static void main(String[] args) {
		ThrowsKeyword obj = new ThrowsKeyword();
		obj.m1();
		System.out.println("bye");

	}

}
