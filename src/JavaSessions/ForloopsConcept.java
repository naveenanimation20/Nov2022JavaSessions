package JavaSessions;

public class ForloopsConcept {

	public static void main(String[] args) {

		// 1 to 10:
		int i=1;
		for(; i<=10; ) {
			System.out.println(i);//1 2 3 4 5 ...10
			i++;
			//++i;
			//i=i+1;
		}
		
		//
		
//		for(;;) {
//			System.out.println("Bye");
//			//break;
//		}
		//
//		for(;false;) {
//			System.out.println("Bye");
//		}
		System.out.println("------");
		//5 to 50
		for(int k = 5; k<=50; k++) {
			System.out.println(k);
				if(k % 5 == 0) {
					System.out.println("hiiiii");
					break;
				}
		}
		
		System.out.println("-----------");
		//a to z:
		for(char c='a'; c<='z'; c++) {
			System.out.println((int)c + ":" + c);
		}
		
		for(byte b=1; b<=5; b++) {
			System.out.println(b);
		}
		//
		System.out.println("-----------");
		for(double d = 1.1; d<=10.0; d++) {
			System.out.println(d);//1.1 2.1 3.1 ......9.1 
		}
		
		System.out.println("-----------");
		
		for(String s = "naveen"; s.equals("naveen"); ) {
			System.out.println("hi " + s);
			break;
		}
		
		//use cases for loop:
		//number of iterations are fixed:
		//month dropdrop: jan to dec: 
		//ecomm: categoty iterations
		//country: 
		
		
		
	}

}
