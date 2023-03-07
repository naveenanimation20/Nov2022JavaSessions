package JavaSessions;

public class DoWhileLoopConcept {

	public static void main(String[] args) {

		
		int p = 1;
		
		do {
			System.out.println(p);
				if(p % 5 ==0) {
					System.out.println("hi");
					//break;
				}
			p++;

		} 
		while (p<=50);
		
		//use cases:
		//launch a page: element : 0, 5, 10, 20 ....n 
		
//		do {
//			//element is present : yes
//			//click on the element
//		}
//		while(cond);
		
		do {
			System.out.println("hello");
		}
		while(false);
		
		
		
	}

}
