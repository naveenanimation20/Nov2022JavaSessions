package JavaSessions;

public class StringConcatenation {

	public static void main(String[] args) {

		String x = "hello";
		String y = "world";
		
		int a = 100;
		int b = 200;
		
		System.out.println(x);
		System.out.println(y);
		
		System.out.println(x+y);
		System.out.println(a+b);
		
		System.out.println(x+a);
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);//helloworld100200
		
		System.out.println(x+y+(a+b));//helloworld300
		
		System.out.println(a+b+x+y+a+b);
		
		double d1 = 12.33;
		double d2 = 23.44;
		System.out.println(x+y+d1+d2);
		
		System.out.println("the value of a : " + a);
		System.out.println("the value of b : " + b);
		System.out.println("the sum is : " + (a+b));
		
		System.out.println(1200);
		
		String ph = "9898989898";
		String p1 = "+00189898989";
		String ssn = "898989899999999999999999999999999999999";
		
		String ac = "98";
		int pp = Integer.parseInt(ac)+1;
		System.out.println(pp);
		
	}

}
