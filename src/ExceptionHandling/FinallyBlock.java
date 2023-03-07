package ExceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {

		
		System.out.println("hi");
		
		try {
			int i = 9/0;
		}
		catch(ArithmeticException e) {
			System.out.println("AE is coming....");
			e.printStackTrace();
		}
		finally {
			System.out.println("finally block.....");
		}
		
		System.out.println("bye");
		
		
		//connect with DB - oracle --- PASS
		//un, pwd, server ip: port
		//hit the SQL -- PASS
		//try{
		//get the result from DB --- FAIL -- exception//PASS
		//	}
		//catch(){log }
		//finally{
		//disconnect with DB
		
		//}
		
		System.out.println("coninue shopping");
		//logout
		
		
		
		
		
		
		
		
	}

}
