package OOP_Encapsulation;

public class Browser {

	public void launchBrowser() {
		System.out.println("trying to launch browser");
		checkRAM();
		checkVersion();
		checkOS();
		checkBrowserServices();
		System.out.println("chrome is launched....");
	}

	private void checkRAM() {
		System.out.println("checkRAM");
	}

	private void checkVersion() {
		System.out.println("checkVersion");
	}

	private void checkOS() {
		System.out.println("checkOS");
	}

	private void checkBrowserServices() {
		System.out.println("checkBrowserServices");
	}

}
