package JavaSessions;

public class ConditionalOpertors {

	public static void main(String[] args) {

		int i = 100;
		int j = 20;
		
		if(i==j) {
			System.out.println("both are equal");
		}
		else {
			System.out.println("both are not equal");
		}
		
		if(j>=i) {
			System.out.println("j is gr than i");
		}
		else {
			System.out.println("i is gr than j");
		}
		
		// > >= < <= == !=
		
		int total = 100;
		if(total != 100) {
			System.out.println("BYE");
		}
		else {
			System.out.println("Hi");
		}
		
		//nested if
		int marks = 101;
		if(marks<=100) {
			System.out.println("valid marks");
			if(marks>=90) {
				System.out.println("A GRADE");
					if(marks>=95) {
						System.out.println("eligible for schloarship");
							if(marks == 100) {
								System.out.println("100% fee waived off");
							}
					}
			}
			else {
				if(marks<=80) {
					System.out.println("B Grade");
				}
			}
			
		}
		else {
			System.out.println("not a valid mark");
		}
		
		
		//if if if if if else
//		String browser = "chrome";
//		if(browser.equals("chrome")) {
//			System.out.println("chrome is launched");
//		}
//		
//		if(browser.equals("firefox")) {
//			System.out.println("ff is launched");
//		}
//		
//		if(browser.equals("safari")) {
//			System.out.println("safari is launched");
//		}
//		
//		if(browser.equals("edge")) {
//			System.out.println("edge is launched");
//		}
//		
//		else {
//			System.out.println("invalid browser");
//		}
		
		
		//if-elseif
		String browser = "ie";
		if(browser.equals("chrome")) {
			System.out.println("chrome is launched");
		}
		else if(browser.equals("firefox")) {
			System.out.println("ff is launched");
		}
		else if(browser.equals("safari")) {
			System.out.println("safari is launched");
		}
		else if(browser.equals("edge")) {
			System.out.println("edge is launched");
		}
		else {
			System.out.println("invalid browser");
		}
		
	}

}
