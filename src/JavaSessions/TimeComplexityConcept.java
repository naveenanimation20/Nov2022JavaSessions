package JavaSessions;

public class TimeComplexityConcept {

	public static void main(String[] args) {

		//BIG O : O(n) 
		
		int i = 1;
		System.out.println(i);
		
		//O(1)
		
		String s = "hello";
		System.out.println(s);
		//O(1)
		
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println(c);
		//O(1)
		
		//2 mins: 120 secs
		for(int p = 1; p<=10; p++) {
			System.out.println(p);
		}
		//O(n)
		//O(n/n')
		//1 + n + n + n => 1 + 3n => 3n+1 -- linear equation
		//3n+1 => 3n => O(3n) --> O(n)
		
		//
		for(int v=100; v<=1000; v++) {
			for(int u = 1; u<=10; u++) {
				System.out.println("hi");
			}
		}
		//(1+n+n)(1+n+n+n)
		//(1+2n)(1+3n)=>1+3n+2n+6n^2 => 6n^2 + 5n + 1 ==> Quadretic equation: n^2+n+1
		//6n^2 + 5n + 1 ==> 6n^2 + 5n ==> n(6n + 5) ==> n(6n)=> n^2 ==> O(n^2)
		
		
		for(int p = 1; p<=100000000; p++) {
			System.out.println(p);
		}//n
		
		for(int p = 1; p<=100000000; p++) {
			System.out.println(p);
		}//n
		//n+n => 2n ==> O(n)
		
		
		for(int v=1; v<=10; v++) {
			for(int u = 1; u<=10; u++) {
				for(int l=1;l<=10;l++) {
					System.out.println("hi");

				}
			}
		}
		//(1+n+n)(1+n+n)(1+n+n+n) -- O(n^3)
		
		
	
		
	}

}
