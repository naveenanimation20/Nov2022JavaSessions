package JavaSessions;

public class SwitchCaseConcept {

	public static void main(String[] args) {

		String browser = "ie";

		switch (browser) {
		case "chrome":
			System.out.println("chrome is launched");
			break;
		case "firefox":
			System.out.println("ff is launched");
			break;
		case "safari":
			System.out.println("safari is launched");
			break;
		case "edge":
			System.out.println("edge is launched");
			break;
		default:
			System.out.println("invalid browser....plz pass the right browser");
			break;
			
		case "naveen":
			System.out.println("naveen is launched");
			break;
		}
		
		
		//
		int marks = 90;
		switch (marks) {
		case 90:
			System.out.println("grade A");
			break;
		case 80:
			System.out.println("grade B");
			break;
		case 70:
			System.out.println("grade C");
			break;	

		default:
			System.out.println("FAIL");
			break;
		}
		
		//
//		float weight = 75.5f;
//		switch (weight) {
//		case value:
//			
//			break;
//
//		default:
//			break;
//		}
		
		//
		char ch = 'z';
		switch (ch) {
		case 'a':
			System.out.println("vowel");
			break;
		case 'e':
			System.out.println("vowel");
			break;	
		case 'i':
			System.out.println("vowel");
			break;
		case 'o':
			System.out.println("vowel");
			break;
		case 'u':
			System.out.println("vowel");
			break;	

		default:
			System.out.println("not a vowel");
			break;
		}
		
		//byte, short, int, String, char
//		byte num = 100;
//		switch (num) {
//		case value:
//			
//			break;
//
//		default:
//			break;
//		}
		
//		float pop = 12.22f;
//		switch (pop) {
//		case value:
//			
//			break;
//
//		default:
//			break;
//		}
		
		
		
		//
		//real time of switch case use cases:
		//1. cross browser logic
		//2. ecomm - multiple countries - langauge
		//3. multi environment: DEV, QA, STAGE, UAT, PROD
		//4. API methods: GET, POST, PUT, DELETE
		//5. DropDown: Single, Multiple, All
		//6. Payment Methods: CC, UPI, PAYPAL, Xoom, WU, BANK
		
		
		

	}

}
