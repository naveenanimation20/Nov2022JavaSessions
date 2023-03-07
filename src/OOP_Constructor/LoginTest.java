package OOP_Constructor;

public class LoginTest {

	public static void main(String[] args) {

		LoginPage lp1 = new LoginPage("admin@gmail.com", "admin123");

		if (lp1.doLogin()) {
			System.out.println("display the menu items");
		}

		LoginPage lp2 = new LoginPage("naveen@gmail.com", "naveen123");

		System.out.println(lp2.userName);
		System.out.println(lp2.password);

		LoginPage lp3 = new LoginPage("seller@gmail.com", "seller123");
		
			
	}
	
	
	

}


