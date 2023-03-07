package JavaSessions;

public class DataTypesConcept {

	//method
	public static void main(String[] args) {

		//data types in java:
		
		//two types:
		//1. primitive data types: no need to use object
			//Integral:
				//Integer: byte, short, int, long
				//character: char
			//Floating-point: float, double
			//Boolean : boolean(true/false)
		
			
		
		//2. non primitive data types: need object : String, Array, Interface, Class
		
		
		
		//1. byte:
		//size: 1 byte = 8 bits
		//range: -128 to 127
		byte b = 10;
		b = 30;
		byte b1 = 20;
		byte b2 = 40;//1 byte = 8 bits
		byte t2 = 1;//1 byte
		byte age = 40;
		
		System.out.println(b);
		System.out.println(b1);
		
		System.out.println(b1+b2);
		byte b11 = 127;
		byte t1 = 0;
		
		
		//2. short:
		//size: 2 bytes = 2x8 = 16 bits
		//range: -32768 to 32767
		short sh = 500;
		short sh1 = -300;
		
		System.out.println(sh+sh1);
		
		//3. int:
		//size: 4 bytes = 4x8 = 32 bits
		//range: -2147483648 to 2147483647
		int i = 1000000;
		int j = 1; //4 bytes
		int k = 3000;
		byte l = 20;
		System.out.println(k+l);
		
		//4. long:
		//size: 8 bytes = 8x8 = 64 bits
		//range: 
		long num = 989765449l;
		long n = 9999898989L;
		System.out.println(n);
		
		long ph = 9898989898l;
		long cc = 12121212121212121L;
		
		//float:
		//size: 4 bytes = 4x8 = 32 bits
		//range: upto 7 digits after decimal
		float n1 = 12.33f;
		System.out.println(n1);
		float n2 = (float)23.44;
		System.out.println(n2);
		float n3 = 100;
		System.out.println(n3);
		float n4 = 1.1f;
		float n5 = 0.9f;
		
		//double:
		//size: 8 bytes = 8x8 = 64 bits
		//range: upto 16 digits after decimal
		double d = 12.33333888989;
		double d1 = 200;
		System.out.println(d1);
		
		//char: 
		//size: 2 bytes = 16 bits
		char c1 = 'a';//a-z 
		char c11 = 'b';
		char c2 = '1';//0-9
		char c3 = 'Z';//A-Z
		char c4 = '$';
		
		char gender = 'f';
		char status = 'Y';
		
		System.out.println(c1);//a
		System.out.println(c1+c11);//97+98 = 195
		System.out.println(c11-c1);
		//ASCII value -- table
		//a-z : 97 to 122
		//A-Z: 65 to 90
		//0-9: 48 to 57
		char r1 = '0';//48
		char r2 = '9';//57
		System.out.println(r1+r2);
		System.out.println(r1 * r2);
		System.out.println(r1);
		
		char u1 = 'a';
		char u2 = 'b';
		System.out.println(u1+""+u2);//ab
		
		System.out.println((int)u1);//97
		System.out.println((byte)u2);//98
		
		System.out.println((int)u1 + (int)u2);
		System.out.println(u1+0);//97+0 = 97
		System.out.println(u1+'0');//97+48=145

		
		//boolean:
		//size: ~ 1 bit
		boolean fg = true;
		boolean fg1 = false;
		System.out.println(fg);
		
		System.out.println(1+2);
		System.out.println('a'+'b');
		System.out.println(100);
		System.out.println(1);
		
		
	}

}
