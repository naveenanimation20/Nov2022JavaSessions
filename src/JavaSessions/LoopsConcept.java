package JavaSessions;

public class LoopsConcept {

	public static void main(String[] args) {

		// 1 to 10
		// 1. while:

		int i = 0;

		while (i <= 10) {
			System.out.println(i);// 1 2 3 4 5 6 7 8 9 10
			// i++;
			// ++i;
			i = i + 1;
		}

		//
		while (true) {
			System.out.println("welcome to taj hotel");
			break;
		}

		//
		int p = 0;
		while (p <= 100) {
			System.out.println(p);// 0 2 4 6 8 ...... 100
			p = p + 2;
		}

		System.out.println("------------------");
		//
		int num = 1;
		while (num <= 100) {
			System.out.println(num);// 12345
			if (num % 5 == 0) {
				System.out.println("hi");// hi
				break;
			}
			num++;
		}

		//
		int n = 1;
		while (n <= 5) {
			System.out.println(n + " = " + "Anjali");
			// n++;
			++n;
		}

		//
		int counter = 100;
		while (counter >= 100) {
			System.out.println(counter);// 100

			if (counter == 200) {
				System.out.println("bye!!");
				break;
			}

			counter++;
		}

		//
		int score = 0;
		while (score <= 100) {
			
//				if(score == 25) {
//					System.out.println("score is 25...yay");
//				}
//				
//				if(score == 50) {
//					System.out.println("half century");
//				}
//				
//				if(score == 100) {
//					System.out.println("century");
//				}

			switch (score) {
			case 25:
				System.out.println(score);
				System.out.println("score is 25...yay");
				break;
			case 50:
				System.out.println(score);
				System.out.println("half century");
				break;
			case 100:
				System.out.println(score);
				System.out.println("century");
				break;

			default:
				System.out.println(score);
				break;
			}

			score++;
		}
		
		//while loop use cases:
		//1. when number of iterations are not fixed
		//2. infinite loading: linkedin, swiggy, facebook
		//3. waiting for element on the page : 5, 0, 15, 20, 
		//4. waiting for page load: 5 secs, 10, 2, 20
		//5. calendar handling
		//6. pagination in webtable
		

	}

}
