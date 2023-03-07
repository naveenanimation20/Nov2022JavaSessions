package BuilderPattern;

public class UserShopping {

	public static void main(String[] args) {

		EcommApplication app = new EcommApplication();
		
		app.login("naveen@gmail.com", "naveen@123")
			.doSearch("macbook pro")
				.addToCart("macbook pro")
					.doPayment("1212 1212 1313 1444", 899)
						.generateOrder()
							.logout();
		
		System.out.println("------");
		//
		app.login("naveen@gmail.com", "naveen@123")
			.doSearch("tshirt", 5000, "Nike")
				.addToCart("tshirt")
					.logout();
		
		System.out.println("------");
		app.login("naveen@gmail.com", "naveen@123")
			.addToCart("tshirt")
				.doPayment("naveen@hdfc")
					.generateOrder()
							.logout();
		
		
		System.out.println("------");
		app.login("naveen@gmail.com", "naveen@123")
			.logout();
		
		
		//
		EcommApplication app1 = new EcommApplication();


		
		System.out.println('\u0000');
		
		
	}

}
