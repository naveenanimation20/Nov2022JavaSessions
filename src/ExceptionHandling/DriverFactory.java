package ExceptionHandling;

public class DriverFactory {

	public static void main(String[] args) {

		String browser = null;

		if (browser == null) {

			try {
				throw new Exception("browser not found");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		else {
			System.out.println("browser is launched");
			
		}

	}

}
