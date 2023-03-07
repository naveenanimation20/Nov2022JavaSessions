package JavaSessions;

import java.util.Arrays;

public class Student {

	// WAF:
	// give the studentName(String) as a parameter
	// return the student marks(int)

	public int getStudentMarks(String studentName) {

		System.out.println("getting student marks for : " + studentName);

		if (studentName.equals("Neha")) {
			return 100;
		}

		else if (studentName.equals("Somesh")) {
			return 90;
		}

		else if (studentName.equals("Amin")) {
			return 80;
		}

		else {
			System.out.println("student is not found...");
			return -1;
		}

	}
	
	
	public int test(int a, int b , String y) {
		System.out.println("hi");
		int total = a+b;
		if(y==null) {
			System.out.println("i got null");
		}
		return total;
	}
	

	public static void main(String[] args) {
		
		Student st = new Student();
		int m1 = st.getStudentMarks("Neha");
		System.out.println(m1);
		if(m1==-1) {
			System.out.println("no need to print marksheet");
		}
		else {
			System.out.println("print the marksheet");
		}
		
		
		st.test(10, 20, null);

	}

}
