package BuilderPattern;

public class EcommApplication {

	public EcommApplication login() {
		System.out.println("login to app");
		return this;
	}

	public EcommApplication login(String un, String pwd) {
		System.out.println("login to app : " + un + ":" + pwd);
		return this;
	}

	public EcommApplication doSearch(String productName) {
		System.out.println("search product: " + productName);
		return this;
	}

	public EcommApplication doSearch(String productName, int price) {
		System.out.println("search product: " + productName + ": price " + price);
		return this;

	}

	public EcommApplication doSearch(String productName, int price, String brand) {
		System.out.println("search product: " + productName + ": price " + price + " brand " + brand);
		return this;

	}

	public EcommApplication addToCart(String productName) {
		System.out.println("adding to cart: " + productName);
		return this;
	}

	public EcommApplication doPayment(String cc, int cvv) {
		System.out.println("making payment using : " + cc + ":" + cvv);
		return this;
	}

	public EcommApplication doPayment(String upi) {
		System.out.println("making payment using : " + upi);
		return this;

	}

	public EcommApplication doPayment(String paypalID, String password) {
		System.out.println("making payment using : " + paypalID + ":" + password);
		return this;

	}

	public EcommApplication generateOrder() {
		System.out.println("your order id is : " + 12345);
		return this;
	}

	public EcommApplication logout() {
		System.out.println("logout");
		return this;
	}

}
