package WebDriver_Arch;

public class NaveenAutomationAppTest {
	  
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		//chrome:
		//ChromeDriver driver = new ChromeDriver();
		
		//FirefoxDriver driver = new FirefoxDriver();
		
		//SafariDriver driver = new SafariDriver();
		
		String browser = "naveen";
		
		
		//cross browser logic: top casting
		if(browser.equals("chrome")) {
			driver = new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		else if(browser.equals("safari")) {
			driver = new SafariDriver();
		}
		
		else {
			System.out.println("plz pass the right browser name....");
		}
		
		driver.get("https://www.naveenautomationlabs.com");
		
		String actualTitle = driver.getTitle();
		System.out.println("page title : " + actualTitle);
		
		if(actualTitle.equals("Naveen Automation Labs")) {
			System.out.println("title is correct");
		}
		else {
			System.out.println("in correct title");
		}
		
		driver.sendKeys("emailId", "naveen@gmail.com");
		driver.sendKeys("password", "naveen@123");
		driver.click("loginBtn");
		
		driver.close();
		
	}

}
